package org.usfirst.frc.team5631.robot.commands;

import org.usfirst.frc.team5631.robot.Robot;
import org.usfirst.frc.team5631.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RaiseElevator extends Command {

	public RaiseElevator() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.exampleSubsystem);
		setTimeout(0.9);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.elevator.raise();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return isTimedOut();
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.elevator.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
