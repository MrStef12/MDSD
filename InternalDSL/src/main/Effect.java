package main;

import java.util.Map;

import main.FluentMachine.EffectAction;

public class Effect {
	private String stateName;
	private EffectAction action;
	private int value;
	
	public Effect(String stateName, EffectAction action, int value) {
		this.stateName = stateName;
		this.action = action;
		this.value = value;
	}

	public void doEffect(Map<String, Integer> extendedState) {
		if(!extendedState.containsKey(stateName)) return;
		int stateValue = extendedState.get(stateName);
		switch(action) {
		case SET:
			stateValue = value;
			break;
		case CHANGE:
			stateValue += value;
			break;
		}
		extendedState.put(stateName, stateValue);
	}
}
