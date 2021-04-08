package comb.generator.action.import_export_handlers;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import comb.generator.action.InfoUtils;

public class ExportCombFileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		final IFile file = (IFile)firstElement;
		
		try {
			final String fileName = InfoUtils.getTargetFilePath("Export to (path):");
			final String fileName2 = file.getLocation().toOSString();

			List<String> content = ImportExportUtils.readTextFile(fileName2);
			ImportExportUtils.create(fileName, content);
			
			InfoUtils.showMessageDialog("File saved successfully!\nSee: " + fileName);
		} 
		catch (CoreException | IOException e) {
			InfoUtils.showMessageDialog("An error occured: " + e);
			
			e.printStackTrace();
			throw new ExecutionException("Error", e);
		}
		
		return null;
	}

}
