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
	
	public static void generate(ElementImpl element, String filePath) {
		try {
            File dir = new File(filePath);
            dir.mkdirs();

    		generate_formulaScript(element, filePath);
    		generate_monitorComponent(element, filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	private static void generate_formulaScript(ElementImpl element, String filePath) throws IOException {
		String className = "formulaScript";
        File actualFile = new File(filePath, className + ".java");
        if(!actualFile.exists()) {
        	events = new ArrayList<>();
        	String formula = null;
			try {
				formula = getOperatorCode(element, true);
			} catch (Exception e) {
				//TODO: ...
				e.printStackTrace();
			}
			
        	String eventStrings = "";
        	for(int i = 0; i < events.size(); i++) {
        		String event = events.get(i);
        		eventStrings += "\""+event+"\"" + (i < events.size()-1 ? "," : "") + "\r\n";
        	}
        	
            FileWriter writer = new FileWriter(actualFile, false);

            //IMPORTS
            writer.write("import java.util.Map;\r\n"
            		+ "import eu.quanticol.jsstl.core.formula.*;\r\n"
            		+ "\r\n"
            		+ "\r\n"
            		+ "public class formulaScript extends jSSTLScript {\r\n"
            		+ "public formulaScript() {\r\n");
            
            //EVENTS
            writer.write("super( \r\n"
            		+ "new String[] {\r\n");
            writer.write(eventStrings);
            writer.write("}\r\n"
            		+ ");\r\n");
            
            //FORMULA
            writer.write("addFormula(\"req\",\r\n");
            writer.write(formula);
            writer.write(", null);\r\n");
            
            //CLOSURE
            writer.write("}\r\n"
            		+ "}");
            
            writer.close();
        }
	}
	
	private static String getOperatorCode(Element element, boolean isIntervalParameter) throws Exception {
		String result = "";
		
		if(element instanceof LiteralImpl) {
    		if(!isIntervalParameter) {
    			String eventName = element.getName();
    			addEvent(eventName);
    			
    			result =  "new AtomicFormula(\r\n"
    					+ "new ParametricExpression() {\r\n"
    					+ "public SignalExpression eval( final Map<String,Double> parameters ) {\r\n"
    					+ "return new SignalExpression() {\r\n"
    					+ "public double eval( double ... variables ) {\r\n"
    					+ "return variables[getIndex("+events.indexOf(eventName)+")];\r\n"
    					+ "}\r\n"
    					+ "};\r\n"
    					+ "}\r\n"
    					+ "}, false)\r\n";
    		}
    		else {
    			
    		}
    	}
    	else if(element instanceof Always_Impl || element instanceof AlwaysWithin_Impl || element instanceof AlwaysWithin_and_Impl ||
    			element instanceof Eventually_Impl || element instanceof EventuallyWithin_Impl || element instanceof EventuallyWithin_and_Impl ||
    			element instanceof Somewhere_InADistanceWithin_Impl ||
    			element instanceof Everywhere_InADistanceWithin_Impl) {
    		result =  "new "+getOPeratorName(element)+"Formula(\r\n"
    				+ "new ParametricInterval( \r\n"
    				+ getIntervalParameterCode(element.getL(), false)
    				+ ",\r\n"
    				+ getIntervalParameterCode(element.getH(), true)
    				+ "),\r\n"
    				+ getOperatorCode(element.getP(), false)+"\r\n"
    				+ ")\r\n";
    	}
    	else if(element instanceof _until_Impl || element instanceof _untilWithin_Impl || element instanceof _untilWithin_and_Impl) {
    		result =  "new "+getOPeratorName(element)+"Formula(\r\n"
    				+ "new ParametricInterval(\r\n"
    				+ getIntervalParameterCode(element.getL(), false)
    				+ ",\r\n"
    				+ getIntervalParameterCode(element.getH(), true)
    				+ "),\r\n"
    				+ getOperatorCode(element.getP(), false)+",\r\n"
    				+ getOperatorCode(element.getQ(), false)+"\r\n"
    				+ ")\r\n";
    	}
    	else if(element instanceof Not_Impl) {
    		result =  "new "+getOPeratorName(element)+"Formula(\r\n"
    				+ getOperatorCode(element.getP(), false)+"\r\n"
    				+ ")\r\n";
    	}
    	else if(element instanceof _and_Impl || element instanceof _or_Impl) {
    		result =  "new "+getOPeratorName(element)+"Formula(\r\n"
    				+ getOperatorCode(element.getP(), false)+",\r\n"
    				+ getOperatorCode(element.getQ(), false)+"\r\n"
    				+ ")\r\n";
    	}
    	/*else if(element instanceof Reach_by_InADistanceWithin_Impl) {
			
		}
    	else if(element instanceof EscapeBy_withADistanceOfAtLeast_Impl) {
			
		}
    	else if(element instanceof _implies_Impl) {
    		
    	}
    	else if(element instanceof _lessThan_Impl) {
    		
    	}
    	else if(element instanceof _lessThanOrEqual_Impl) {
    		
    	}
    	else if(element instanceof _equal_Impl) {
    		
    	}
    	else if(element instanceof _greaterThan_Impl) {
    		
    	}
    	else if(element instanceof _greaterThanOrEqual_Impl) {
    		
    	}*/
		
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
			if(element.getName().equals("-1"))
				parameter = "Double.POSITIVE_INFINITY";
			else
				parameter = element.getName();
		}
		
		String result = "new ParametricExpression() {\r\n"
				+ "public SignalExpression eval( final Map<String,Double> parameters ) {\r\n"
				+ "return new SignalExpression() {\r\n"
				+ "public double eval( double ... variables ) {\r\n"
				+ "return "+parameter+";\r\n"
				+ "}\r\n"
				+ "};\r\n"
				+ "}\r\n"
				+ "}\r\n";
		
		return result;
	}
	
	private static String getOPeratorName(Element element) throws Exception {
		String result = "";
		
		if(element instanceof LiteralImpl) {
    		result = element.getName();
    	}
    	else if(element instanceof Always_Impl || element instanceof AlwaysWithin_Impl || element instanceof AlwaysWithin_and_Impl) {
    		result = "Globally";
    	}
    	else if(element instanceof Eventually_Impl || element instanceof EventuallyWithin_Impl || element instanceof EventuallyWithin_and_Impl) {
    		result = "Eventually";
    	}
    	else if(element instanceof _until_Impl || element instanceof _untilWithin_Impl || element instanceof _untilWithin_and_Impl) {
    		result = "Until";
    	}
    	else if(element instanceof Somewhere_InADistanceWithin_Impl) {
    		result = "Somewhere";
    	}
    	else if(element instanceof Everywhere_InADistanceWithin_Impl) {
    		result = "Everywhere";
    	}
    	else if(element instanceof Not_Impl) {
    		result = "Not";
    	}
    	else if(element instanceof _and_Impl) {
    		result = "And";
    	}
    	else if(element instanceof _or_Impl) {
    		result = "Or";
    	}
    	/*else if(element instanceof Reach_by_InADistanceWithin_Impl) {
		
		}
    	else if(element instanceof EscapeBy_withADistanceOfAtLeast_Impl) {
			
		}
    	else if(element instanceof _implies_Impl) {
    		
    	}
    	else if(element instanceof _lessThan_Impl) {
    		
    	}
    	else if(element instanceof _lessThanOrEqual_Impl) {
    		
    	}
    	else if(element instanceof _equal_Impl) {
    		
    	}
    	else if(element instanceof _greaterThan_Impl) {
    		
    	}
    	else if(element instanceof _greaterThanOrEqual_Impl) {
    		
    	}*/
    	else {
    		throw new Exception("Operator not supported: " + element.getClass());
    	}
		
		return result;
	}
	
	private static void addEvent(String event) {
		if(!events.contains(event))
			events.add(event);
	}
	
	private static void generate_monitorComponent(Element element, String filePath) throws IOException {
		String className = "jSSTLMonitor";
        File actualFile = new File(filePath, className + ".java");
        if(!actualFile.exists()) {
            FileWriter writer = new FileWriter(actualFile, false);

            writer.write("import java.io.IOException;\r\n"
            		+ "import java.util.ArrayList;\r\n"
            		+ "import java.util.HashMap;\r\n"
            		+ "import eu.quanticol.jsstl.core.formula.Signal;\r\n"
            		+ "import eu.quanticol.jsstl.core.formula.jSSTLScript;\r\n"
            		+ "import eu.quanticol.jsstl.core.space.GraphModel;\r\n"
            		+ "import eu.quanticol.jsstl.core.io.TraGraphModelReader;\r\n"
            		+ "import eu.quanticol.jsstl.core.monitor.SpatialBooleanSignal;\r\n"
            		+ "import eu.quanticol.jsstl.core.signal.BooleanSignal;\r\n"
            		+ "\r\n"
            		+ "public class jSSTLMonitor {\r\n"
            		+ "\r\n"
            		+ "\tprivate static GraphModel graph;\r\n"
            		+ "\tprivate static jSSTLScript script;\r\n"
            		+ "\r\n"
            		+ "\tpublic static void reset() throws Exception {\r\n"
            		+ "\t\tTraGraphModelReader graphread = new TraGraphModelReader();\r\n"
            		+ "\t\tgraph = graphread.read(\"models/spatialModel.tra\");\r\n"
            		+ "\t\tgraph.dMcomputation();\r\n"
            		+ "\t\tscript = new formulaScript();\r\n"
            		+ "\t}\r\n"
            		+ "\t\r\n"
            		+ "\tpublic static double runCheck(ArrayList<HashMap<String, Double>> events) throws Exception {\r\n"
            		+ "\t\tdouble result = check(script, \"req\", graph, events);\r\n"
            		+ "\t\tSystem.out.println(\"result: \" + result);\r\n"
            		+ "\t\t\r\n"
            		+ "\t\treturn result;\r\n"
            		+ "\r\n"
            		+ "\t}\r\n"
            		+ "\t\r\n"
            		+ "\tprivate static double[][][] transform(ArrayList<HashMap<String, Double>> events, int locSize, int timeLength) {\r\n"
            		+ "\t\tint nrOfSignals = script.getVariables().length;\r\n"
            		+ "\t\tdouble[][][] result = new double[locSize][timeLength][nrOfSignals]; \r\n"
            		+ "\r\n"
            		+ "\t\tfor(int l = 0; l < locSize; l++) {\r\n"
            		+ "\t\t\tfor(int t = 0; t < timeLength; t++) {\r\n"
            		+ "\t\t\t\tfor(int i = 0; i < nrOfSignals; i++) {\r\n"
            		+ "\t\t\t\t\tString signal = script.getVariables()[i];\r\n"
            		+ "\r\n"
            		+ "\t\t\t\t\tif(t == timeLength-1)\r\n"
            		+ "\t\t\t\t\t\tresult[l][timeLength-1] = result[l][timeLength-2]; \r\n"
            		+ "\t\t\t\t\telse if(events.get(t).containsKey(signal))\r\n"
            		+ "\t\t\t\t\t\tresult[l][t][i] = events.get(t).get(signal);\r\n"
            		+ "\t\t\t\t\telse\r\n"
            		+ "\t\t\t\t\t\tresult[l][t][i] = -1.0;\r\n"
            		+ "\t\t\t\t}\r\n"
            		+ "\t\t\t}\r\n"
            		+ "\t\t}\r\n"
            		+ "\r\n"
            		+ "\t\treturn result;\r\n"
            		+ "\t}\r\n"
            		+ "\r\n"
            		+ "\tpublic static double check(jSSTLScript script, String formula, GraphModel graph, ArrayList<HashMap<String, Double>> events) throws IOException {\r\n"
            		+ "\t\tdouble[] times = new double[events.size()+1]; //there exists no signal which exists only in 1 time instance\r\n"
            		+ "\t\tfor(int i = 0; i < times.length; i++) {\r\n"
            		+ "\t\t\ttimes[i] = i*1.0;\r\n"
            		+ "\t\t}\r\n"
            		+ "\t\tdouble[][][] data = transform(events, graph.getNumberOfLocations(), times.length);\r\n"
            		+ "\t\tSignal s = new Signal(graph, times, data);\r\n"
            		+ "\t\tHashMap<String,Double> parValues = null;\r\n"
            		+ "\t\tSpatialBooleanSignal b = script.booleanCheck(parValues, formula, graph, s);\r\n"
            		+ "\r\n"
            		+ "\t\t//TODO: get value from different locations\r\n"
            		+ "\t\tBooleanSignal bt = b.spatialBoleanSignal.get(graph.getLocation(0));\r\n"
            		+ "\t\tboolean result = false;\r\n"
            		+ "\t\tif(!bt.signal.isEmpty()) //signal is false from start to end --> signal is empty --> interval is empty?\r\n"
            		+ "\t\t\tresult = bt.getValueAt(0);\r\n"
            		+ "\t\tSystem.out.println(\"Boolean signal: \" + bt);\r\n"
            		+ "\t\tSystem.out.println(\"Satisfied: \" + result);\r\n"
            		+ "\r\n"
            		+ "\t\treturn result ? 1.0 : -1.0;\r\n"
            		+ "\t}\r\n"
            		+ "}\r\n"
            		+ "");

            writer.close();
        }
	}
}