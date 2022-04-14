package hu.bme.mit.gamma.tutorial.extra.monitor;

public abstract class AbstractMonitor {
	private String name;
	private int requirementSatisfied;
	private boolean isActivated;

	public abstract int update(String signal_sequence);

	protected abstract int goodStateReached();

	protected abstract int badStateReached(String lastState, String lastEvent);

	public abstract int resetMonitor();

	protected String getMessagePrefix() { return "\t" + getName() + ": "; }

	public String getName() { return name; }

	protected void setName(String name) { this.name = name; }

	public int getRequirementSatisfied() { return requirementSatisfied; }

	protected void setRequirementSatisfied(int requirementSatisfied) { this.requirementSatisfied = requirementSatisfied; }

	public boolean isActivated() { return isActivated; }

	public void setActivated(boolean activated) { isActivated = activated; }
}