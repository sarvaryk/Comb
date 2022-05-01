package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import hu.bme.mit.gamma.tutorial.extra.Event;

public class Glue {
	private Eventually_displayYellow_monitor monitor = new Eventually_displayYellow_monitor();
	private Queue<String> eventQueue = new LinkedList<String>();
	private boolean isRaisedError = false;
	
	private Map<String, String> eventMappings = Map.of(
			"LightInputs.DisplayNone", "LightInputs_DisplayNone",
			"LightInputs.DisplayYellow", "LightInputs_DisplayYellow",
			"LightInputs.DisplayRed", "LightInputs_DisplayRed",
			"LightInputs.DisplayGreen", "LightInputs_DisplayGreen"
	);
	
	public void runCheck(Queue<Event> newEvents) {
		String event_sequence = "";
		for(int i = 0; i < newEvents.size()+1; i++) {
			event_sequence += eventMappings.get(newEvents.poll().getEvent());
			if(newEvents.size() > 0)
				event_sequence += "; ";
		}
		if (monitor.update(event_sequence) == -1)
			isRaisedError = true;
		else
			isRaisedError = false;
	}

	public void reset() {
		eventQueue.clear();
		isRaisedError = false;
		monitor.resetMonitor();
	}

	public boolean isRequirementMet() {
		return !isRaisedError;
	}
}