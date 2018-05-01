package com.elevator.model;

public class ButtonPressedEvent {
	private Button button;
	public ButtonPressedEvent(Button button) {
		this.setButton(button);
	}
	public Button getButton() {
		return button;
	}
	public void setButton(Button button) {
		this.button = button;
	}
}
