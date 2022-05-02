package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

import hu.bme.mit.gamma.tutorial.extra.Event;

public class Glue {
	private ArrayList<HashMap<String, Double>> events = new ArrayList<>();
	private ArrayList<Double> timestamps = new ArrayList<>();
	private double relativeTimestamp = 0.0;
	private boolean Eventually_displayYellow_isRaisedError = false;
	private boolean No_Red_and_Green_isRaisedError = false;
	
	private jSSTLMonitor Eventually_displayYellow = new jSSTLMonitor("Eventually_displayYellow", "models/spatialModel.tra", new Eventually_within_time_interval_displayYellow_FormulaScript(), System.out);
	private jSSTLMonitor No_Red_and_Green = new jSSTLMonitor("No_Red_and_Green", "models/spatialModel.tra", new No_Red_and_Green_at_the_same_time_FormulaScript(), System.out);
	
	public void runCheck(Queue<Event> newEvents) {
		HashMap<String, Double> tempEvent = new HashMap<>();
		for(Event event : newEvents) {
			tempEvent.put(event.getEvent(), 1.0);
		}
		events.add(tempEvent);
		timestamps.add(relativeTimestamp++);
	
		Eventually_displayYellow_isRaisedError = Eventually_displayYellow.runCheck(events, timestamps, 0);
		No_Red_and_Green_isRaisedError = No_Red_and_Green.runCheck(events, timestamps, 0);
	}

	public void reset() {
		events.clear();
		timestamps.clear();
		relativeTimestamp = 0.0;
		Eventually_displayYellow_isRaisedError = false;
		Eventually_displayYellow.reset();
		No_Red_and_Green_isRaisedError = false;
		No_Red_and_Green.reset();
	}

	public boolean isRaisedError() {
		return Eventually_displayYellow_isRaisedError || No_Red_and_Green_isRaisedError;
	}
}