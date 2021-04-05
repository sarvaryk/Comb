package comb.generator.action;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import comb.expression.design.Services;
import comb.expression.metamodel.comb.impl.ElementImpl;
import gov.nasa.ltl.graph.Graph;
import gov.nasa.ltl.trans.LTL2Buchi;
import gov.nasa.ltl.trans.ParseErrorException;

public class CombExpressionUtils {
	public static String getTargetFilePath(String message) {
		final JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(null);
		
		return fc.getSelectedFile().getAbsolutePath();
	}
	
	public static void showMessageDialog(String message) {
		JOptionPane.showMessageDialog(
				null, 
				message);
	}
	
	public static List<String> readTextFile(String pathString) throws IOException {
	    Path path = Paths.get(pathString);
	    return Files.readAllLines(path, StandardCharsets.UTF_8);
	}
	
	public static void writeTextFile(List<String> lines, String pathString) {
	    Path path = Paths.get(pathString);
	    try {
			Files.write(path, lines, StandardCharsets.UTF_8);
			
			showMessageDialog("File saved successfully!\nSee: " + pathString);
		} catch (IOException e) {
			CombExpressionUtils.showMessageDialog("An error occured: " + e);
			
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
	
	public static Graph generateAutomaton(ElementImpl element) throws ParseErrorException {
		String spinInterpretation = null;
		for(String interpretation : element.getSubtreeInterpretations()) {
			if(interpretation.startsWith("Spin")) {
				spinInterpretation = interpretation.replace("Spin: ", "");
				break;
			}
		}
		
		Graph g = null;
		if(spinInterpretation != null && !spinInterpretation.equals(Services.NOT_SUPPORTED_OPERATOR_MESSAGE)) {
			spinInterpretation = spinInterpretation.toLowerCase(); //LTL2Buchi translates EVERY character as an operator which resembles one (e.g. U in TRUE, F in False, G in GoodState)
			g = LTL2Buchi.translate(spinInterpretation);
		}
		else
			showMessageDialog("ERROR: Automaton generation is based on the Spin LTL format. The given expression can not be interpreted in Spin: see documentation");
		
		return g;
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
