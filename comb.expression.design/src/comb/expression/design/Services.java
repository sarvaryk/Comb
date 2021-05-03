package comb.expression.design;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Queue;

import batmonGen.Automaton;
import batmonGen.State;
import batmonGen.State.SetType;
import batmonGen.Transition;
import comb.expression.metamodel.comb.Element;
import comb.generator.action.automaton.AutomatonUtils;
 
public class Services {
	private static Optional<Automaton> optional_nfa;
	private static Optional<Automaton> optional_negated_nfa;
	
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
			else
				result = String.join(" ; ", shortestTrace);
			
			return result;
		}
		
		return "";
	}
	
	public String evaluateShortestSatisfyingTrace(final Element element) {
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
			else
				result = String.join(" ; ", shortestTrace);
			
			return result;
		}
		
		return "";
	}
	
	
	public String evaluateShortestViolationTrace(final Element element) {
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
			else
				result = String.join(" ; ", shortestTrace);
			
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
}
