package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FluentMachine {

	public enum EffectAction {
		SET, CHANGE
	}
	
	public enum Condition {
		EQUALS, GREATER, LESS
	}
	
	private Set<String> extendedStates;
	private List<State> states;
	
	// General state and transition temporary values
	private Map<String, Transition> stateTransitions;
	private String tempStateName;
	private String tempTransitionName;
	private String tempTransitionTo;
	private Effect tempEffect;
	
	// Conditional transition temporary values
	private String tempCondTransStateName;
	private Condition tempCondTransCond;
	private int tempCondTransValue;
	private Effect tempCondTransEffect;
	private String tempCondTransTo;
	
	/*
	 * Create a new Fluent Machine
	 */
	public static FluentMachine builder() {
		return new FluentMachine();
	}
	
	public FluentMachine() {
		extendedStates = new HashSet<>();
		states = new ArrayList<>();
		cleanStateFields();
		cleanTransitionFields();
	}
	
	/*
	 * Add new integer state
	 */
	public FluentMachine integerState(String name) {
		extendedStates.add(name);
		return this;
	}
	
	/*
	 * Add new State
	 */
	public FluentMachine state(String name) {
		if(!tempStateName.isEmpty()) generateState();
		tempStateName = name;
		return this;
	}
	
	/*
	 * Add transition to state. If the temp transition name is not empty, it means
	 * that we should finish the previous transition
	 */
	public FluentMachine transition(String name) {
		if(!tempTransitionName.isEmpty()) generateTransition();
		tempTransitionName = name;
		return this;
	}
	
	/*
	 * Transition destination state
	 */
	public FluentMachine to(String name) {
		tempTransitionTo = name;
		return this;
	}
	
	/*
	 * Creates an effect for setting the given state name
	 */
	public FluentMachine setState(String stateName, int value) {
		tempEffect = new Effect(stateName, EffectAction.SET, value);
		return this;
	}
	
	/*
	 * Creates an effect for changing the given state name
	 */
	public FluentMachine changeState(String stateName, int value) {
		tempEffect = new Effect(stateName, EffectAction.CHANGE, value);
		return this;
	}
	
	/*
	 * Initiates a conditional transition for when a state is less than a given value
	 */
	public FluentMachine ifStateLessThan(String stateName, int value) {
		tempCondTransCond = Condition.LESS;
		ifState(stateName, value);
		return this;
	}
	
	/*
	 * Initiates a conditional transition for when a state is greater than a given value
	 */
	public FluentMachine ifStateGreaterThan(String stateName, int value) {
		tempCondTransCond = Condition.GREATER;
		ifState(stateName, value);
		return this;
	}
	
	/*
	 * Initiates a conditional transition for when a state is equal to a given value
	 */
	public FluentMachine ifStateEquals(String stateName, int value) {
		tempCondTransCond = Condition.EQUALS;
		ifState(stateName, value);
		return this;
	}
	
	/*
	 * Internal method to avoid duplicate code in the above 3 methods
	 */
	private void ifState(String stateName, int value) {
		tempCondTransStateName = stateName;
		tempCondTransValue = value;
	}
	
	/*
	 * Changes the conditional state to else
	 * It stores the transition destination and effect into the CondTrans temporary
	 * variables and cleans to regular once to make room for the coming "else" values
	 */
	public FluentMachine elseDo() {
		tempCondTransTo = tempTransitionTo;
		tempTransitionTo = "";
		tempCondTransEffect = tempEffect;
		tempEffect = null;
		return this;
	}
	
	/*
	 * Finish the state by generating remaining transition and creating the State object
	 */
	private void generateState() {
		if(tempStateName.isEmpty()) return;
		generateTransition();
		State s = new State(tempStateName, stateTransitions);
		states.add(s);
		cleanStateFields();
		cleanTransitionFields();
	}
	
	/*
	 * Finish either the Transition or ConditionalTransition.
	 */
	private void generateTransition() {
		if(tempTransitionName.isEmpty() || tempTransitionTo.isEmpty()) return;
		Transition t;
		if(tempCondTransStateName.isEmpty()) {
			t = new Transition(tempTransitionName, tempEffect, tempTransitionTo);
		} else {
			t = new ConditionalTransition(tempTransitionName, tempCondTransStateName,
					tempCondTransCond, tempCondTransValue, tempCondTransEffect,
					tempCondTransTo, tempEffect, tempTransitionTo);
		}
		stateTransitions.put(tempTransitionName, t);
		cleanTransitionFields();
	}
	
	/*
	 * Clean the fields regarding the state itself
	 */
	private void cleanStateFields() {
		tempStateName = "";
		stateTransitions = new HashMap<>();
	}
	
	/*
	 * Clean the fields regarding the transition itself
	 */
	private void cleanTransitionFields() {
		tempTransitionName = "";
		tempTransitionTo = "";
		tempEffect = null;
		tempCondTransStateName = "";
		tempCondTransValue = 0;
		tempCondTransEffect = null;
		tempCondTransTo = "";
	}
	
	/*
	 * Generate the final state and return a new MetaModel object
	 */
	public MetaModel build() {
		generateState();
		return new MetaModel(extendedStates, states.toArray(new State[states.size()]));
	}
	
}
