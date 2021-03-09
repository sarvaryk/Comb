package comb.generator.action;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class ImportCombFileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		final IFile file = (IFile)firstElement;
		
		try {			
			String overwriteFileOnPathString = CombExpressionUtils.getTargetFilePath("Import to (path):");
			String fileName2 = CombExpressionUtils.getTargetFilePath("(TODO: TEMP) Import from (path):");
			
			List<String> contentToOverwrite = CombExpressionUtils.readTextFile(overwriteFileOnPathString);
			String lastLineOfContentToOverwrite = contentToOverwrite.remove(contentToOverwrite.size()-1);
			
			//final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			//String path = root.getFile(file.getFullPath()).getFullPath().toOSString();
			List<String> contentToWrite = CombExpressionUtils.readTextFile(fileName2);
			contentToWrite.remove(contentToWrite.size()-1);
			contentToWrite.remove(1);
			contentToWrite.remove(0);
			
			contentToOverwrite.addAll(contentToWrite);
			contentToOverwrite.add(lastLineOfContentToOverwrite);
			
			CombExpressionUtils.writeTextFile(contentToOverwrite, overwriteFileOnPathString);
		} 
		catch (IOException e) {
			e.printStackTrace();
			throw new ExecutionException("Error", e);
		}

		return null;
	}

}
