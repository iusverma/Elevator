package com.elevtor.controller;

import java.util.PriorityQueue;
import java.util.Queue;

import com.elevator.commands.Command;
import com.elevator.model.ButtonPressedEvent;
import com.elevator.model.Elevator;
import com.elevator.util.ElevatorUtil;

public class ElevatorController {
	private Elevator elevator;
	private Queue<Command> userCommands;

	public ElevatorController(Elevator elevator) {
		this.elevator = elevator;
		userCommands = new PriorityQueue<Command>();
	}

	public Elevator getElevator() {
		return elevator;
	}

	public void setElevator(Elevator elevator) {
		this.elevator = elevator;
	}

	public Queue<Command> getUserCommands() {
		return userCommands;
	}

	public void setUserCommands(Queue<Command> userCommands) {
		this.userCommands = userCommands;
	}

	public void buttonPressed(ButtonPressedEvent bpEvent) {
		elevator.setCommand(ElevatorUtil.getCommandForEvent(bpEvent, elevator));
		elevator.move();
	}
}
