package comb.generator.action.automaton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import batmonGen.Automaton;
import batmonGen.NeverclaimToBuchi;
import batmonGen.ReadBuchiDescriptionException;
import batmonGen.Transform;
import comb.expression.design.RefreshLogicGroupAndInterpretations;
import comb.expression.metamodel.comb.Element;
import comb.generator.action.InfoUtils;
import gov.nasa.ltl.graph.Graph;
import gov.nasa.ltl.graphio.Writer;
import gov.nasa.ltl.trans.LTL2Buchi;
import gov.nasa.ltl.trans.ParseErrorException;

public class AutomatonUtils {
	public static void saveBuchi(final Element element, final Writer.Format format, final boolean showInfo) {
		String filePath = InfoUtils.getTargetFilePath("Extract automaton to (path):");
		saveBuchi(element, format, showInfo, false, filePath);
	}
	
	public static void saveBuchi(final Element element, final Writer.Format format, final boolean showInfo, final boolean isNegated, final String filePath) {
		try {
			Graph<String> g = generate_LTL2BuchiGraph(element, isNegated, showInfo);
			if(g != null) {
				FileOutputStream fout = new FileOutputStream(filePath);
				PrintStream pout = new PrintStream(fout);
				Writer<String> writer = Writer.getWriter(format, pout);
				writer.write(g);
				
				if(showInfo)
					InfoUtils.showMessageDialog("File saved successfully!\nSee: " + filePath);
			}
		} catch (IOException e) {
			e.printStackTrace();
			if(showInfo)
				InfoUtils.showMessageDialog("ERROR while saving file\nSee: " + e);
		}
	}
	
	public static Automaton getNFA(final Element element) {
		return getNFA(element, false);
	}
	
	public static Automaton getNFA(final Element element, final boolean isNegated) {
		RefreshLogicGroupAndInterpretations.refresh(element);
		
		//TODO: transform the POJO directly
		//Graph<String> g = AutomatonUtils.generate_LTL2BuchiGraph(element, false);
		//Automaton ba = translateFrom_LTL2BuchiGraph_To_BatMonGenAutomaton(g);
		
		Automaton nfa = null;
		try {
			String fileName = "temp_buchi.txt";
			saveBuchi(element, Writer.Format.SPIN, false, isNegated, fileName);
			Automaton ba = NeverclaimToBuchi.parse(fileName);
			ba.setName(element.getName());
			nfa = Transform.buchiToNFA(ba);
		} catch (IOException | ReadBuchiDescriptionException e) {
			e.printStackTrace();
			InfoUtils.showMessageDialog("ERROR while generating DFA!\n" + e);
		}
		
		return nfa;
	}
	
	private static Graph<String> generate_LTL2BuchiGraph(final Element element, final boolean isNegated, final boolean showInfo) {
		String spinInterpretation = null;
		for(String interpretation : element.getSubtreeInterpretations()) {
			if(interpretation.startsWith("Spin")) {
				spinInterpretation = interpretation.replace("Spin: ", "");
				
				if(isNegated)
					spinInterpretation = "!("+spinInterpretation+")";
				
				break;
			}
		}
		
		Graph<String> g = null;
		if(spinInterpretation != null && !spinInterpretation.equals(RefreshLogicGroupAndInterpretations.NOT_SUPPORTED_OPERATOR_MESSAGE)) {
			try {
				g = LTL2Buchi.translate(spinInterpretation);
			} catch (ParseErrorException e) {
				e.printStackTrace();
				if(showInfo)
					InfoUtils.showMessageDialog("ERROR: " + e);
			}
		}
		else if(showInfo)
			InfoUtils.showMessageDialog("ERROR: Automaton generation is supported only for LTL with Spin output.");
		
		return g;
	}
}
