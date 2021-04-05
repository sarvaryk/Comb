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

public class SaveInterpretationsHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		
		final ElementImpl element = (ElementImpl)firstElement;

		try {
			final String filePath = CombExpressionUtils.getTargetFilePath("Extract expression to (path):");
			
			List<String> content = new ArrayList<>();
			content.add(String.format("%s expression\n", element.getLogicGroup().toString()));
		    for(String expression : element.getSubtreeInterpretations()) {
		    	content.add(expression + "\n");
		    }
			
			CombExpressionUtils.create(filePath, content);
		} 
		catch (CoreException | IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
