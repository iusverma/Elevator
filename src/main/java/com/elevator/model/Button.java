package com.elevator.model;

public class Button {
	private ButtonType type;
	private int targetFloor;
	public Button(ButtonType bt, int floor) {
		this.type = bt;
		this.targetFloor = floor;
	}
	public ButtonType getType() {
		return type;
	}
	public void setType(ButtonType type) {
		this.type = type;
	}
	public int getTargetFloor() {
		return targetFloor;
	}
	public void setTargetFloor(int targetFloor) {
		this.targetFloor = targetFloor;
	}
}
