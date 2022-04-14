package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import hu.bme.mit.gamma.tutorial.extra.interfaces.ErrorInterface;
import hu.bme.mit.gamma.tutorial.extra.interfaces.LightCommandsInterface;

public class Monitor implements MonitorInterface {
	private Queue<String> eventQueue = new LinkedList<String>();
	private LightInputs lightInputs = new LightInputs();
	private Error error = new Error();
	private Glue glue = new Glue();
	
	public Monitor() { reset(); }
	
	@Override
	public void runCycle() {
		System.out.println("runCycle()");
		
		glue.runCheck(eventQueue);
		
		eventQueue.clear();
	}

	@Override
	public void reset() {
		System.out.println("reset()");
		
		eventQueue.clear();
		lightInputs = new LightInputs();
		error = new Error();
		//notifyListeners();
		glue.reset();
	}

	public class LightInputs implements LightCommandsInterface.Required {
		private List<LightCommandsInterface.Listener.Required> listeners = new LinkedList<LightCommandsInterface.Listener.Required>();
		@Override
		public void raiseDisplayNone() {
			System.out.println("raiseDisplayNone()");
			eventQueue.add("LightInputs.displayNone");
		}
		@Override
		public void raiseDisplayRed() {
			System.out.println("raiseDisplayRed()");
			eventQueue.add("LightInputs.displayRed");
		}
		@Override
		public void raiseDisplayYellow() {
			System.out.println("raiseDisplayYellow()");
			eventQueue.add("LightInputs.displayYellow");
		}
		@Override
		public void raiseDisplayGreen() {
			System.out.println("raiseDisplayGreen()");
			eventQueue.add("LightInputs.displayGreen");
		}
		@Override
		public void registerListener(LightCommandsInterface.Listener.Required listener) {
			listeners.add(listener);
		}
		@Override
		public List<LightCommandsInterface.Listener.Required> getRegisteredListeners() {
			return listeners;
		}
	}
	
	public LightInputs getLightInputs() {
		return lightInputs;
	}
	
	public class Error implements ErrorInterface.Provided {
		private List<ErrorInterface.Listener.Provided> listeners = new LinkedList<ErrorInterface.Listener.Provided>();
		@Override
		public boolean isRaisedError() {
			System.out.println("glue.isRequirementMet():" + glue.isRequirementMet());
			return glue.isRequirementMet();
		}
		@Override
		public void registerListener(ErrorInterface.Listener.Provided listener) {
			listeners.add(listener);
		}
		@Override
		public List<ErrorInterface.Listener.Provided> getRegisteredListeners() {
			return listeners;
		}
	}
	
	@Override
	public Error getError() {
		return error;
	}
	
	public void notifyAllListeners() {
		notifyListeners();
	}
	
	public void notifyListeners() {
		if (error.isRaisedError()) {
			for (ErrorInterface.Listener.Provided listener : error.getRegisteredListeners()) {
				listener.raiseError();
			}
		}
	}

	public boolean isStateActive(String region, String state) {
		// TODO Auto-generated method stub
		return true;
	}

	public void runComponent() {
		runCycle();
	}

}

/*package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import hu.bme.mit.gamma.tutorial.extra.*;
import hu.bme.mit.gamma.tutorial.extra.TimerInterface.*;
import hu.bme.mit.gamma.tutorial.extra.interfaces.*;
import hu.bme.mit.gamma.tutorial.extra.monitor.MonitorStatemachine.*;

public class Monitor implements MonitorInterface {
	// Port instances
	private LightInputs lightInputs = new LightInputs();
	private Error error = new Error();
	// Wrapped statemachine
	private MonitorStatemachine monitor;
	// Indicates which queue is active in a cycle
	private boolean insertQueue = true;
	private boolean processQueue = false;
	// Event queues for the synchronization of statecharts
	private Queue<Event> eventQueue1 = new LinkedList<Event>();
	private Queue<Event> eventQueue2 = new LinkedList<Event>();
	// Clocks
	private TimerInterface timer = new OneThreadedTimer();
	
	public Monitor() {
		monitor = new MonitorStatemachine();
	}
	
	public void reset() {
		// Clearing the in events
		insertQueue = true;
		processQueue = false;
		eventQueue1.clear();
		eventQueue2.clear();
		//
		monitor.reset();
		timer.saveTime(this);
		notifyListeners();
	}

	public void changeEventQueues() {
		insertQueue = !insertQueue;
		processQueue = !processQueue;
	}
	
	public void changeInsertQueue() {
		insertQueue = !insertQueue;
	}
	
	public boolean isEventQueueEmpty() {
		return getInsertQueue().isEmpty();
	}
	
	private Queue<Event> getInsertQueue() {
		if (insertQueue) {
			return eventQueue1;
		}
		return eventQueue2;
	}
	
	private Queue<Event> getProcessQueue() {
		if (processQueue) {
			return eventQueue1;
		}
		return eventQueue2;
	}
	
	public class LightInputs implements LightCommandsInterface.Required {
		private List<LightCommandsInterface.Listener.Required> listeners = new LinkedList<LightCommandsInterface.Listener.Required>();
		@Override
		public void raiseDisplayNone() {
			getInsertQueue().add(new Event("LightInputs.displayNone"));
		}
		@Override
		public void raiseDisplayRed() {
			getInsertQueue().add(new Event("LightInputs.displayRed"));
		}
		@Override
		public void raiseDisplayYellow() {
			getInsertQueue().add(new Event("LightInputs.displayYellow"));
		}
		@Override
		public void raiseDisplayGreen() {
			getInsertQueue().add(new Event("LightInputs.displayGreen"));
		}
		@Override
		public void registerListener(LightCommandsInterface.Listener.Required listener) {
			listeners.add(listener);
		}
		@Override
		public List<LightCommandsInterface.Listener.Required> getRegisteredListeners() {
			return listeners;
		}
	}
	
	public LightInputs getLightInputs() {
		return lightInputs;
	}
	
	public class Error implements ErrorInterface.Provided {
		private List<ErrorInterface.Listener.Provided> listeners = new LinkedList<ErrorInterface.Listener.Provided>();
		@Override
		public boolean isRaisedError() {
			return monitor.getError_error_Out();
		}
		@Override
		public void registerListener(ErrorInterface.Listener.Provided listener) {
			listeners.add(listener);
		}
		@Override
		public List<ErrorInterface.Listener.Provided> getRegisteredListeners() {
			return listeners;
		}
	}
	
	public Error getError() {
		return error;
	}
	
	public void runCycle() {
		changeEventQueues();
		runComponent();
	}
	
	public void runComponent() {
		Queue<Event> eventQueue = getProcessQueue();
		while (!eventQueue.isEmpty()) {
			Event event = eventQueue.remove();
			switch (event.getEvent()) {
				case "LightInputs.displayNone": 
					monitor.setLightInputs_displayNone_In(true);
				break;
				case "LightInputs.displayRed": 
					monitor.setLightInputs_displayRed_In(true);
				break;
				case "LightInputs.displayYellow": 
					monitor.setLightInputs_displayYellow_In(true);
				break;
				case "LightInputs.displayGreen": 
					monitor.setLightInputs_displayGreen_In(true);
				break;
				default:
					throw new IllegalArgumentException("No such event: " + event);
			}
		}
		executeStep();
	}
	
	private void executeStep() {
		monitor.runCycle();
		notifyListeners();
	}
	
	public void notifyAllListeners() {
		notifyListeners();
	}
	
	public void notifyListeners() {
		if (error.isRaisedError()) {
			for (ErrorInterface.Listener.Provided listener : error.getRegisteredListeners()) {
				listener.raiseError();
			}
		}
	}
	
	public void setTimer(TimerInterface timer) {
		this.timer = timer;
	}
	
	public boolean isStateActive(String region, String state) {
		switch (region) {
			case "main_region":
				return monitor.getMain_region() == Main_region.valueOf(state);
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return monitor.toString();
	}
}*/
