
package org.usfirst.frc.team1732.robot;

import org.usfirst.frc.team1732.robot.oi.OI;
import org.usfirst.frc.team1732.robot.robotmaps.RobotMap2017;
import org.usfirst.frc.team1732.robot.robotmaps.RobotMap2017PracticeBot;
import org.usfirst.frc.team1732.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {

    public static RobotMap2017 robotMap;
    public static OI oi;
    public static Drivetrain drivetrain;

    private Command autonomousCommand;

    @Override
    public void robotInit() {
	robotMap = new RobotMap2017PracticeBot();
	oi = new OI(OI.dualJoystick);
	drivetrain = new Drivetrain();
    }

    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
	Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
	autonomousCommand = null; // get selected command
	// schedule the autonomous command (example)
	if (autonomousCommand != null)
	    autonomousCommand.start();
    }

    @Override
    public void autonomousPeriodic() {
	Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
	if (autonomousCommand != null)
	    autonomousCommand.cancel();
    }

    @Override
    public void teleopPeriodic() {
	Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() {
	LiveWindow.run();
    }
}
