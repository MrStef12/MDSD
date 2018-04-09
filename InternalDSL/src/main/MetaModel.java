package main;

import java.util.Set;

public class MetaModel {
	
	private Set<String> extendedStates;
	private State[] states;
	
	public MetaModel(Set<String> extendedStates, State[] states) {
		this.extendedStates = extendedStates;
		this.states = states;
	}

	public Set<String> getExtendedStates() {
		return extendedStates;
	}

	public State[] getStates() {
		return states;
	}
	
}
