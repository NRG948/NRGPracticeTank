package org.usfirst.frc.team948.robot.subsystems;

import org.usfirst.frc.team948.robot.RobotMap;
import org.usfirst.frc.team948.robot.commands.ManualDrive;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ManualDrive());
    }
    
    public void tankDrive(double leftPower, double rightPower) {
    	RobotMap.frontLeft.set(leftPower);
    	RobotMap.backLeft.set(leftPower);
    	RobotMap.frontRight.set(rightPower);
    	RobotMap.backRight.set(rightPower);
    }
    
    public void stop() {
    	RobotMap.frontLeft.disable();
    	RobotMap.backLeft.disable();
    	RobotMap.frontRight.disable();
    	RobotMap.backRight.disable();
    }
}

