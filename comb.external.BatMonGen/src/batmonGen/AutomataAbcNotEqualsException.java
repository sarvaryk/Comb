package batmonGen;
public class AutomataAbcNotEqualsException extends Exception {
	private static final long serialVersionUID = -7628112352687591864L;

	public AutomataAbcNotEqualsException(String errorMessage) { super("\n" + errorMessage); }
}