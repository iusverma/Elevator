package com.elevator.commands;

import com.elevator.model.Direction;
import com.elevator.model.Elevator;

public class MoveUpCommand implements Command {
	private Elevator elevator;
	private int targetFloor;
	public MoveUpCommand(Elevator elevator, int targetFloor) {
		this.elevator = elevator;
		this.targetFloor = targetFloor;
	}

	public void execute() {
		elevator.setDirection(Direction.UP);
		elevator.setFloor(targetFloor);
		elevator.setDirection(Direction.NONE);
	}

	public int getTargetFloor() {
		return targetFloor;
	}

	public void setTargetFloor(int targetFloor) {
		this.targetFloor = targetFloor;
	}

	public Elevator getElevator() {
		return elevator;
	}

	public void setElevator(Elevator elevator) {
		this.elevator = elevator;
	}

}
