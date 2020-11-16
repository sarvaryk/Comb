package comb.generator.action;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import comb.expression.metamodel.comb.impl.ElementImpl;

public class GenerateCombExpressionHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		
		final ElementImpl element = (ElementImpl)firstElement;
		
		final GenerateCombExpression generator = new GenerateCombExpression();
		try {
			generator.generate(element);
		} 
		catch (CoreException e) {
			e.printStackTrace();
			throw new ExecutionException("Error", e);
		}

		return null;
	}

}
