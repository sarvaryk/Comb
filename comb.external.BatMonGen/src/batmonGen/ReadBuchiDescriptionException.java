package batmonGen;
public class ReadBuchiDescriptionException extends Exception {
	private static final long serialVersionUID = -1695351214694920755L;

	public ReadBuchiDescriptionException(int rowNumber, String input, String errorMessage) { super("Error in row " + rowNumber + ": \"" + input + "\"\n" + errorMessage); }
}