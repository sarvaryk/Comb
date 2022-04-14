package hu.bme.mit.gamma.tutorial.extra.monitor;

import hu.bme.mit.gamma.tutorial.extra.interfaces.*;

public interface MonitorInterface {

	public LightCommandsInterface.Required getLightInputs();
	public ErrorInterface.Provided getError();
	
	void runCycle();
	void reset();

}
