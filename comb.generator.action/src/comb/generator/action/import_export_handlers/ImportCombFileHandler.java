package comb.generator.action.import_export_handlers;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import comb.generator.action.InfoUtils;

public class ImportCombFileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		final IFile file = (IFile)firstElement;
		
		try {			
			String originalContentPath = file.getLocation().toOSString();
			List<String> originalContent = ImportExportUtils.readTextFile(originalContentPath);
			String lastLineOfOriginalContent = originalContent.remove(originalContent.size()-1);
			
			String newlyAddedContentPath = InfoUtils.getTargetFilePath("Import from (path):");
			List<String> newlyAddedContent = ImportExportUtils.readTextFile(newlyAddedContentPath);
			newlyAddedContent.remove(newlyAddedContent.size()-1);
			newlyAddedContent.remove(1);
			newlyAddedContent.remove(0);
			
			originalContent.addAll(newlyAddedContent);
			originalContent.add(lastLineOfOriginalContent);
			
			ImportExportUtils.writeTextFile(originalContent, originalContentPath);
		} 
		catch (IOException e) {
			InfoUtils.showMessageDialog("An error occured: " + e);
			
			e.printStackTrace();
			throw new ExecutionException("Error", e);
		}

		return null;
	}

}
