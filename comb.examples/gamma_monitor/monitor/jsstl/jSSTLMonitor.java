package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import eu.quanticol.jsstl.core.formula.Signal;
import eu.quanticol.jsstl.core.formula.jSSTLScript;
import eu.quanticol.jsstl.core.space.GraphModel;
import eu.quanticol.jsstl.core.io.TraGraphModelReader;
import eu.quanticol.jsstl.core.monitor.SpatialBooleanSignal;
import eu.quanticol.jsstl.core.signal.BooleanSignal;

public class jSSTLMonitor {

	private static GraphModel graph;
	private static double dmtime;
	private static String trajPref;
	private static int locations;
	private static jSSTLScript script;
	
	public static void reset() throws Exception {
		//long tStart = System.currentTimeMillis();
		TraGraphModelReader graphread = new TraGraphModelReader();
		graph = graphread.read("models/bssSpatialModel.tra");
		long start = System.currentTimeMillis();
		graph.dMcomputation();
		dmtime = (System.currentTimeMillis()-start)/1000.0;
		trajPref = "models/trajectories/traj";
		locations = graph.getNumberOfLocations();
		script = new formulaScript();
	}
	
	public static double runCheck(ArrayList<HashMap<String, Double>> events) throws Exception {
		reset();

		double result = check(script, "phi1", graph, locations, events, trajPref);
		System.out.println("phi1: "+result);
		System.out.println("DM Computation: "+dmtime);
		
		return result;

	}

	public static Signal readTraj(GraphModel graph, String filename) throws IOException{
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> strings = new ArrayList<String>();
		String line = null;
		while ((line = br.readLine()) != null) {
			strings.add(line);
		}
		int timeSize = strings.size() - 2;
		int locSize = (strings.get(0).split("\t\t").length - 1) / 2;
		double[][][] data = new double[locSize][timeSize][2];
		double[] time = new double[strings.size()];
		for (int t = 0; t < strings.size()-1; t++) {
			String[] splitted = strings.get(t+1).split("\t\t");
			time[t] = Double.valueOf(splitted[0]);
		}
		
		int timeLength = time.length;
		for (int i = 1; i < timeLength; i++) {
			if (time[i] == 0) {
				timeLength = i;
			}
		}
		final double[] times = new double[timeLength];
		for (int t = 0; t < timeLength; t++) {
			times[t] = time[t];
		}
	
		for (int t = 0; t < timeLength; t++) {
			String[] splitted = strings.get(t+1).split("\t\t");
			for (int i = 0; i < locSize; i++) {		
				data[i][t][0] = Double.valueOf(splitted[i+1]);
				data[i][t][1] = Double.valueOf(splitted[i+1+locSize]);
			}
		}
		br.close();
		fr.close();
		Signal s = new Signal(graph, times, data);
		return s;
 }

	public static double check( jSSTLScript script, String formula, GraphModel graph, int locations, ArrayList<HashMap<String,Double>> params , String trajPref) throws IOException {
		Signal s = readTraj(graph, trajPref + 0 + ".txt");
		HashMap<String,Double> parValues = params.get(0);
		//double[] result = script.booleanSat(formula, parValues, graph, s);
		SpatialBooleanSignal b = script.booleanCheck(parValues, formula, graph, s);
		BooleanSignal bt = b.spatialBoleanSignal.get(graph.getLocation(0));
		boolean result = bt.getValueAt(0);
		System.out.println("Boolean signal:" + bt);
		System.out.println("Satisfied: " + result);
		
		return result ? 1.0 : 0.0;
		
		/*ArrayList<SignalStatistics> statphi = new ArrayList<SignalStatistics>();
		double[][] mean = new double[params.size()][locations];
		double[][] stdev = new double[params.size()][locations];
		double time = 0.0;
		String textMean = "";
		String textStdev = "";
//		String textphi3 = "";
//		String textphi4 = "";
		for (int i = 0; i < params.size(); i++) {
			statphi.add(i, new SignalStatistics(locations));
		}
		
		for (int i = 0; i < runs; i++) {
			System.out.println("("+formula+") Trajectory:" + i);
			Signal s = readTraj(graph, trajPref + i + ".txt");
			for (int k = 0; k < params.size(); k++) {
				HashMap<String,Double> parValues = params.get(k);
				long tStartB = System.currentTimeMillis();
				statphi.get(k).add(script.booleanSat(formula, parValues, graph, s));
				long tEndB = System.currentTimeMillis();
				double elapsedSecondsB = (tEndB - tStartB) / 1000.0;
				time += elapsedSecondsB;
			}
		}

		for (int k = 0; k < params.size(); k++) {
			for (int l = 0; l < locations; l++) {
				// double [] min1 = statphi1.get(k).getMin();
				// double [] max1 = statphi1.get(k).getMax();
				mean[k][l] = statphi.get(k).getAverage()[l];
				textMean += String.format(Locale.US, " %20.10f", mean[k][l]);
				stdev[k][l] = statphi.get(k).getStandardDeviation()[l];
				textStdev += String.format(Locale.US, " %20.10f", stdev[k][l]);
			}
			textMean += "\n";
			textStdev += "\n";
		}
		PrintWriter meanprinter = new PrintWriter("data/"+formula+"_mean.txt");
		meanprinter.print(textMean);
		meanprinter.close();
		PrintWriter stprinter = new PrintWriter("data/"+formula+"_sdev.txt");
		stprinter.print(textStdev);
		stprinter.close();
		return time/runs;*/
	}
	
}
