package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Glue implements GlueInterface {
	private not_red monitor = new not_red();
	private Queue<String> eventQueue = new LinkedList<String>();
	private boolean isRaisedError = false;
	
	private Map<String, String> eventMappings = Map.of(
			"LightInputs.displayNone", "displayNone",
			"LightInputs.displayYellow", "displayYellow",
			"LightInputs.displayRed", "displayRed",
			"LightInputs.displayGreen", "displayGreen"
	);
	
	
	@Override
	public void runCheck(Queue<String> newEvents) {
		System.out.println("events: " + eventQueue + " + " + newEvents);
		//Online to Offline monitoring
		//if(counter >= MAX_COUNTER) {
			/*try {
				isRaisedError = jSSTLMonitor.runCheck(eventQueue) > 0.5;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				reset();
			}*/	
		String event_sequence = "";
		for(int i = 0; i < newEvents.size()+1; i++) {
			event_sequence += eventMappings.get(newEvents.poll());
			if(newEvents.size() > 0)
				event_sequence += "; ";
		}
		if (monitor.update(event_sequence) == -1)
			isRaisedError = true;
		else
			isRaisedError = false;
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
		monitor.resetMonitor();
	}

	@Override
	public boolean isRequirementMet() {
		//TODO: robustness?
		//TODO: satisfied, error, inconclusive?
		return isRaisedError;
	}
}