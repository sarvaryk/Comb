package comb.expression.design;

import batmonGen.Automaton;
import batmonGen.State;
import batmonGen.State.SetType;
import comb.expression.metamodel.comb.Element;
import comb.generator.action.automaton.AutomatonUtils;
 
public class Services {
	public boolean evaluateIsAlwaysTrue(final Element element) {
		boolean alwaysTrue = true;
		
		Automaton dfa = AutomatonUtils.getDFA(element);
		for(State state : dfa.getStates()) {
			if(!state.getSetType().equals(SetType.Good))
				alwaysTrue = false;
		}
		
		return alwaysTrue;
	}
	
	public boolean evaluateIsAlwaysFalse(final Element element) {	
		boolean alwaysFalse = true;

		Automaton dfa = AutomatonUtils.getDFA(element);
		for(State state : dfa.getStates()) {
			if(!state.getSetType().equals(SetType.Bad))
				alwaysFalse = false;
		}
		
		return alwaysFalse;
	}
}
