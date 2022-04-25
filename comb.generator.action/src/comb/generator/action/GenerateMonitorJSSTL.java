package comb.generator.action;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import comb.expression.metamodel.comb.Element;
import comb.expression.metamodel.comb.impl.*;

public class GenerateMonitorJSSTL {
	private static List<String> events;
	
	public static void generate(Element element, String filePath, String packageName) throws IOException, Exception {
        File dir = new File(filePath);
        dir.mkdirs();

		generate_formulaScript(element, filePath, packageName);
		generate_monitorComponent(filePath, packageName);
		generate_defaultGraph(filePath);
	}

	private static void generate_formulaScript(Element element, String filePath, String packageName) throws IOException, Exception {
		String className = "formulaScript";
        File actualFile = new File(filePath, className + ".java");
        if(!actualFile.exists()) {
        	events = new ArrayList<>();
        	String formula = getOperatorCode(element, true);
			
        	String eventStrings = "";
        	for(int i = 0; i < events.size(); i++) {
        		String event = events.get(i);
        		eventStrings += "\""+event+"\"" + (i < events.size()-1 ? "," : "") + "\n";
        	}
        	
            FileWriter writer = new FileWriter(actualFile, false);

            //IMPORTS
            writer.write("package " + packageName + ";\n"
            		+ "\n"
            		+ "import java.util.Map;\n"
            		+ "import eu.quanticol.jsstl.core.formula.*;\n"
            		+ "\n"
            		+ "\n"
            		+ "public class formulaScript extends jSSTLScript {\n"
            		+ "public formulaScript() {\n");
            
            //EVENTS
            writer.write("super( \n"
            		+ "new String[] {\n");
            writer.write(eventStrings);
            writer.write("}\n"
            		+ ");\n");
            
            //FORMULA
            writer.write("addFormula(\"req\",\n");
            writer.write(formula);
            writer.write(", null);\n");
            
            //CLOSURE
            writer.write("}\n"
            		+ "}");
            
            writer.close();
        }
	}
	
	private static String getOperatorCode(Element element, boolean isIntervalParameter) throws Exception {
		String result = "";
		
		if(element != null) {
			if(element instanceof LiteralImpl) {
	    		if(isIntervalParameter) {
	    			result = element.getName();
	    		}
	    		else {
	    			String eventName = element.getName();
	    			addEvent(eventName);
	    			
	    			result =  "new AtomicFormula(\n"
	    					+ "new ParametricExpression() {\n"
	    					+ "public SignalExpression eval( final Map<String,Double> parameters ) {\n"
	    					+ "return new SignalExpression() {\n"
	    					+ "public double eval( double ... variables ) {\n"
	    					+ "return variables[getIndex("+events.indexOf(eventName)+")];\n"
	    					+ "}\n"
	    					+ "};\n"
	    					+ "}\n"
	    					+ "}, false)\n";
	    		}
	    	}
	    	else if(element instanceof Always_Impl || element instanceof AlwaysWithin_Impl || element instanceof AlwaysWithin_and_Impl) {
	    		result =  "new GloballyFormula(\n"
	    				+ "new ParametricInterval(\n"
	    				+ getIntervalParameterCode(element.getL(), false)
	    				+ ",\n"
	    				+ getIntervalParameterCode(element.getH(), true)
	    				+ "),\n"
	    				+ getOperatorCode(element.getP(), false)+"\n"
	    			
	    				+ ")\n";
	    	}
	    	else if(element instanceof Eventually_Impl || element instanceof EventuallyWithin_Impl || element instanceof EventuallyWithin_and_Impl) {
	    		result =  "new EventuallyFormula(\n"
	    				+ "new ParametricInterval(\n"
	    				+ getIntervalParameterCode(element.getL(), false)
	    				+ ",\n"
	    				+ getIntervalParameterCode(element.getH(), true)
	    				+ "),\n"
	    				+ getOperatorCode(element.getP(), false)+"\n"
	    			
	    				+ ")\n";
	    	}
	    	else if(element instanceof Somewhere_InADistanceWithin_Impl) {
	    		result =  "new SomewhereFormula(\n"
	    				+ "new ParametricInterval(\n"
	    				+ getIntervalParameterCode(null, false)
	    				+ ",\n"
	    				+ getIntervalParameterCode(element.getD(), true)
	    				+ "),\n"
	    				+ getOperatorCode(element.getP(), false)+"\n"
	    			
	    				+ ")\n";
	    	}
	    	else if(element instanceof Everywhere_InADistanceWithin_Impl) {
	    		result =  "new EverywhereFormula(\n"
	    				+ "new ParametricInterval(\n"
	    				+ getIntervalParameterCode(null, false)
	    				+ ",\n"
	    				+ getIntervalParameterCode(element.getD(), true)
	    				+ "),\n"
	    				+ getOperatorCode(element.getP(), false)+"\n"
	    			
	    				+ ")\n";
	    	}
	    	else if(element instanceof _until_Impl || element instanceof _untilWithin_Impl || element instanceof _untilWithin_and_Impl) {
	    		result =  "new UntilFormula(\n"
	    				+ "new ParametricInterval(\n"
	    				+ getIntervalParameterCode(element.getL(), false)
	    				+ ",\n"
	    				+ getIntervalParameterCode(element.getH(), true)
	    				+ "),\n"
	    				+ getOperatorCode(element.getP(), false)+",\n"
	    				+ getOperatorCode(element.getQ(), false)+"\n"
	    				+ ")\n";
	    	}
	    	else if(element instanceof Not_Impl) {
	    		result =  "new NotFormula(\n"
	    				+ getOperatorCode(element.getP(), false)+"\n"
	    				+ ")\n";
	    	}
	    	else if(element instanceof _and_Impl) {
	    		result =  "new AndFormula(\n"
	    				+ getOperatorCode(element.getP(), false)+",\n"
	    				+ getOperatorCode(element.getQ(), false)+"\n"
	    				+ ")\n";
	    	}
	    	else if(element instanceof _or_Impl) {
	    		result =  "new OrFormula(\n"
	    				+ getOperatorCode(element.getP(), false)+",\n"
	    				+ getOperatorCode(element.getQ(), false)+"\n"
	    				+ ")\n";
	    	}
	    	else if(element instanceof _implies_Impl) {
	    		result =  "new OrFormula(\n"
	    				+ "new NotFormula(\n"
	    	    		+ getOperatorCode(element.getP(), false)+"\n"
	    	    		+ "),\n"
	    				+ getOperatorCode(element.getQ(), false)+"\n"
	    				+ ")\n";
	    	}
			else if(element instanceof RelationImpl) {
				String operator;			
				if(element instanceof _lessThan_Impl) {
					operator = "<";
				}
				else if(element instanceof _lessThanOrEqual_Impl) {
					operator = "<=";
		    	}
		    	else if(element instanceof _greaterThan_Impl) {
		    		operator = ">";
		    	}
		    	else if(element instanceof _greaterThanOrEqual_Impl) {
		    		operator = ">=";
		    	}
		    	else {
		    		operator = "==";
		    	}
				
				String p = "", q = "";
				try{
					String paramName = "";
					if(element.getP() != null) {
						paramName = element.getP().getName();
						Double.parseDouble(paramName);
						p = paramName;
					}
		        }
		        catch (NumberFormatException ex){
	    			addEvent(element.getP().getName());
		            p = "variables[getIndex("+events.indexOf(element.getP().getName())+")]";
		        }
				
				try{
					String paramName = "";
					if(element.getQ() != null) {
						paramName = element.getQ().getName();
						Double.parseDouble(paramName);
						q = paramName;
					}
		        }
		        catch (NumberFormatException ex){
		        	addEvent(element.getQ().getName());
		        	q = "variables[getIndex("+events.indexOf(element.getQ().getName())+")]";
		        }
				
				result =  "new AtomicFormula(\n"
						+ "new ParametricExpression() {\n"
						+ "public SignalExpression eval( final Map<String,Double> parameters ) {\n"
						+ "return new SignalExpression() {\n"
						+ "public double eval( double ... variables ) {\n"
						+ "return ("+ p + " " + operator + " " + q +") ? 1.0 : -1.0;\n"
						+ "}\n"
						+ "};\n"
						+ "}\n"
						+ "}, false)\n";
	    	}
	    	else {
	    		throw new Exception("Operator not supported: " + element.getClass());
	    	}
		}
		
		return result;
	}
	
	private static String getIntervalParameterCode(Element element, boolean isUpperIndex) {
		String parameter;
		if(element == null) {
			if(isUpperIndex)
				parameter = "Double.POSITIVE_INFINITY";
			else
				parameter = "0";
		}
		else {
			if(element.getName().toLowerCase().equals("infinity"))
				parameter = "Double.POSITIVE_INFINITY";
			else
				parameter = element.getName();
		}
		
		String result = "new ParametricExpression() {\n"
				+ "public SignalExpression eval( final Map<String,Double> parameters ) {\n"
				+ "return new SignalExpression() {\n"
				+ "public double eval( double ... variables ) {\n"
				+ "return "+parameter+";\n"
				+ "}\n"
				+ "};\n"
				+ "}\n"
				+ "}\n";
		
		return result;
	}
	
	private static void addEvent(String event) {
		if(!events.contains(event))
			events.add(event);
	}
	
	private static void generate_monitorComponent(String filePath, String packageName) throws IOException {
		String className = "jSSTLMonitor";
        File actualFile = new File(filePath, className + ".java");
        if(!actualFile.exists()) {
            FileWriter writer = new FileWriter(actualFile, false);

            writer.write("package " + packageName + ";\n"
            		+ "\n"
            		+ "import java.io.IOException;\n"
            		+ "import java.io.PrintStream;\n"
            		+ "import java.util.ArrayList;\n"
            		+ "import java.util.HashMap;\n"
            		+ "import eu.quanticol.jsstl.core.formula.Signal;\n"
            		+ "import eu.quanticol.jsstl.core.formula.jSSTLScript;\n"
            		+ "import eu.quanticol.jsstl.core.space.GraphModel;\n"
            		+ "import eu.quanticol.jsstl.core.io.SyntaxErrorExpection;\n"
            		+ "import eu.quanticol.jsstl.core.io.TraGraphModelReader;\n"
            		+ "import eu.quanticol.jsstl.core.monitor.SpatialBooleanSignal;\n"
            		+ "import eu.quanticol.jsstl.core.signal.BooleanSignal;\n"
            		+ "\n"
            		+ "public class jSSTLMonitor {\n"
            		+ "\tprivate String monitorName;\n"
            		+ "\tprivate jSSTLScript script;\n"
            		+ "\tprivate GraphModel graph;\n"
            		+ "\tprivate String graphPath;\n"
            		+ "\tprivate PrintStream logger;\n"
            		+ "\n"
            		+ "\tpublic jSSTLMonitor(String monitorName, String graphPath, PrintStream logger) {\n"
            		+ "\t\tthis.monitorName = monitorName;\n"
            		+ "\t\tthis.graphPath = graphPath;\n"
            		+ "\t\tthis.logger = logger;\n"
            		+ "\t\treset();\n"
            		+ "\t}\n"
            		+ "\n"
            		+ "\tpublic void reset() {\n"
            		+ "\t\tif(logger != null) logger.println(monitorName + \": \" + \"reset monitor\");\n"
            		+ "\n"
            		+ "\t\ttry {\n"
            		+ "\t\t\tTraGraphModelReader graphReader = new TraGraphModelReader();\n"
            		+ "\t\t\tgraph = graphReader.read(graphPath);\n"
            		+ "\t\t\tgraph.dMcomputation();\n"
            		+ "\t\t\tscript = new formulaScript();\n"
            		+ "\t\t} catch (IOException | SyntaxErrorExpection e) {\n"
            		+ "\t\t\tif(logger != null) logger.println(monitorName + \": \" + e);\n"
            		+ "\t\t\tif(logger != null) logger.println(monitorName + \": \" + \"Error during reading the spatial model (\" + graphPath + \")!\");\n"
            		+ "\t\t}\n"
            		+ "\t}\n"
            		+ "\n"
            		+ "\tpublic double runCheck(ArrayList<HashMap<String, Double>> events, ArrayList<Double> timestamps, double startCheckTime) {\n"
            		+ "\t\tdouble result = 0.0;\n"
            		+ "\t\ttry {\n"
            		+ "\t\t\tresult = check(script, \"req\", graph, events, timestamps, startCheckTime);\n"
            		+ "\t\t} catch (IOException e) {\n"
            		+ "\t\t\tif(logger != null) logger.println(monitorName + \": \" + e);\n"
            		+ "\t\t\tif(logger != null) logger.println(monitorName + \": \" + \"Error during checking the requirement\");\n"
            		+ "\t\t}\n"
            		+ "\n"
            		+ "\t\tif(logger != null) logger.println(monitorName + \" \" + \"result: \" + result);\n"
            		+ "\t\treturn result;\n"
            		+ "\t}\n"
            		+ "\n"
            		+ "\tprivate double[] transformTimestampStructure(ArrayList<Double> timestamps) {\n"
            		+ "\t\tdouble[] times = new double[timestamps.size()+1]; //there exists no signal which exists only in 1 time instance\n"
            		+ "\n"
            		+ "\t\tfor(int i = 1; i < times.length; i++) {\n"
            		+ "\t\t\tdouble timestamp = timestamps.get(i-1);\n"
            		+ "\t\t\ttimes[i] =  timestamp + (timestamp==0 ? 0.001 : 0); //there exists no signal which exists only in 1 time instance\n"
            		+ "\t\t}\n"
            		+ "\n"
            		+ "\t\treturn times;\n"
            		+ "\t}\n"
            		+ "\n"
            		+ "\tprivate double[][][] transformEventStructure(ArrayList<HashMap<String, Double>> events, int locSize, int timeLength) {\n"
            		+ "\t\tint nrOfSignals = script.getVariables().length;\n"
            		+ "\t\tdouble[][][] result = new double[locSize][timeLength][nrOfSignals]; \n"
            		+ "\n"
            		+ "\t\tfor(int l = 0; l < locSize; l++) {\n"
            		+ "\t\t\tfor(int t = 0; t < timeLength; t++) {\n"
            		+ "\t\t\t\tfor(int i = 0; i < nrOfSignals; i++) {\n"
            		+ "\t\t\t\t\tString signal = script.getVariables()[i];\n"
            		+ "\n"
            		+ "\t\t\t\t\tif(t == timeLength-1)\n"
            		+ "\t\t\t\t\t\tresult[l][timeLength-1] = result[l][timeLength-2]; \n"
            		+ "\t\t\t\t\telse if(events.get(t).containsKey(signal))\n"
            		+ "\t\t\t\t\t\tresult[l][t][i] = events.get(t).get(signal);\n"
            		+ "\t\t\t\t\telse\n"
            		+ "\t\t\t\t\t\tresult[l][t][i] = -1.0;\n"
            		+ "\t\t\t\t}\n"
            		+ "\t\t\t}\n"
            		+ "\t\t}\n"
            		+ "\n"
            		+ "\t\treturn result;\n"
            		+ "\t}\n"
            		+ "\n"
            		+ "\tpublic double check(jSSTLScript script, String formula, GraphModel graph, ArrayList<HashMap<String, Double>> events, ArrayList<Double> timestamps, double startCheckTime) throws IOException {\n"
            		+ "\t\tif(logger != null) logger.println(monitorName + \": \" + \"checking requirement in progress\");\n"
            		+ "\n"
            		+ "\t\tdouble[] times = transformTimestampStructure(timestamps);\n"
            		+ "\t\tdouble[][][] data = transformEventStructure(events, graph.getNumberOfLocations(), times.length);\n"
            		+ "\t\tSignal s = new Signal(graph, times, data);\n"
            		+ "\t\tHashMap<String,Double> intervalParValues = null;\n"
            		+ "\t\tSpatialBooleanSignal b = script.booleanCheck(intervalParValues, formula, graph, s);\n"
            		+ "\n"
            		+ "\t\tboolean result = false;\n"
            		+ "\t\tfor(int i = 0; i < graph.getLocations().size(); i++) {\n"
            		+ "\t\t\tBooleanSignal bt = b.spatialBoleanSignal.get(graph.getLocation(i));\n"
            		+ "\t\t\tif(!bt.signal.isEmpty()) //Workaround: signal is false from start to end --> signal is empty --> interval is empty (further investigation is needed)\n"
            		+ "\t\t\t\tresult = bt.getValueAt(startCheckTime);\n"
            		+ "\n"
            		+ "\t\t\tif(logger != null) logger.println(monitorName + \" \" + \"boolean signal: \" + bt);\n"
            		+ "\t\t\tif(logger != null) logger.println(monitorName + \" \" + \"satisfied: \" + result);	\n"
            		+ "\t\t}\n"
            		+ "\n"
            		+ "\t\treturn result ? 1.0 : -1.0;\n"
            		+ "\t}\n"
            		+ "}");

            writer.close();
        }
	}
	
	private static void generate_defaultGraph(String filePath) throws IOException {
		filePath += File.separatorChar + "models";
        File dir = new File(filePath);
        dir.mkdirs();
		
		String className = "spatialModel";
        File actualFile = new File(filePath, className + ".tra");
        if(!actualFile.exists()) {       	
            FileWriter writer = new FileWriter(actualFile, false);

            writer.write("LOCATIONS\n"
            		+ "1\n"
            		+ "EDGES");
            
            writer.close();
        }
	}
}