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
			Automaton dfa_original = AutomatonUtils.getDFA(element);
			Automaton dfa_negated = AutomatonUtils.getDFA(element, true);
			Automaton fsm = Transform.DFAtoFSM(dfa_original, dfa_negated);
			
			Generator.generate(fsm, null, filePath);
			
			InfoUtils.showMessageDialog("Monitor and its compontnts saved successfully!\nSee: " + filePath);
		} catch (Exception e) {
			e.printStackTrace();
			InfoUtils.showMessageDialog("ERROR while generating monitor!\n" + e);
		}
		
		return null;
	}	

}
