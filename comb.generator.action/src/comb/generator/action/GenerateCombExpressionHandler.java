package comb.generator.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

		try {
			final String filePath = CombExpressionUtils.getTargetFilePath("Extract temporal logic as:");;

			List<String> content = new ArrayList<>();
			content.add(element.getSubtreeInterpretation());
			content.add(element.getLogicGroup().toString());
			
			CombExpressionUtils.create(filePath, content);
		} 
		catch (CoreException | IOException e) {
			e.printStackTrace();
			throw new ExecutionException("Error", e);
		}

		return null;
	}

}
