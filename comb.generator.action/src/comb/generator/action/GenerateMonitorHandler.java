package comb.generator.action;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import batmonGen.Automaton;
import batmonGen.Generator;
import batmonGen.Transform;
import comb.expression.metamodel.comb.impl.ElementImpl;
import comb.generator.action.automaton.AutomatonUtils;

public class GenerateMonitorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		
		final ElementImpl element = (ElementImpl)firstElement;
		
		String filePath = InfoUtils.getTargetFilePath("Save monitor to (directory):");
		
		try {
			Automaton nfa_original = AutomatonUtils.getNFA(element);
			Automaton nfa_negated = AutomatonUtils.getNFA(element, true);
			
			//Creating DFA from NFA could result in 2^(number of NFA states).
			//In case of an NFA consisting of 17 states could result in a DFA,
			//which has 2^17 = 131072 states. The tool can not handle this in feasible time.
			if(nfa_original.getStateCount() < 17 && nfa_negated.getStateCount() < 17) {
				Automaton dfa_original = Transform.NFAtoDFA(nfa_original);
				Automaton dfa_negated = Transform.NFAtoDFA(nfa_negated);
				Automaton fsm = Transform.DFAtoFSM(dfa_original, dfa_negated);
				
				Generator.generate(fsm, null, filePath);
				
				InfoUtils.showMessageDialog("Monitor and its compontnts saved successfully!\nSee: " + filePath);
			}
			else {
				double max_number_of_dfa_original_states = Math.pow(2, nfa_original.getStateCount());
				double max_number_of_dfa_negated_states = Math.pow(2, nfa_negated.getStateCount());
				double max_number_of_fsm_states = max_number_of_dfa_original_states * max_number_of_dfa_negated_states;
				InfoUtils.showMessageDialog("Monitor generation can not be completed, as the generated monitor (in worst case) could consist of " + max_number_of_fsm_states + " states!");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
			InfoUtils.showMessageDialog("ERROR while generating monitor!\n" + e);
		}
		
		return null;
	}	

}
