package comb.generator.action.import_export;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;

import comb.generator.action.InfoUtils;

public class ImportCombHandler {

	public static void importComb(String originalContentPath) throws ExecutionException {
		try {			
			List<String> originalContent = ImportExportUtils.readTextFile(originalContentPath);
			String lastLineOfOriginalContent = originalContent.remove(originalContent.size()-1);
			
			String newlyAddedContentPath = InfoUtils.getTargetFilePath("Import from (path):");
			List<String> newlyAddedContent = ImportExportUtils.readTextFile(newlyAddedContentPath);
			newlyAddedContent.remove(newlyAddedContent.size()-1);
			newlyAddedContent.remove(1);
			newlyAddedContent.remove(0);
			
			originalContent.addAll(newlyAddedContent);
			originalContent.add(lastLineOfOriginalContent);
			
			ImportExportUtils.writeTextFile(originalContentPath, originalContent);
		} 
		catch (IOException e) {
			InfoUtils.showMessageDialog("An error occured: " + e);
			
			e.printStackTrace();
			throw new ExecutionException("Error", e);
		}
	}

}
