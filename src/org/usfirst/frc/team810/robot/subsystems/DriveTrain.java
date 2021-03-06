package org.usfirst.frc.team810.robot.subsystems;

import org.usfirst.frc.team810.robot.RobotMap;
import org.usfirst.frc.team810.robot.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	private static RobotDrive drive;
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new Drive(.8));
		drive = RobotMap.robotDrive;
	}

	public static void arcadeDrive(double moveValue, double rotateValue) {
		drive.arcadeDrive(moveValue, rotateValue);
	}
}
