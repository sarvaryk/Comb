package comb.generator.action.automaton;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import comb.expression.metamodel.comb.Element;

public class SMFormatHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		
		final Element element = (Element)firstElement;
		
		AutomatonUtils.saveBuchi(element, gov.nasa.ltl.graphio.Writer.Format.SM, true);
		
		return null;
	}

}
