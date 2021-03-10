package comb.generator.action;

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
			
			//TODO: DO NOT HARDCODE STUFF?
			String rootElementType = "element"; //EcoreUtil.getRootContainer(element).toString();
			String elementName = element.getName();
			String regexStart = String.format("\s*<%s.*name=\"%s\".*>", rootElementType, elementName);
			String regexEnd = String.format("\s*</%s>", rootElementType);
			Pattern patternStart = Pattern.compile(regexStart);
			Pattern patternEnd = Pattern.compile(regexEnd);
			
			boolean addLine = false;
			//TODO: DO NOT HARDCODE STUFF?
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
			//TODO: DO NOT HARDCODE STUFF?
			content.add("</comb:Comb>");
			
			CombExpressionUtils.create(fileName, content);
		} 
		catch (CoreException | IOException e) {
			e.printStackTrace();
			throw new ExecutionException("Error", e);
		}

		return null;
	}
	
	   /* try {			
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot root = workspace.getRoot();
		final IProject project = root.getProject("comb.examples");
		final IFile file = project.getFile(EcoreUtil.getURI(element).lastSegment());
		
	    File fXmlFile = new File(file.toString());
	    File fXmlFile = new File("C:\\Users\\Krisztián\\git\\Comb\\comb.examples\\My.comb");
	
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    Document doc = dBuilder.parse(fXmlFile);
	            
	    //optional, but recommended
	    //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
	    doc.getDocumentElement().normalize();
	
	    System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	            
	    NodeList nList = doc.getElementsByTagName("element");
	            
	    System.out.println("----------------------------");
	
	    String content = "default";
	    for (int temp = 0; temp < nList.getLength(); temp++) {
	
	        Node nNode = nList.item(temp);
	                
	        System.out.println("\nCurrent Element :" + nNode.getNodeName());
	                
	        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	
	            Element eElement = (Element) nNode;
	
	            if(eElement.getAttribute("name").equals(element.getName()))
	            	content = eElement.getTextContent();
	            System.out.println(eElement.getTextContent());
	            System.out.println("Staff id : " + eElement.getAttribute("id"));
	            System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
	            System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
	            System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
	            System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
	
	        }
	    }
	    CombExpression.create(fileName, content);
	} 
	catch (Exception e) {
		e.printStackTrace();
	}*/		
		/*List<Object> objects = new ArrayList<>();
		objects.add(element);
		final ModelXMLSaver xmlSaver = new ModelXMLSaver();
		xmlSaver.setSaveAsXMI(true);
		xmlSaver.setObjects(objects);
		final StringWriter sw = new StringWriter();
		xmlSaver.setWriter(sw);
		xmlSaver.write();
		return sw.toString();*/
		
		/*private String writeXMI(final List<Object> objects) {
		//load
		final ModelXMLLoader xmlLoader = new ModelXMLLoader();
		xmlLoader.setLoadAsXMI(true);
		xmlLoader.setReader(new StringReader("da content"));
		return xmlLoader.read();
		
		//save
		final ModelXMLSaver xmlSaver = new ModelXMLSaver();
		xmlSaver.setSaveAsXMI(true);
		xmlSaver.setObjects(objects);
		xmlSaver.setWriter(new StringWriter());
		xmlSaver.write();
		return sw.toString();
		}*/
}
