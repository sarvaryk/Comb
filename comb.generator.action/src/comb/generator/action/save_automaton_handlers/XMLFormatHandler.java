package comb.generator.action.save_automaton_handlers;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import comb.expression.metamodel.comb.impl.ElementImpl;
import comb.generator.action.CombExpressionUtils;
import gov.nasa.ltl.graph.Graph;
import gov.nasa.ltl.trans.ParseErrorException;

public class XMLFormatHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		
		final ElementImpl element = (ElementImpl)firstElement;
		
		Graph g;
		try {
			final String filePath = CombExpressionUtils.getTargetFilePath("Extract automaton to (path):");
			
			g = CombExpressionUtils.generateAutomaton(element);
			
			if(g != null) {
				g.save(filePath, gov.nasa.ltl.graph.Graph.XML_FORMAT);
				
				CombExpressionUtils.showMessageDialog("File saved successfully!\nSee: " + filePath);
			}
		} catch (ParseErrorException | IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
