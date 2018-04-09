package main;

import java.util.Map;

public class Transition {
	protected String name;
	protected Effect effect;
	protected String toState;
	
	public Transition(String name, Effect effect, String toState) {
		this.name = name;
		this.effect = effect;
		this.toState = toState;
	}

	public String doTransition(Map<String, Integer> extendedState) {
		if(effect != null) effect.doEffect(extendedState);
		return toState;
	}
}
