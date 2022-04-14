package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.Queue;

public interface GlueInterface {
	public void runCheck(Queue<String> eventQueue);

	public void reset();
	
	public boolean isRequirementMet();
}