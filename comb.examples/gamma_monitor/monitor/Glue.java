package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public class Glue implements GlueInterface {
	ArrayList<HashMap<String, Double>> events = new ArrayList<>();
	private boolean isRaisedError = false;
	private jSSTLMonitor jSSTLMonitor = new jSSTLMonitor("models/spatialModel.tra");
	
	@Override
	public void runCheck(Queue<String> newEvents) {
		System.out.println("events: " + events + " + " + newEvents);
		
		HashMap<String, Double> tempEvent = new HashMap<>();
		for(String event : newEvents) {
			tempEvent.put(event, 1.0);
		}
		events.add(tempEvent);
	
		isRaisedError = jSSTLMonitor.runCheck(events) < 0.0;	
	}

	@Override
	public void reset() {
		events.clear();
		isRaisedError = false;
		jSSTLMonitor.reset();
	}

	@Override
	public boolean isRequirementMet() {
		return isRaisedError;
	}
}