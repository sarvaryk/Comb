package comb.generator.action.import_export;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import comb.expression.metamodel.comb.impl.ElementImpl;
import comb.generator.action.CombExpressionUtils;

public class ExportCombElementHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		final ElementImpl element = (ElementImpl)firstElement;
		
		try {
			final String fileName = CombExpressionUtils.getTargetFilePath("Export to (path):").replace("/", "//");
			
			URI resolvedFile = CommonPlugin.resolve(element.eResource().getURI());
			File file = new File(resolvedFile.toFileString()); 
			Scanner sc = new Scanner(file); 
			
			String rootElementType = "element";
			String elementName = element.getName();
			String regexStart = String.format("\s*<%s.*name=\"%s\".*>", rootElementType, elementName);
			String regexEnd = String.format("\s*</%s>", rootElementType);
			Pattern patternStart = Pattern.compile(regexStart);
			Pattern patternEnd = Pattern.compile(regexEnd);
			
			boolean addLine = false;
			List<String> content = new ArrayList<>();
			content.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			content.add("<comb:Comb xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:comb=\"http://www.example.org/comb\">");
			
			String currentLine;
			while(sc.hasNext()) {
				currentLine = sc.nextLine();
				
				if(patternStart.matcher(currentLine).matches())
					addLine = true;
				
				if(addLine)
					content.add(currentLine);
				
				if(addLine && patternEnd.matcher(currentLine).matches()) {
					addLine = false;
					break;
				}
			}
			sc.close();
			content.add("</comb:Comb>");
			
			CombExpressionUtils.create(fileName, content);
			
			CombExpressionUtils.showMessageDialog("File saved successfully!\nSee: " + fileName);
		} 
		catch (CoreException | IOException e) {
			CombExpressionUtils.showMessageDialog("An error occured: " + e);
			
			e.printStackTrace();
			throw new ExecutionException("Error", e);
		}

		return null;
	}
}
