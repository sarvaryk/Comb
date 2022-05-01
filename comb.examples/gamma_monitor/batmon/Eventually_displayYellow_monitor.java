package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.Collections;

public class Eventually_displayYellow_monitor extends AbstractMonitor {
	enum State {
		State_0,
		State_1
	}
	private State currentState;

	Eventually_displayYellow_monitor() { resetMonitor(); }

	@Override
	public int resetMonitor() {
		this.setRequirementSatisfied(0);
		this.setActivated(false);
		this.setName("Eventually_displayYellow");

		currentState = State.State_0;
		if(currentState.equals(State.State_1)) {
			return goodStateReached();
		}
		return 0;
	}

	@Override
	protected int goodStateReached() {
		System.out.println(getMessagePrefix() + "Good state reached!");
		setRequirementSatisfied(1);
		return 1;
	}

	@Override
	protected int badStateReached(String lastState, String lastEvent) {
		System.out.println(getMessagePrefix() + "Bad state reached!");
		setRequirementSatisfied(-1);
		return -1;
	}

	@Override
	public int update(String signal_sequence) {
		java.util.List<String> signals = new java.util.ArrayList<>();
		Collections.addAll(signals, signal_sequence.split("\\s*;\\s*"));

		boolean[] letters = new boolean[1];
		System.out.println(getMessagePrefix() + "State before update: " + currentState);

		java.util.List<String> signals_used = new java.util.ArrayList<>();
		if(signals.contains("LightInputs_DisplayYellow")) {
			letters[0] = true;
			signals_used.add("LightInputs_DisplayYellow");
		}
		System.out.println(getMessagePrefix() + "Signals sent: " + String.join("; ", signals));
		System.out.println(getMessagePrefix() + "Signals used: " + String.join("; ", signals_used));

		int result = 0;
		switch(currentState) {
			case State_0:
				result = State_0(letters, signal_sequence);
				break;
			case State_1:
				result = State_1(letters, signal_sequence);
				break;
		}
		System.out.println(getMessagePrefix() + "State after update: " + currentState + "\n");

		return result;
	}

	private int State_0(boolean[] letters, String signal_sequence) {
		if((!(letters[0])))
			currentState = State.State_0;
		else if((letters[0])) {
			currentState = State.State_1;
			return goodStateReached();
		}

		return 0;
	}

	private int State_1(boolean[] letters, String signal_sequence) {
			return goodStateReached();
	}

}