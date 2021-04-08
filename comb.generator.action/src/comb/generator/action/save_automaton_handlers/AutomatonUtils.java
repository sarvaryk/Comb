package comb.generator.action.save_automaton_handlers;

import java.io.IOException;

import comb.expression.design.Services;
import comb.expression.metamodel.comb.impl.ElementImpl;
import comb.generator.action.InfoUtils;
import gov.nasa.ltl.graph.Graph;
import gov.nasa.ltl.trans.LTL2Buchi;
import gov.nasa.ltl.trans.ParseErrorException;

public class AutomatonUtils {
	public static void saveBuchi(final ElementImpl element, final int format) {
		try {
			String filePath = InfoUtils.getTargetFilePath("Extract automaton to (path):");

			String spinInterpretation = null;
			for(String interpretation : element.getSubtreeInterpretations()) {
				if(interpretation.startsWith("Spin")) {
					spinInterpretation = interpretation.replace("Spin: ", "");
					break;
				}
			}
			
			Graph g = generateAutomaton(spinInterpretation);
			if(g != null) {
				g.save(filePath, format);
				
				InfoUtils.showMessageDialog("File saved successfully!\nSee: " + filePath);
			}
		} catch (ParseErrorException | IOException e) {
			e.printStackTrace();
			InfoUtils.showMessageDialog("ERROR while saving file\nSee: " + e);
		}
	}
	
	public static Graph generateAutomaton(String interpretation) throws ParseErrorException {
		Graph g = null;
		if(interpretation != null && !interpretation.equals(Services.NOT_SUPPORTED_OPERATOR_MESSAGE)) {
			interpretation = interpretation.toLowerCase(); //LTL2Buchi translates EVERY character as an operator which resembles one (e.g. U in TRUE, F in False, G in GoodState)
			
			g = LTL2Buchi.translate(interpretation);
		}
		else
			InfoUtils.showMessageDialog("ERROR: Automaton generation is based on the Spin LTL format. The given expression can not be interpreted in Spin: see documentation");
		
		return g;
	}
}
