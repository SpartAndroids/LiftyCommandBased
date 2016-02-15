package org.usfirst.frc.team5631.robot.subsystems;

import org.usfirst.frc.team5631.robot.OI;
import org.usfirst.frc.team5631.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class DriveTrain extends PIDSubsystem {
	private Encoder driveTrainEncoder;
	private Talon leftTalon1 = RobotMap.leftMotor1, leftTalon2 = RobotMap.leftMotor2,
			rightTalon1 = RobotMap.rightMotor1, rightTalon2 = RobotMap.rightMotor1;
	private RobotDrive robotDrive;

	public void initDefaultCommand() {
	}

	/**
	 * Drives the robot
	 */
	public void drive() {
		robotDrive.arcadeDrive(OI.driveStick.getRawAxis(1), OI.driveStick.getRawAxis(2), true);
	}

	public DriveTrain() {
		super("driveTrain", 1.0, 0.0, 0.0);
		setAbsoluteTolerance(0.2);
		getPIDController().setContinuous(false);
		LiveWindow.addActuator("robotDrivetrain", "PIDSubsystem Controller", getPIDController());

	}

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return driveTrainEncoder.pidGet();
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		leftTalon1.pidWrite(output);

	}
}
