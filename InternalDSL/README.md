# Automatic Garage Door
## By Steffen Hansen (stefh14)

# Usage
It's a console program. When starting, the console displays the current state, available actions and the current extended state. Type in the desired action and see the state change. If the action does not exist, the state does not change.

# Code
Everthing is created in the AutomaticGarageDoor.java class. The FluentInterface ends by the build() method which returns a MetaModel class that contains all states and the desired extended state. The StateMachineExecutor takes in this MetaModel and sets up to get ready for the user actions.

The StateMachineExecutor keeps track of the active state (set as the first state on startup) the available states and the extended state.

There are two types of transitions: Regular Transition (Transition.java) and Conditional Transition (ConditionalTransition.java). The latter extends the former and overrides its doTransition method to include the conditional logic. 