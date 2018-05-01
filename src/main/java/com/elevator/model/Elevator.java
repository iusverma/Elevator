package com.elevator.model;

import com.elevator.commands.Command;

public class Elevator {
	private int floor;
	private boolean moving;
	private Direction direction;
	private Command command;
	
	public Elevator() {
		this.floor = 0;
		this.moving = false;
		this.direction = Direction.NONE;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void move() {
		moving = true;
		if(this.command != null) {
			this.command.execute();
		}
		moving = false;
	}
}
