package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public class Glue implements GlueInterface {
	private ArrayList<HashMap<String, Double>> events = new ArrayList<>();
	private ArrayList<Double> timestamps = new ArrayList<>();
	private double relativeTimestamp = 0.0;
	private boolean isRaisedError = false;
	
	private jSSTLMonitor jSSTLMonitor = new jSSTLMonitor("Monitor1", "models/spatialModel.tra", System.out);
	
	@Override
	public void runCheck(Queue<String> newEvents) {
		System.out.println("events: " + events + " + " + newEvents);
		
		HashMap<String, Double> tempEvent = new HashMap<>();
		for(String event : newEvents) {
			tempEvent.put(event, 1.0);
		}
		events.add(tempEvent);
		timestamps.add(relativeTimestamp++);
	
		isRaisedError = jSSTLMonitor.runCheck(events, timestamps, 0) < 0.0;	
	}

	@Override
	public void reset() {
		events.clear();
		timestamps.clear();
		relativeTimestamp = 0.0;
		isRaisedError = false;
		jSSTLMonitor.reset();
	}

	@Override
	public boolean isRequirementMet() {
		return isRaisedError;
	}
}