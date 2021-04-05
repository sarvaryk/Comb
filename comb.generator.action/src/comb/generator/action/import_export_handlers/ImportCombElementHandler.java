package comb.generator.action.import_export_handlers;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import comb.expression.metamodel.comb.impl.ElementImpl;
import comb.generator.action.CombExpressionUtils;

public class ImportCombElementHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		final ElementImpl element = (ElementImpl)firstElement;
		
		try {			
			String originalContentPath = CommonPlugin.resolve(element.eResource().getURI()).toFileString();
			List<String> originalContent = CombExpressionUtils.readTextFile(originalContentPath);
			String lastLineOfOriginalContent = originalContent.remove(originalContent.size()-1);
			
			String newlyAddedContentPath = CombExpressionUtils.getTargetFilePath("Import from (path):").replace("/", "//");
			List<String> newlyAddedContent = CombExpressionUtils.readTextFile(newlyAddedContentPath);
			newlyAddedContent.remove(newlyAddedContent.size()-1);
			newlyAddedContent.remove(1);
			newlyAddedContent.remove(0);
			
			originalContent.addAll(newlyAddedContent);
			originalContent.add(lastLineOfOriginalContent);
			
			CombExpressionUtils.writeTextFile(originalContent, originalContentPath);
		} 
		catch (IOException e) {
			CombExpressionUtils.showMessageDialog("An error occured: " + e);

			e.printStackTrace();
			throw new ExecutionException("Error", e);
		}

		return null;
	}

}
