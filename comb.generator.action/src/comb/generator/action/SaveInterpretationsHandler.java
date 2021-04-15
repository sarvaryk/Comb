package comb.generator.action;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import comb.expression.metamodel.comb.impl.ElementImpl;
import comb.generator.action.import_export.ImportExportUtils;

public class SaveInterpretationsHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		
		final ElementImpl element = (ElementImpl)firstElement;

		final String filePath = InfoUtils.getTargetFilePath("Extract expression to (path):");
		
		List<String> content = new ArrayList<>();
		content.add(String.format("%s expression\n", element.getLogicGroup().toString()));
		for(String expression : element.getSubtreeInterpretations()) {
			content.add(expression + "\n");
		}
		
		ImportExportUtils.writeTextFile(filePath, content);
		
		return null;
	}
	
}
