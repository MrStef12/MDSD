package main;

import java.util.Scanner;

public class AutomaticGarageDoor {

	public static void main(String[] args) {
		System.out.println("Automatic Garage Door - State Machine");
		Scanner scan = new Scanner(System.in);
		
		
		MetaModel metamodel = FluentMachine.builder()
				.integerState("DOOR_STATUS")
				.state("LOCKED")
					.transition("UNLOCK").to("CLOSED")
				.state("CLOSED")
					.transition("LOCK").to("LOCKED")
					.transition("OPEN").to("OPENING").setState("DOOR_STATUS", 1)
				.state("OPENING")
					.transition("TICK")
						.ifStateLessThan("DOOR_STATUS", 4)
							.changeState("DOOR_STATUS", 1)
						.elseDo()
							.setState("DOOR_STATUS", 5)
							.to("OPENED")
					.transition("CLOSE").to("CLOSING")
				.state("OPENED")
					.transition("CLOSE").to("CLOSING").setState("DOOR_STATUS", 4)
				.state("CLOSING")
					.transition("TICK")
						.ifStateGreaterThan("DOOR_STATUS", 1)
							.changeState("DOOR_STATUS", -1)
						.elseDo()
							.setState("DOOR_STATUS", 0)
							.to("CLOSED")
					.transition("OPEN").to("OPENING")
					.transition("DETECT").to("OPENING")
				.build();
		
		
		StateMachineExecutor executor = new StateMachineExecutor(metamodel);
		String action = "";
		while(true) {
			executor.printState();
			System.out.println("Type event:");
			action = scan.nextLine().toUpperCase();
			if(action.equals("EXIT")) break;
			
			executor.processEvent(action);
		}
		scan.close();
	}

}
