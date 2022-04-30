package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

import hu.bme.mit.gamma.tutorial.extra.Event;

public class Glue {
	private ArrayList<HashMap<String, Double>> events = new ArrayList<>();
	private ArrayList<Double> timestamps = new ArrayList<>();
	private double relativeTimestamp = 0.0;
	private boolean isRaisedError = false;
	
	private jSSTLMonitor jSSTLMonitor = new jSSTLMonitor("Monitor1", "models/spatialModel.tra", new Eventually_within_time_interval_displayYellow_FormulaScript(), System.out);
	
	public void runCheck(Queue<Event> newEvents) {
		HashMap<String, Double> tempEvent = new HashMap<>();
		for(Event event : newEvents) {
			tempEvent.put(event.getEvent(), 1.0);
		}
		events.add(tempEvent);
		timestamps.add(relativeTimestamp++);
	
		isRaisedError = jSSTLMonitor.runCheck(events, timestamps, 0) < 0.0;	
	}

	public void reset() {
		events.clear();
		timestamps.clear();
		relativeTimestamp = 0.0;
		isRaisedError = false;
		jSSTLMonitor.reset();
	}

	public boolean isRequirementMet() {
		return !isRaisedError;
	}
}