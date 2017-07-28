package org.usfirst.frc.team1732.robot.commands.joystickcommands;

import org.usfirst.frc.team1732.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PrintDriveData extends Command {

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
	double leftVel = Robot.drivetrain.motionMagic.left.getVelocity();
	double rightVel = Robot.drivetrain.motionMagic.right.getVelocity();
	double leftPos = Robot.drivetrain.motionMagic.left.getPosition();
	double rightPos = Robot.drivetrain.motionMagic.right.getPosition();

	System.out.printf("%s: joystick: %.3f, pos: %.2f, vel: %f%n", "Left", Robot.oi.getLeftSpeed(), leftPos,
		leftVel);
	System.out.printf("%s: joystick: %.3f, pos: %.2f, vel: %f%n", "Right", Robot.oi.getRightSpeed(), rightPos,
		rightVel);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
	return false;
    }

}
