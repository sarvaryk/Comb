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
		glue.runCheck(eventQueue);
		
		eventQueue.clear();
	}

	@Override
	public void reset() {
		System.out.println("reset()");
		
		eventQueue.clear();
		lightInputs = new LightInputs();
		error = new Error();
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