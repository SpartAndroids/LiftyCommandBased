package org.usfirst.frc.team5631.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public Encoder driveTrainEncoder;
	public static Talon leftMotor1, leftMotor2, rightMotor1, rightMotor2;
	public static Talon elevatorMotor;
	public static RobotDrive robotDrive;

	public void init() {
		leftMotor1 = new Talon(0);
		leftMotor2 = new Talon(1);
		rightMotor1 = new Talon(2);
		rightMotor2 = new Talon(3);
		elevatorMotor = new Talon(4);
		robotDrive = new RobotDrive(leftMotor1, leftMotor2, rightMotor1, rightMotor2);
	}
}
