package comb.generator.action;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import batmonGen.AutomataAbcNotEqualsException;
import batmonGen.Automaton;
import batmonGen.Generator;
import batmonGen.Transform;
import comb.expression.metamodel.comb.impl.ElementImpl;
import comb.generator.action.automaton.AutomatonUtils;

public class GenerateMonitorHandler extends AbstractHandler {
	private static int TIMEOUT = 60;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		
		final ElementImpl element = (ElementImpl)firstElement;
		
		try {
			Optional<Automaton> nfa_original_optional = AutomatonUtils.getNFA(element);
			Optional<Automaton> nfa_negated_optional = AutomatonUtils.getNFA(element, true);
			
			if(nfa_original_optional.isPresent() && nfa_negated_optional.isPresent()) {
				String filePath = InfoUtils.getTargetFilePath("Save monitor to (directory):");
				
				CompletableFuture.supplyAsync(() -> generateMonitor(nfa_original_optional, nfa_negated_optional, filePath)).get(TIMEOUT, TimeUnit.SECONDS);
			}
			else
				InfoUtils.showMessageDialog("ERROR: Monitor generation is supported only for LTL with Spin output.");
				
		} catch (TimeoutException e) {
			e.printStackTrace();
			InfoUtils.showMessageDialog("Generation terminated, timeout reached while generating monitor!\n" + e);
		} catch (Exception e) {
			e.printStackTrace();
			InfoUtils.showMessageDialog("ERROR while generating monitor!\n" + e);
		}
		
		return null;
	}	
	
	private static boolean generateMonitor(Optional<Automaton> nfa_original_optional, Optional<Automaton> nfa_negated_optional, String filePath) {
		boolean success = true;
		try {
			Automaton nfa_original = nfa_original_optional.get();
			Automaton nfa_negated = nfa_negated_optional.get();
			
			Automaton dfa_original = Transform.NFAtoDFA(nfa_original);
			Automaton dfa_negated = Transform.NFAtoDFA(nfa_negated);
		
			Automaton fsm = Transform.DFAtoFSM(dfa_original, dfa_negated);
			
			Generator.generate(fsm, null, filePath);
			
			InfoUtils.showMessageDialog("Monitor and its components saved successfully!\nSee: " + filePath);
		} catch (AutomataAbcNotEqualsException e) {
			success = false;
			e.printStackTrace();
			InfoUtils.showMessageDialog("ERROR while generating monitor!\n" + e);
		}
		return success;
	}

}
