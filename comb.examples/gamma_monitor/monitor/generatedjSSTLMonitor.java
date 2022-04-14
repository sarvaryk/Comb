import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import eu.quanticol.jsstl.core.formula.Signal;
import eu.quanticol.jsstl.core.formula.jSSTLScript;
import eu.quanticol.jsstl.core.space.GraphModel;
import eu.quanticol.jsstl.core.io.TraGraphModelReader;
import eu.quanticol.jsstl.core.monitor.SpatialBooleanSignal;
import eu.quanticol.jsstl.core.signal.BooleanSignal;

public class generatedjSSTLMonitor {

	private static GraphModel graph;
	private static jSSTLScript script;

	public static void reset() throws Exception {
		TraGraphModelReader graphread = new TraGraphModelReader();
		graph = graphread.read("models/spatialModel.tra");
		graph.dMcomputation();
		script = new generatedformulaScript();
	}
	
	public static double runCheck(ArrayList<HashMap<String, Double>> events) throws Exception {
		double result = check(script, "req", graph, events);
		System.out.println("result: " + result);
		
		return result;

	}
	
	private static double[][][] transform(ArrayList<HashMap<String, Double>> events, int locSize, int timeLength) {
		int nrOfSignals = script.getVariables().length;
		double[][][] result = new double[locSize][timeLength][nrOfSignals]; 

		for(int l = 0; l < locSize; l++) {
			for(int t = 0; t < timeLength; t++) {
				for(int i = 0; i < nrOfSignals; i++) {
					String signal = script.getVariables()[i];

					if(t == timeLength-1)
						result[l][timeLength-1] = result[l][timeLength-2]; 
					else if(events.get(t).containsKey(signal))
						result[l][t][i] = events.get(t).get(signal);
					else
						result[l][t][i] = -1.0;
				}
			}
		}

		return result;
	}

	public static double check(jSSTLScript script, String formula, GraphModel graph, ArrayList<HashMap<String, Double>> events) throws IOException {
		double[] times = new double[events.size()+1]; //there exists no signal which exists only in 1 time instance
		for(int i = 0; i < times.length; i++) {
			times[i] = i*1.0;
		}
		double[][][] data = transform(events, graph.getNumberOfLocations(), times.length);
		Signal s = new Signal(graph, times, data);
		HashMap<String,Double> parValues = null;
		SpatialBooleanSignal b = script.booleanCheck(parValues, formula, graph, s);

		//TODO: get value from different locations
		BooleanSignal bt = b.spatialBoleanSignal.get(graph.getLocation(0));
		boolean result = false;
		if(!bt.signal.isEmpty()) //signal is false from start to end --> signal is empty --> interval is empty?
			result = bt.getValueAt(0);
		System.out.println("Boolean signal: " + bt);
		System.out.println("Satisfied: " + result);

		return result ? 1.0 : 0.0;
	}
}
