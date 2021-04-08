package comb.generator.action;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class InfoUtils {
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
}
