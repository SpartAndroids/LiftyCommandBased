package org.usfirst.frc.team5631.robot.subsystems;

import org.usfirst.frc.team5631.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	DigitalInput proximitySensor = RobotMap.proximitySensor;
	Talon motor = RobotMap.elevatorMotor;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    /**
     * Raises the elevator
     */
    public void raise(){
    	motor.set(1);
    }
    
    /**
     * Lowers the elevator
     */
    public void lower(){
    	motor.set(-1);
	}

	/**
	 * Stops the elevator
	 */
	public void stop() {
		motor.set(0);
	}
}

