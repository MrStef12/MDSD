package main;

import java.util.Map;

import main.FluentMachine.Condition;

public class ConditionalTransition extends Transition {
	
	private String stateName;
	private Condition condition;
	private int conditionValue;
	private Effect ifEffect;
	private String ifToState;
	
	public ConditionalTransition(String name, String stateName, Condition condition, int conditionValue,
			Effect ifEffect, String ifToState, Effect elseEffect, String elseToState) {
		super(name, elseEffect, elseToState);
		this.stateName = stateName;
		this.condition = condition;
		this.conditionValue = conditionValue;
		this.ifEffect = ifEffect;
		this.ifToState = ifToState;
	}

	@Override
	public String doTransition(Map<String, Integer> extendedState) {
		if(!extendedState.containsKey(stateName)) return toState;
		int stateValue = extendedState.get(stateName);
		boolean result = false;
		switch(condition) {
		case EQUALS:
			result = stateValue == conditionValue;
			break;
		case GREATER:
			result = stateValue > conditionValue;
			break;
		case LESS:
			result = stateValue < conditionValue;
			break;
		}
		if(result) {
			if(ifEffect != null) ifEffect.doEffect(extendedState);
			return ifToState;
		} else {
			return super.doTransition(extendedState);
		}
	}

}
