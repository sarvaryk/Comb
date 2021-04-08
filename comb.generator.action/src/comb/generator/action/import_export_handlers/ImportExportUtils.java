package comb.generator.action.import_export_handlers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import comb.generator.action.InfoUtils;

public class ImportExportUtils {
	public static List<String> readTextFile(String pathString) throws IOException {
	    Path path = Paths.get(pathString);
	    return Files.readAllLines(path, StandardCharsets.UTF_8);
	}
	
	public static void writeTextFile(List<String> lines, String pathString) {
	    Path path = Paths.get(pathString);
	    try {
			Files.write(path, lines, StandardCharsets.UTF_8);
			
			InfoUtils.showMessageDialog("File saved successfully!\nSee: " + pathString);
		} catch (IOException e) {
			InfoUtils.showMessageDialog("An error occured: " + e);
			
			e.printStackTrace();
		}
	}
	
	public static void create(final String filePath, final List<String> content) throws CoreException, IOException {
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
		
		writeTextFile(content, filePath);
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
