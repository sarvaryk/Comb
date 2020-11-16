package comb.generator.action;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

import comb.expression.metamodel.comb.impl.ElementImpl;

public class GenerateCombExpression {
	public void generate(final ElementImpl element) throws CoreException {
		System.out.println("Generating expression started...");
		
		final IProgressMonitor progressMonitor = new NullProgressMonitor();
		final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		final IProject project = root.getProject("comb.expression");
		
		if(!project.exists()) {
			System.out.println("Creating comb expression output project...");
			project.create(progressMonitor);
		}
		if(!project.isOpen()) {
			System.out.println("Opening comb expression output project...");
			project.open(progressMonitor);
		}
		
		final IPath packagePath = new Path("/").append("expression-gen/".replace(".", "/"));
		prepare(project.getFolder(packagePath));
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Date date = new Date(System.currentTimeMillis());
		String elementName = formatter.format(date);
		final IFile taskExceptionFile = project.getFile(packagePath.append(elementName + "_CombExpression.txt"));
		if(!taskExceptionFile.exists()) {
			System.out.println("Creating comb expression file...");
			taskExceptionFile.create(new ByteArrayInputStream(element.getSubtreeInterpretation().getBytes()), true, progressMonitor);
		}
		else {
			System.out.println("Comb expression file already exists...");
		}
		
		System.out.println("Generating comb expression completed!\nSee: comb.expression/expression-gen/" + elementName + "_CombExpression.txt" );
	}
	
	private void prepare(final IFolder folder) throws CoreException {
		if(!folder.exists()) {
			if(folder.getParent() instanceof IFolder) {
				prepare((IFolder) folder.getParent());
			}
	        folder.create(true, true, null);
	    }
	}
}
