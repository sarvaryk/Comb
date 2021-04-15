package comb.generator.action.import_export;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import comb.generator.action.InfoUtils;

public class ImportExportUtils {
	public static List<String> readTextFile(String pathString) throws IOException {
	    Path path = Paths.get(pathString);
	    return Files.readAllLines(path, StandardCharsets.UTF_8);
	}
	
	public static void writeTextFile(String pathString, List<String> lines) {
	    Path path = Paths.get(pathString);
	    try {
			Files.write(path, lines, StandardCharsets.UTF_8);
			
			InfoUtils.showMessageDialog("File saved successfully!\nSee: " + pathString);
		} catch (IOException e) {
			InfoUtils.showMessageDialog("An error occured: " + e);
			
			e.printStackTrace();
		}
	}
}
