package comb.generator.action.import_export;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import comb.expression.metamodel.comb.impl.ElementImpl;

public class ImportCombElementHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		final ElementImpl element = (ElementImpl)firstElement;
		
		String originalContentPath = CommonPlugin.resolve(element.eResource().getURI()).toFileString();
		ImportCombHandler.importComb(originalContentPath);

		return null;
	}

}
