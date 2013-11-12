/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Tmer;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Team4464Robot extends SimpleRobot {
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    RobotDrive drive = new RobotDrive(1,2);
    Joystick leftStick = new Joystick(1);
    Joystick rightStick = new Joystick(2);

    public void autonomous() {
        for (int i = 0; i < 4; i++)  {
            drive.drive(0.5, 0.0);   // drive 50% fwd 0% turn
            Timer.delay(2.0);        // wait 2 seconds
            drive.drive(0.0, 0.75);  // drive 0% fwd, 75% turn
        }
        drive.drive(0.0, 0.0);       // drive 0% fwd, 0% turn
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        while (true && isOperatorControl() && isEnabled())  // loop until change
        {
            drive.tankDrive(leftStick, rightStick);  // drive with joysticks
            Timer.delay(0.005);
        }

    }
}
