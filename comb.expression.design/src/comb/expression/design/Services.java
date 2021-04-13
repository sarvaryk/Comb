package comb.expression.design;

import batmonGen.Automaton;
import comb.expression.metamodel.comb.Element;
import comb.generator.action.automaton.AutomatonUtils;
 
public class Services {
	public boolean evaluateIsAlwaysTrue(final Element element) {
		boolean alwaysTrue = true;
		
		Automaton dfs = AutomatonUtils.getDFA(element);
		
		return alwaysTrue;
	}
	
	public boolean evaluateIsAlwaysFalse(final Element element) {	
		boolean alwaysFalse = true;

		Automaton dfs = AutomatonUtils.getDFA(element);
		
		return alwaysFalse;
	}
}
