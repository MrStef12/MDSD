package main;

import java.util.Map;

public class State {
	private String name;
	private Map<String, Transition> transitions;
	
	public State(String name, Map<String, Transition> transitions) {
		this.name = name;
		this.transitions = transitions;
	}
	
	public String doTransition(String name, Map<String, Integer> extendedState) {
		if(!transitions.containsKey(name)) return null;
		return transitions.get(name).doTransition(extendedState);
	}
	
	public String getName() {
		return name;
	}

	public Map<String, Transition> getTransitions() {
		return transitions;
	}
}
