package comb.expression.design;

import batmonGen.Automaton;
import batmonGen.State;
import batmonGen.State.SetType;
import comb.expression.metamodel.comb.Element;
import comb.generator.action.automaton.AutomatonUtils;
 
public class Services {
	private static Automaton nfa;
	
	public boolean canEvaluationsBePerformed(final Element element) {
		nfa = AutomatonUtils.getNFA(element);
		
		return nfa != null;
	}
	
	public String evaluateIsSatisfiable(final Element element) {
		if(nfa != null) {
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
		if(nfa != null) {
			Boolean isAlwaysSatisfied = true;
			
			for(State state : nfa.getStates()) {
				if(!state.getSetType().equals(SetType.Good) || !state.isStateComplete(nfa)) {
					isAlwaysSatisfied = false;
					break;
				}
			}
			
			return isAlwaysSatisfied.toString();
		}
		
		return "";
	}
}
