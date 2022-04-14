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
	
	public static void generate(ElementImpl element, String filePath) throws IOException, Exception {
        File dir = new File(filePath);
        dir.mkdirs();

		generate_formulaScript(element, filePath);
		generate_monitorComponent(element, filePath);
	}
	
	private static void generate_formulaScript(ElementImpl element, String filePath) throws IOException, Exception {
		String className = "formulaScript";
        File actualFile = new File(filePath, className + ".java");
        if(!actualFile.exists()) {
        	events = new ArrayList<>();
        	String formula = getOperatorCode(element, true);
			
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
    		if(isIntervalParameter) {
    			result = element.getName();
    		}
    		else {
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
    	}
    	else if(element instanceof Always_Impl || element instanceof AlwaysWithin_Impl || element instanceof AlwaysWithin_and_Impl) {
    		result =  "new GloballyFormula(\r\n"
    				+ "new ParametricInterval( \r\n"
    				+ getIntervalParameterCode(element.getL(), false)
    				+ ",\r\n"
    				+ getIntervalParameterCode(element.getH(), true)
    				+ "),\r\n"
    				+ getOperatorCode(element.getP(), false)+"\r\n"
    			
    				+ ")\r\n";
    	}
    	else if(element instanceof Eventually_Impl || element instanceof EventuallyWithin_Impl || element instanceof EventuallyWithin_and_Impl) {
    		result =  "new EventuallyFormula(\r\n"
    				+ "new ParametricInterval( \r\n"
    				+ getIntervalParameterCode(element.getL(), false)
    				+ ",\r\n"
    				+ getIntervalParameterCode(element.getH(), true)
    				+ "),\r\n"
    				+ getOperatorCode(element.getP(), false)+"\r\n"
    			
    				+ ")\r\n";
    	}
    	else if(element instanceof Somewhere_InADistanceWithin_Impl) {
    		result =  "new SomewhereFormula(\r\n"
    				+ "new ParametricInterval( \r\n"
    				+ 0
    				+ ",\r\n"
    				+ getIntervalParameterCode(element.getD(), true)
    				+ "),\r\n"
    				+ getOperatorCode(element.getP(), false)+"\r\n"
    			
    				+ ")\r\n";
    	}
    	else if(element instanceof Everywhere_InADistanceWithin_Impl) {
    		result =  "new EverywhereFormula(\r\n"
    				+ "new ParametricInterval( \r\n"
    				+ 0
    				+ ",\r\n"
    				+ getIntervalParameterCode(element.getD(), true)
    				+ "),\r\n"
    				+ getOperatorCode(element.getP(), false)+"\r\n"
    			
    				+ ")\r\n";
    	}
    	else if(element instanceof _until_Impl || element instanceof _untilWithin_Impl || element instanceof _untilWithin_and_Impl) {
    		result =  "new UntilFormula(\r\n"
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
    		result =  "new NotFormula(\r\n"
    				+ getOperatorCode(element.getP(), false)+"\r\n"
    				+ ")\r\n";
    	}
    	else if(element instanceof _and_Impl) {
    		result =  "new AndFormula(\r\n"
    				+ getOperatorCode(element.getP(), false)+",\r\n"
    				+ getOperatorCode(element.getQ(), false)+"\r\n"
    				+ ")\r\n";
    	}
    	else if(element instanceof _or_Impl) {
    		result =  "new OrFormula(\r\n"
    				+ getOperatorCode(element.getP(), false)+",\r\n"
    				+ getOperatorCode(element.getQ(), false)+"\r\n"
    				+ ")\r\n";
    	}
    	else if(element instanceof _implies_Impl) {
    		result =  "new OrFormula(\r\n"
    				+ "new NotFormula(\r\n"
    	    		+ getOperatorCode(element.getP(), false)+"\r\n"
    	    		+ "),\r\n"
    				+ getOperatorCode(element.getQ(), false)+"\r\n"
    				+ ")\r\n";
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
			
			String p, q;
			try{
				Double.parseDouble(element.getP().getName());
				p = element.getP().getName();
	        }
	        catch (NumberFormatException ex){
    			addEvent(element.getP().getName());
	            p = "variables[getIndex("+events.indexOf(element.getP().getName())+")]";
	        }
			
			try{
				Double.parseDouble(element.getQ().getName());
				q = element.getQ().getName();
	        }
	        catch (NumberFormatException ex){
	        	addEvent(element.getQ().getName());
	        	q = "variables[getIndex("+events.indexOf(element.getQ().getName())+")]";
	        }
			
			result =  "new AtomicFormula(\r\n"
					+ "new ParametricExpression() {\r\n"
					+ "public SignalExpression eval( final Map<String,Double> parameters ) {\r\n"
					+ "return new SignalExpression() {\r\n"
					+ "public double eval( double ... variables ) {\r\n"
					+ "return ("+ p + " " + operator + " " + q +") ? 1.0 : -1.0;\r\n"
					+ "}\r\n"
					+ "};\r\n"
					+ "}\r\n"
					+ "}, false)\r\n";
    	}
    	else {
    		throw new Exception("Operator not supported: " + element.getClass());
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
            		+ "import eu.quanticol.jsstl.core.io.SyntaxErrorExpection;\r\n"
            		+ "import eu.quanticol.jsstl.core.io.TraGraphModelReader;\r\n"
            		+ "import eu.quanticol.jsstl.core.monitor.SpatialBooleanSignal;\r\n"
            		+ "import eu.quanticol.jsstl.core.signal.BooleanSignal;\r\n"
            		+ "\r\n"
            		+ "public class jSSTLMonitor {\r\n"
            		+ "\tprivate jSSTLScript script;\r\n"
            		+ "\tprivate GraphModel graph;\r\n"
            		+ "\tprivate String graphPath;\r\n"
            		+ "\r\n"
            		+ "\tpublic jSSTLMonitor(String graphPath) {\r\n"
            		+ "\t\tthis.graphPath = graphPath;\r\n"
            		+ "\t\treset();\r\n"
            		+ "\t}\r\n"
            		+ "\r\n"
            		+ "\tpublic void reset() {\r\n"
            		+ "\t\ttry {\r\n"
            		+ "\t\t\tTraGraphModelReader graphReader = new TraGraphModelReader();\r\n"
            		+ "\t\t\tgraph = graphReader.read(graphPath);\r\n"
            		+ "\t\t\tgraph.dMcomputation();\r\n"
            		+ "\t\t\tscript = new formulaScript();\r\n"
            		+ "\t\t} catch (IOException | SyntaxErrorExpection e) {\r\n"
            		+ "\t\t\te.printStackTrace();\r\n"
            		+ "\t\t\tSystem.out.println(\"Error during reading the spatial model (\" + graphPath + \")!\");\r\n"
            		+ "\t\t}\r\n"
            		+ "\t}\r\n"
            		+ "\r\n"
            		+ "\tpublic double runCheck(ArrayList<HashMap<String, Double>> events) {\r\n"
            		+ "\t\tdouble result = 0.0;\r\n"
            		+ "\t\ttry {\r\n"
            		+ "\t\t\tresult = check(script, \"req\", graph, events);\r\n"
            		+ "\t\t} catch (IOException e) {\r\n"
            		+ "\t\t\te.printStackTrace();\r\n"
            		+ "\t\t\tSystem.out.println(\"Error during checking the requirement: \" );\r\n"
            		+ "\t\t}\r\n"
            		+ "\r\n"
            		+ "\t\tSystem.out.println(\"result: \" + result);\r\n"
            		+ "\t\treturn result;\r\n"
            		+ "\t}\r\n"
            		+ "\r\n"
            		+ "\tprivate double[][][] transform(ArrayList<HashMap<String, Double>> events, int locSize, int timeLength) {\r\n"
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
            		+ "\tpublic double check(jSSTLScript script, String formula, GraphModel graph, ArrayList<HashMap<String, Double>> events) throws IOException {\r\n"
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
            		+ "}");

            writer.close();
        }
	}
}