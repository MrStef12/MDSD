package main;

import java.util.HashMap;
import java.util.Map;

public class StateMachineExecutor {
	
	private State activeState;
	private Map<String, State> possibleStates;
	private Map<String, Integer> extendedState;
	
	public StateMachineExecutor(MetaModel model) {
		this.possibleStates = new HashMap<>();
		this.extendedState = new HashMap<>();
		for(State s : model.getStates()) {
			this.possibleStates.put(s.getName(), s);
		}
		for(String s : model.getExtendedStates()) {
			this.extendedState.put(s, 0);
		}
		this.activeState = model.getStates()[0];
	}
	
	public void processEvent(String event) {
		System.out.println("Processing event \"" + event + "\"...");
		String newState = activeState.doTransition(event, extendedState);
		if(newState == null || newState.isEmpty()) return;
		State possibleState = possibleStates.get(newState);
		if(possibleState == null) {
			System.out.println("Invalid transition! Cannot find state: " + newState);
		}
		activeState = possibleState;
	}
	
	public void printState() {
		System.out.println("Current state: " + this.activeState.getName());
		System.out.println("Possible transitions:");
		for(String name : activeState.getTransitions().keySet()) {
			System.out.println(" - " + name);
		}
		System.out.println("Current extended state:");
		for(String name : extendedState.keySet()) {
			System.out.println(" - " + name + ": " + extendedState.get(name));
		}
	}
	
}
