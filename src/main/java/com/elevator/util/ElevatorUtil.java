package com.elevator.util;

import com.elevator.commands.Command;
import com.elevator.commands.MoveDownCommand;
import com.elevator.commands.MoveLevelCommand;
import com.elevator.commands.MoveUpCommand;
import com.elevator.model.ButtonPressedEvent;
import com.elevator.model.ButtonType;
import com.elevator.model.Elevator;

public class ElevatorUtil {
	public static Command getCommandForEvent(ButtonPressedEvent event, Elevator elevator) {
		if(event.getButton().getType() == ButtonType.DOWN) {
			if(event.getButton().getTargetFloor() > elevator.getFloor()) {
				return new MoveUpCommand(elevator, event.getButton().getTargetFloor());
			}else if(event.getButton().getTargetFloor() < elevator.getFloor()) {
				return new MoveDownCommand(elevator, event.getButton().getTargetFloor());
			}else {
				//open door
			}
		}else if(event.getButton().getType() == ButtonType.UP) {
			if(event.getButton().getTargetFloor() < elevator.getFloor()) {
				return new MoveDownCommand(elevator, event.getButton().getTargetFloor());
			}else if(event.getButton().getTargetFloor() > elevator.getFloor()) {
				return new MoveUpCommand(elevator, event.getButton().getTargetFloor());
			}else {
				//open door
			}
		}else if(event.getButton().getType() == ButtonType.LEVEL) {
			// Elevator is now moving user
			return new MoveLevelCommand(elevator, event.getButton().getTargetFloor());
		}
		return null;
	}
}
