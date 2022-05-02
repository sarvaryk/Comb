package comb.generator.action;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;

import batmonGen.AutomataAbcNotEqualsException;
import batmonGen.Automaton;
import batmonGen.Generator;
import batmonGen.Transform;
import comb.expression.metamodel.comb.LogicGroup;
import comb.expression.metamodel.comb.impl.ElementImpl;
import comb.generator.action.automaton.AutomatonUtils;

public class GenerateMonitorHandler extends AbstractHandler {
	private static String PACKAGE_NAME_SETTING = "package";
	private static String MONITOR_MODE_SETTING = "monitor_mode";
	private static String MONITOR_GEN_TIMEOUT_SETTING = "monitor_gen_timeout";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		final Object firstElement = selection.getFirstElement();
		
		final ElementImpl element = (ElementImpl)firstElement;
		
		String name = element.getName().replaceAll(" ", "_");
		if(name.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
			HashMap<String, String> configs = configFileReader();
			
			if((configs.get(MONITOR_MODE_SETTING).equals("online_or_offline") || configs.get(MONITOR_MODE_SETTING).equals("online")) && 
					(element.getLogicGroup().equals(LogicGroup.LTL))) {
				try {
					Optional<Automaton> nfa_original_optional = AutomatonUtils.getNFA(element);
					Optional<Automaton> nfa_negated_optional = AutomatonUtils.getNFA(element, true);
					
					if(nfa_original_optional.isPresent() && nfa_negated_optional.isPresent()) {
						String filePath = InfoUtils.getTargetFilePath("Save monitor to (directory):");
						
						int timeout = Integer.parseInt(configs.get(MONITOR_GEN_TIMEOUT_SETTING));
						CompletableFuture.supplyAsync(() -> generate_BatMon_Monitor(name, nfa_original_optional, nfa_negated_optional, filePath, configs.get(PACKAGE_NAME_SETTING))).get(timeout, TimeUnit.SECONDS);
					}
					else
						InfoUtils.showMessageDialog("ERROR: Monitor generation is supported only for LTL with Spin output.");
						
				} catch (TimeoutException e) {
					e.printStackTrace();
					InfoUtils.showMessageDialog("Generation terminated, timeout reached while generating monitor!\n" + e);
				} catch (Exception e) {
					e.printStackTrace();
					InfoUtils.showMessageDialog("ERROR while generating monitor!\n" + e);
				}
			}
			else if((configs.get(MONITOR_MODE_SETTING).equals("online_or_offline") || configs.get(MONITOR_MODE_SETTING).equals("offline")) && 
					(element.getLogicGroup().equals(LogicGroup.LTL) || element.getLogicGroup().equals(LogicGroup.MITL) || element.getLogicGroup().equals(LogicGroup.STL) || element.getLogicGroup().equals(LogicGroup.SSTL))) {
				try {
					String filePath = InfoUtils.getTargetFilePath("Save monitor to (directory):");
					
					int timeout = Integer.parseInt(configs.get(MONITOR_GEN_TIMEOUT_SETTING));
					CompletableFuture.supplyAsync(() -> generate_jSSTL_Monitor(name, element, filePath, configs.get(PACKAGE_NAME_SETTING))).get(timeout, TimeUnit.SECONDS);
				} catch (TimeoutException e) {
					e.printStackTrace();
					InfoUtils.showMessageDialog("Generation terminated, timeout reached while generating monitor!\n" + e);
				} catch (Exception e) {
					e.printStackTrace();
					InfoUtils.showMessageDialog("ERROR while generating monitor!\n" + e);
				}
			}
			else {
				InfoUtils.showMessageDialog("The monitor generation feature for the logic group " + element.getLogicGroup() + " is not supported in " + configs.get(MONITOR_MODE_SETTING) + " mode");
			}
		}
		else {
			InfoUtils.showMessageDialog("Monitor generation was aborted, the given name ("+name+") is not valid!\n"
					+ "The name can only contain Alphanumeric english characters and \"_\",\n"
					+ "and must start with a character from the english ABC or \"_\"");
			
		}
		
		return null;
	}
	
	private static boolean generate_BatMon_Monitor(String name, Optional<Automaton> nfa_original_optional, Optional<Automaton> nfa_negated_optional, String filePath, String packageName) {
		boolean success = true;
		try {
			Automaton nfa_original = nfa_original_optional.get();
			Automaton nfa_negated = nfa_negated_optional.get();
			
			Automaton dfa_original = Transform.NFAtoDFA(nfa_original);
			Automaton dfa_negated = Transform.NFAtoDFA(nfa_negated);
		
			Automaton fsm = Transform.DFAtoFSM(dfa_original, dfa_negated);
			
			Generator.generate(name, fsm, null, filePath, packageName);
			
			InfoUtils.showMessageDialog("Monitor and its components saved successfully!\nSee: " + filePath);
		} catch (AutomataAbcNotEqualsException e) {
			success = false;
			e.printStackTrace();
			InfoUtils.showMessageDialog("ERROR while generating monitor!\n" + e);
		}
		return success;
	}

	private static boolean generate_jSSTL_Monitor(String name, ElementImpl element, String filePath, String packageName) {
		boolean success = true;
		try {
			GenerateMonitorJSSTL.generate(name, element, filePath, packageName);
			
			InfoUtils.showMessageDialog("Monitor and its components saved successfully!\nSee: " + filePath);

		} catch (Exception e) {
			success = false;
			e.printStackTrace();
			InfoUtils.showMessageDialog("ERROR while generating monitor!\n" + e);
		}
		return success;
	}
	
	private static HashMap<String, String> configFileReader() {
		HashMap<String, String> configs = new HashMap<>();
		try {
			String fileName = "generator_config.txt";
			Bundle bundle = Platform.getBundle("comb.expression.design");
			URI fileURI = FileLocator.resolve(bundle.getEntry(File.separator)).toURI();
			String filePath = Paths.get(fileURI).toString();
			filePath = Paths.get(filePath, fileName).toString();
			
			String input;
			java.io.BufferedReader br = new java.io.BufferedReader(new FileReader(new File(filePath)));
	        while ((input = br.readLine()) != null) {
	        	String[] inputPair = input.split("\s*:\s*");
	        	configs.put(inputPair[0], inputPair[1]);
	        }
		}
		catch(IOException | URISyntaxException e) {
			e.printStackTrace();
			InfoUtils.showMessageDialog("ERROR while reading the config file!\n" + e);
		}
		
		return configs;
	}
}