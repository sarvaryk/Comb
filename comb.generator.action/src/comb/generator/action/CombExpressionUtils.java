package comb.generator.action;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

public class CombExpressionUtils {
	protected static String getTargetFilePath(String message) {
		String result = (String)JOptionPane.showInputDialog(
		                    null,
		                    message,
		                    "Comb",
		                    JOptionPane.PLAIN_MESSAGE);

		return result;
	}
	
	protected static List<String> readTextFile(String pathString) throws IOException {
	    Path path = Paths.get(pathString);
	    return Files.readAllLines(path, StandardCharsets.UTF_8);
	}
	
	protected static void writeTextFile(List<String> lines, String pathString) throws IOException {
	    Path path = Paths.get(pathString);
	    Files.write(path, lines, StandardCharsets.UTF_8);
	}
	
	protected static void create(final String filePath, final List<String> content) throws CoreException, IOException {
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
		
		final IPath packagePath = new org.eclipse.core.runtime.Path("/").append("expression-gen/");
		prepare(project.getFolder(packagePath));
		
		/*final IFile file = project.getFile(packagePath.append(fileName));
		
		if(!file.exists()) {
			System.out.println("Creating comb expression file...");
			
			StringBuilder contentStringBuilder = new StringBuilder();
			for(String contentString : content) {
				contentStringBuilder.append(contentString + "\r\n");
			}
			
			file.create(new ByteArrayInputStream(contentStringBuilder.toString().getBytes()), true, progressMonitor);
			//writeTextFile(content, file.getFullPath().toOSString());
		}
		else {
			System.out.println("Comb expression file already exists...");
		}*/
		
		writeTextFile(content, filePath);
		
		System.out.println("Generating comb expression completed!\nSee: " + filePath);
	}
	
	private static void prepare(final IFolder folder) throws CoreException {
		if(!folder.exists()) {
			if(folder.getParent() instanceof IFolder) {
				prepare((IFolder) folder.getParent());
			}
	        folder.create(true, true, null);
	    }
	}
}
