package comb.generator.action;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class ImportCombFileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		final IFile file = (IFile)firstElement;
		
		try {			
			String originalContentPath = file.getLocation().toOSString();
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
			e.printStackTrace();
			throw new ExecutionException("Error", e);
		}

		return null;
	}

}
