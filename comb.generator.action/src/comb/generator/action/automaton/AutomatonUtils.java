package comb.generator.action.automaton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import batmonGen.Automaton;
import batmonGen.NeverclaimToBuchi;
import batmonGen.ReadBuchiDescriptionException;
import batmonGen.Tarjan;
import batmonGen.Transform;
import comb.expression.design.RefreshLogicGroupAndInterpretations;
import comb.expression.metamodel.comb.Element;
import comb.generator.action.InfoUtils;
import comb.generator.action.import_export.ImportExportUtils;
import gov.nasa.ltl.graph.Graph;
import gov.nasa.ltl.graphio.Writer;
import gov.nasa.ltl.trans.LTL2Buchi;
import gov.nasa.ltl.trans.ParseErrorException;

public class AutomatonUtils {
	private static int TIMEOUT = 60;
	
	public static boolean saveBuchi(final Element element, final Writer.Format format, final boolean showInfo) {
		String filePath = InfoUtils.getTargetFilePath("Extract automaton to (path):");
		return saveBuchi(element, format, showInfo, false, filePath);
	}
	
	public static boolean saveBuchi(final Element element, final Writer.Format format, final boolean showInfo, final boolean isNegated, final String filePath) {
		boolean successfulSave = false;
		
		try {
			Graph<String> g = CompletableFuture.supplyAsync(() -> generateBuchi(element, isNegated, showInfo)).get(TIMEOUT, TimeUnit.SECONDS);
			if(g != null) {
				FileOutputStream fout = new FileOutputStream(filePath);
				PrintStream pout = new PrintStream(fout);
				Writer<String> writer = Writer.getWriter(format, pout);
				writer.write(g);
				
				successfulSave = true;
				
				if(showInfo)
					InfoUtils.showMessageDialog("File saved successfully!\nSee: " + filePath);
			}
		} catch (IOException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
			if(showInfo)
				InfoUtils.showMessageDialog("ERROR while saving file\nSee: " + e);
		} catch (TimeoutException e) {
			e.printStackTrace();
			if(showInfo)
				InfoUtils.showMessageDialog("Generation of the Büchi-automaton was terminated, as it was not completed before timeout\nSee: " + e);
		}
		
		return successfulSave;
	}
	
	public static Optional<Automaton> getBuchi(final Element element, final boolean isNegated) {
		RefreshLogicGroupAndInterpretations.refresh(element);
		
		//TODO: transform the POJO directly
		//Graph<String> g = AutomatonUtils.generate_LTL2BuchiGraph(element, false);
		//Automaton ba = translateFrom_LTL2BuchiGraph_To_BatMonGenAutomaton(g);
		
		Automaton ba = null;
		try {
			String fileName = "temp_buchi.txt";
			boolean successfulSave = saveBuchi(element, Writer.Format.SPIN, false, isNegated, fileName);
			if(successfulSave) {
				ba = NeverclaimToBuchi.parse(fileName);
				ba.setName(element.getName());
				Tarjan.markBadRegions(ba);
			}
			else {
				//clearing the file, so it does not contain the büchi description used before
				ImportExportUtils.writeTextFile(fileName, new ArrayList<String>(), false);
			}
		} catch (IOException | ReadBuchiDescriptionException e) {
			e.printStackTrace();
			InfoUtils.showMessageDialog("ERROR while generating the Büchi-automaton!\n" + e);
		}
		
		return Optional.ofNullable(ba);
	}
	
	public static Optional<Automaton> getNFA(final Element element) {
		return getNFA(element, false);
	}
	
	public static Optional<Automaton> getNFA(final Element element, final boolean isNegated) {
		Optional<Automaton> ba = getBuchi(element, isNegated);
		
		Automaton nfa = null;
		if(ba.isPresent())
			nfa = Transform.buchiToNFA(ba.get());
		
		return Optional.ofNullable(nfa);
	}
	
	private static Graph<String> generateBuchi(final Element element, final boolean isNegated, final boolean showInfo) {
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
