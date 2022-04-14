package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Glue implements GlueInterface {
	private static final int MAX_COUNTER = 100;
	private int counter = 0;
	
	private Queue<String> eventQueue = new LinkedList<String>();
	private boolean isRaisedError = false;
	
	
	
	@Override
	public void runCheck(Queue<String> newEvents) {
		System.out.println("events: " + eventQueue + " + " + newEvents);
		
		ArrayList<HashMap<String, Double>> events = new ArrayList<>();
		for(String event : newEvents) {
			events.add((HashMap<String, Double>) Map.of(event, 1.0));
		}
		//Online to Offline monitoring
		//if(counter >= MAX_COUNTER) {		
		try {
			isRaisedError = jSSTLMonitor.runCheck(events) > 0.5;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			reset();
		}		
		/*}
		else {
			eventQueue.addAll(newEvents);
			counter++;
		}*/
	}

	@Override
	public void reset() {
		eventQueue.clear();
		isRaisedError = false;
		counter = 0;
		try {
			jSSTLMonitor.reset();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean isRequirementMet() {
		//TODO: robustness?
		//TODO: satisfied, error, inconclusive?
		return isRaisedError;
	}
}