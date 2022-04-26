package comb.expression.design;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.Queue;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import batmonGen.Automaton;
import batmonGen.State;
import batmonGen.State.SetType;
import batmonGen.Transition;
import comb.expression.metamodel.comb.*;
import comb.generator.action.automaton.AutomatonUtils;
 
public class Services {
	private static Optional<Automaton> optional_nfa;
	private static Optional<Automaton> optional_negated_nfa;
	private static String traceElementSeparator = " -> ";	
	
	public float evaluateSatisfactionNotBefore(final Element element) {
		float limit = 0;
		
		if(element != null && !(element instanceof BasicElements)) {
			if(element instanceof Always_)
				limit = Float.POSITIVE_INFINITY;
			if(element instanceof AlwaysWithin_ || element instanceof AlwaysWithin_and_)
				limit += Float.parseFloat(element.getH().getName());
			else if(element.getL() != null)
				limit += Float.parseFloat(element.getL().getName());

			float limitP = evaluateSatisfactionNotBefore(element.getP());
			float limitQ = evaluateSatisfactionNotBefore(element.getQ());
			float limitR = evaluateSatisfactionNotBefore(element.getR());
			float limitS = evaluateSatisfactionNotBefore(element.getS());
			
			if(element instanceof _or_)
				limit += Math.min(limitP, limitQ);
			else if(element instanceof _and_)
				limit += Math.max(limitP, limitQ);
			else if(element instanceof _implies_)
				//TODO: The result would be more accurate, if it would represent the value, when the first parameter could become false at the earliest instead of 0
				//limit += Math.min(firstParamEarliestFalse, limitQ);
				limit += Math.min(0, limitQ);
			else {
				if (element.getS() != null)
					limit += Collections.max(Arrays.asList(limitP, limitQ, limitR, limitS));
				else if (element.getR() != null)
					limit += Collections.max(Arrays.asList(limitP, limitQ, limitR));
				else if (element.getQ() != null)
					limit += Collections.max(Arrays.asList(limitP, limitQ));
				else if(element.getP() != null)
					limit += limitP;
			}
		}
		
		return limit;
	}
	
	public float evaluateSatisfactionNotAfter(final Element element) {
		float limit = 0;
		
		if(element != null && !(element instanceof BasicElements)) {
			if(!(element instanceof BooleanOperators || element instanceof Relation || element instanceof Spatial)) {
				if(element.getH() != null)
					limit += Float.parseFloat(element.getH().getName());
				else
					limit = Float.POSITIVE_INFINITY;
			}
			else {
				float limitP = evaluateSatisfactionNotAfter(element.getP());
				float limitQ = evaluateSatisfactionNotAfter(element.getQ());
				float limitR = evaluateSatisfactionNotAfter(element.getR());
				float limitS = evaluateSatisfactionNotAfter(element.getS());
				
				if(element instanceof _or_ || element instanceof _and_)
					limit += Math.max(limitP, limitQ);
				else if (element instanceof _implies_) {
					//TODO: The result would be more accurate, if it would represent the value, when the first parameter could become false at the latest instead of infinity
					//if(firstParamLatestFalse > limitQ)
					if(Float.POSITIVE_INFINITY > limitQ)
						limit = Float.POSITIVE_INFINITY;
					else
						limit += limitQ; 
				}
				else {
					if (element.getS() != null)
						limit += Collections.max(Arrays.asList(limitP, limitQ, limitR, limitS));
					else if (element.getR() != null)
						limit += Collections.max(Arrays.asList(limitP, limitQ, limitR));
					else if (element.getQ() != null)
						limit += Collections.max(Arrays.asList(limitP, limitQ));
					else if(element.getP() != null)
						limit += limitP;
				}
			}
		}
		
		return limit;
	}
	
	public boolean evaluateIsTimingContradicting(final Element element) {
		float highLimit = evaluateSatisfactionNotAfter(element);
		float lowLimit = evaluateSatisfactionNotBefore(element);
		
		return lowLimit > highLimit;
	}
	
	public boolean canEvaluationsBePerformed(final Element element) {
		optional_nfa = AutomatonUtils.getNFA(element);
		optional_negated_nfa = AutomatonUtils.getNFA(element, true);
		
		return optional_nfa.isPresent() && optional_negated_nfa.isPresent();
	}
	
	public String evaluateIsSatisfiable(final Element element) {
		if(optional_nfa.isPresent()) {
			Automaton nfa = optional_nfa.get();
			
			Boolean isSatisfiable = false;
			for(State state : nfa.getStates()) {
				if(state.isAccepting()) {
					isSatisfiable = true;
					break;
				}
			}
			return isSatisfiable.toString();
		}
		
		return "";
	}
	
	public String evaluateIsAlwaysSatisfied(final Element element) {
		if(optional_nfa.isPresent()) {
			Automaton nfa = optional_nfa.get();
			
			Boolean isAlwaysSatisfied = true;
			for(State state : nfa.getStates()) {
				if(!state.getSetType().equals(SetType.Good)) {
					isAlwaysSatisfied = false;
					break;
				}
			}
			return isAlwaysSatisfied.toString();
		}
		
		return "";
	}
	
	public String evaluateShortestAcceptingTrace(final Element element) {
		String evaluationName = "evaluateShortestAcceptingTrace";
		generateTraceInDotFormat(evaluationName+".dot", "");
		
		if(optional_nfa.isPresent()) {
			Automaton nfa = optional_nfa.get();
			
			ArrayList<String>[] traces = getShortestTraces(nfa);
			
			String notExistingTrace = "No finite trace exists, which is accepted by the requirement";
			String instantlyEvaluatedTrace = "The requirement accepts if nothing happens";
			
			ArrayList<String> shortestTrace = null;
			for(int i = 0; i < nfa.getStateCount(); i++) {			
				if(nfa.getStates().get(i).isAccepting() && (shortestTrace == null || shortestTrace.size() > traces[i].size())) {
						shortestTrace = traces[i];
				}
			}
			
			String result;
			if(shortestTrace == null)
				result = notExistingTrace;
			else if(shortestTrace.size() == 0)
				result = instantlyEvaluatedTrace;
			else {
				result = String.join(traceElementSeparator, shortestTrace);
				generateTraceInDotFormat(evaluationName+".dot", result);
			}
			
			return result;
		}

		return "";
	}
	
	public String evaluateShortestSatisfyingTrace(final Element element) {
		String evaluationName = "evaluateShortestSatisfyingTrace";
		generateTraceInDotFormat(evaluationName+".dot", "");
		
		if(optional_nfa.isPresent()) {
			Automaton nfa = optional_nfa.get();
			
			ArrayList<String>[] traces = getShortestTraces(nfa);
			
			String notExistingTrace = "No finite trace exists, which ensures the satisfaction of the requirement";
			String instantlyEvaluatedTrace = "The requirement is instantly satisfied";
			
			ArrayList<String> shortestTrace = null;
			for(int i = 0; i < nfa.getStateCount(); i++) {			
				if(nfa.getStates().get(i).getSetType() == SetType.Good && (shortestTrace == null || shortestTrace.size() > traces[i].size())) {
						shortestTrace = traces[i];
				}
			}
			
			String result;
			if(shortestTrace == null)
				result = notExistingTrace;
			else if(shortestTrace.size() == 0)
				result = instantlyEvaluatedTrace;
			else {
				result = String.join(traceElementSeparator, shortestTrace);
				generateTraceInDotFormat(evaluationName+".dot", result);
			}
			
			return result;
		}
		
		return "";
	}
	
	public String evaluateShortestViolationTrace(final Element element) {
		String evaluationName = "evaluateShortestViolationTrace";
		generateTraceInDotFormat(evaluationName+".dot", "");
		
		if(optional_negated_nfa.isPresent()) {
			Automaton nfa_negated = optional_negated_nfa.get();
			
			ArrayList<String>[] traces = getShortestTraces(nfa_negated);
			
			String notExistingTrace = "No finite trace exists, which ensures the violation of the requirement";
			String instantlyEvaluatedTrace = "The requirement is instantly violated";
			
			ArrayList<String> shortestTrace = null;
			for(int i = 0; i < nfa_negated.getStateCount(); i++) {			
				if(nfa_negated.getStates().get(i).getSetType() == SetType.Good && (shortestTrace == null || shortestTrace.size() > traces[i].size())) {
						shortestTrace = traces[i];
				}
			}
			
			String result;
			if(shortestTrace == null)
				result = notExistingTrace;
			else if(shortestTrace.size() == 0)
				result = instantlyEvaluatedTrace;
			else {
				result = String.join(traceElementSeparator, shortestTrace);
				generateTraceInDotFormat(evaluationName+".dot", result);
			}
			
			return result;
		}

		return "";
	}
	
	private ArrayList<String>[] getShortestTraces(final Automaton automaton) {
		boolean[] visited = new boolean[automaton.getStateCount()];
		ArrayList<String>[] traces = new ArrayList[automaton.getStateCount()];
		for(int i = 0; i < automaton.getStateCount(); i++) {
			traces[i] = new ArrayList<String>();
		}
		
		Queue<String> waiting = new ArrayDeque<>();
		Queue<String> preds = new ArrayDeque<>();
		Queue<String> hops = new ArrayDeque<>();
		
		waiting.add(automaton.getInitState().getName());

		String pred;
		String current;
		while(!waiting.isEmpty()) {
			current = waiting.remove();
			int current_index = automaton.getStates().indexOf(automaton.getState(current));

			if(!current.equals(automaton.getInitState().getName())) {
				pred = preds.remove();
				int pred_index = automaton.getStates().indexOf(automaton.getState(pred));
				traces[current_index].addAll(traces[pred_index]);
				traces[current_index].add(hops.remove());
			}
			
			visited[current_index] = true;
			
			for(Transition transition : automaton.getState(current).getTransitions()) {
				int next_index = automaton.getStates().indexOf(automaton.getState(transition.getDestinationStateName()));
				if(!visited[next_index] && !waiting.contains(transition.getDestinationStateName())) {
					waiting.add(transition.getDestinationStateName());
					preds.add(current);
					hops.add(transition.getLabel().getName());
				}
			}
		}
		
		return traces;
	}
	
	private void generateTraceInDotFormat(String fileName, String trace) {
		try {
			trace = trace.replace("(", "").replace(")", "").replace("!", "NOT ");
			String[] traceElements = trace.split(traceElementSeparator);
			String[] traceElementLabels = new String[traceElements.length];
			String[] traceElementIDs = new String[traceElements.length];
			
			for (int i = 0; i < traceElements.length; i++) {
				traceElementLabels[i] = String.format("\"%d\"[label=\"%s\"]", i, traceElements[i]);
				traceElementIDs[i] = String.format("%d", i);
			}
			trace = String.join(traceElementSeparator, traceElements);
			
			Bundle bundle = Platform.getBundle("comb.examples");
			URI fileURI = FileLocator.resolve(bundle.getEntry(File.separator)).toURI();
			String filePath = Paths.get(fileURI).toString();
			filePath = Paths.get(filePath, fileName).toString();
			
			FileWriter myWriter = new FileWriter(filePath);
		    myWriter.write("digraph {" + "\n" + 
		    			"\t" + "rankdir=\"LR\";" + "\n" + 
		    			"\t" + String.join(" ", traceElementLabels) + "\n" + 
		    			"\t" + String.join(traceElementSeparator, traceElementIDs) + "\n" + 
		    		"}");
		    myWriter.close();
		} catch (URISyntaxException | IOException e1) {
			e1.printStackTrace();
		}
	}
}
