package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import eu.quanticol.jsstl.core.formula.Signal;
import eu.quanticol.jsstl.core.formula.jSSTLScript;
import eu.quanticol.jsstl.core.space.GraphModel;
import eu.quanticol.jsstl.core.io.SyntaxErrorExpection;
import eu.quanticol.jsstl.core.io.TraGraphModelReader;
import eu.quanticol.jsstl.core.monitor.SpatialBooleanSignal;
import eu.quanticol.jsstl.core.signal.BooleanSignal;

public class jSSTLMonitor {
	private String monitorName;
	private jSSTLScript script;
	private GraphModel graph;
	private String graphPath;
	private PrintStream logger;

	public jSSTLMonitor(String monitorName, String graphPath, jSSTLScript script, PrintStream logger) {
		this.monitorName = monitorName;
		this.graphPath = graphPath;
		this.script = script;
		this.logger = logger;
		reset();
	}

	public void reset() {
		log(monitorName + ": reset monitor", true);

		try {
			TraGraphModelReader graphReader = new TraGraphModelReader();
			graph = graphReader.read(graphPath);
			graph.dMcomputation();
		} catch (IOException | SyntaxErrorExpection e) {
			log(monitorName + ": " + e, true);
			log(monitorName + ": Error during reading the spatial model (" + graphPath + ")!", true);
		}
	}

	public boolean runCheck(ArrayList<HashMap<String, Double>> events, ArrayList<Double> timestamps, double startCheckTime) {
		boolean result = false;
		try {
			log(monitorName + " events: ", false);
			for(HashMap<String, Double> eventMaps : events) {
				log(eventMaps + " ", false);
			}
			log("", true);

			result = check(script, "req", graph, events, timestamps, startCheckTime);
		} catch (IOException e) {
			log(monitorName + ": " + e, true);
			log(monitorName + ": Error during checking the requirement", true);
		}

		return result;
	}

	private double[] transformTimestampStructure(ArrayList<Double> timestamps) {
		double[] times = new double[timestamps.size()+1]; //there exists no signal which exists only in 1 time instance

		for(int i = 1; i < times.length; i++) {
			double timestamp = timestamps.get(i-1);
			times[i] =  timestamp + (timestamp==0 ? 0.001 : 0); //there exists no signal which exists only in 1 time instance
		}

		return times;
	}

	private double[][][] transformEventStructure(ArrayList<HashMap<String, Double>> events, int locSize, int timeLength) {
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

	private boolean check(jSSTLScript script, String formula, GraphModel graph, ArrayList<HashMap<String, Double>> events, ArrayList<Double> timestamps, double startCheckTime) throws IOException {
		log(monitorName + ": checking requirement in progress", true);

		double[] times = transformTimestampStructure(timestamps);
		double[][][] data = transformEventStructure(events, graph.getNumberOfLocations(), times.length);
		Signal s = new Signal(graph, times, data);
		HashMap<String,Double> intervalParValues = null;
		SpatialBooleanSignal b = script.booleanCheck(intervalParValues, formula, graph, s);

		boolean result = false;
		for(int i = 0; i < graph.getLocations().size(); i++) {
			BooleanSignal bt = b.spatialBoleanSignal.get(graph.getLocation(i));
			if(!bt.signal.isEmpty()) //Workaround: signal is false from start to end --> signal is empty --> interval is empty (further investigation is needed)
				result = bt.getValueAt(startCheckTime);

			log(monitorName + " boolean signal: " + bt, true);
			log(monitorName + " satisfied: " + result, true);	
		}

		return result;
	}

	private void log(String text, boolean newLine) {
		if(logger != null) 
			if(newLine)
				logger.println(text);
			else
				logger.print(text);
	}
}
