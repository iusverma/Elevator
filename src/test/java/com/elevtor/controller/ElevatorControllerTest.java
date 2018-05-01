package com.elevtor.controller;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.elevator.model.Button;
import com.elevator.model.ButtonPressedEvent;
import com.elevator.model.ButtonType;
import com.elevator.model.Elevator;

public class ElevatorControllerTest {
	@Test
	public void testElevatorSimpleUseCase() {
		Elevator elevator = new Elevator();
		ElevatorController ec = new ElevatorController(elevator);
		
		//User pressed down button @ level 3
		Button button1 = new Button(ButtonType.DOWN, 3);
		ButtonPressedEvent buttonEvent1 = new ButtonPressedEvent(button1);
		ec.buttonPressed(buttonEvent1);
		Assert.assertEquals(elevator.getFloor(), 3);
		
		// User did nothing and elevator remain at level 3
		// after some time another user press down button @ level 7
		Button button2 = new Button(ButtonType.DOWN, 7);
		ButtonPressedEvent buttonEvent2 = new ButtonPressedEvent(button2);
		ec.buttonPressed(buttonEvent2);
		Assert.assertEquals(elevator.getFloor(), 7);
		
		// User did nothing and elevator remain at level 3
		// after some time another user press up button @ level 2 
		Button button3 = new Button(ButtonType.UP, 2);
		ButtonPressedEvent buttonEvent3 = new ButtonPressedEvent(button3);
		ec.buttonPressed(buttonEvent3);
		Assert.assertEquals(elevator.getFloor(), 2);
		
		// User press level 6 button inside lift
		Button button4 = new Button(ButtonType.LEVEL, 6);
		ButtonPressedEvent buttonEvent4 = new ButtonPressedEvent(button4);
		ec.buttonPressed(buttonEvent4);
		Assert.assertEquals(elevator.getFloor(), 6);
	}
}
