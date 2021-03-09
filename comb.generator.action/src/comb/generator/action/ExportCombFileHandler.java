package comb.generator.action;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class ExportCombFileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		
		try {
			final String fileName = CombExpressionUtils.getTargetFilePath("Export as:");
			final String fileName2 = CombExpressionUtils.getTargetFilePath("(TODO: TEMP) Export from (path):");
			
			/*final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			final IFile file = (IFile)firstElement;
			String fullPath = file.getFullPath().toString();
			// Decoding so spaces do not stir trouble
			fullPath = URI.decode(fullPath);
			String path = root.getFile(file.getFullPath()).getFullPath().toOSString();*/

			List<String> content = CombExpressionUtils.readTextFile(fileName2);
			CombExpressionUtils.create(fileName, content);
		} 
		catch (CoreException | IOException e) {
			e.printStackTrace();
			throw new ExecutionException("Error", e);
		}
		
		return null;
	}

}
