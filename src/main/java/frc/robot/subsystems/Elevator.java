// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap; 

public class Elevator extends SubsystemBase {
  /** Creates a new Elevator. */
  public CANSparkMax leftElevatorMotor;
  public CANSparkMax rightElevatorMotor;
  public Elevator() {
    leftElevatorMotor = new CANSparkMax(RobotMap.ElevatorMap.leftElevatorMotorCanID, null);
    rightElevatorMotor = new CANSparkMax(RobotMap.ElevatorMap.rightElevatorMotorCanID, null);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

/**
 * Sets the speed of both of the Elevator Motors
 * 
 * @param leftSpeed speed for leftElevatorMotor
 * @param rightSpeed speed for rightElevatorMotor
 */

public void setElevatorSpeed(double leftSpeed, double rightSpeed) {
  leftElevatorMotor.set(leftSpeed);
  rightElevatorMotor.set(rightSpeed);
}

public double getEncoder() {
  return leftElevatorMotor.getEncoder().getPosition(); 
}

/**
 * Sets the starting position of the motors
 * 
 * @param start where the elevator motors' starting position are
 */

public void setPosition(int start) {
  leftElevatorMotor.getEncoder().setPosition(start);  
}

}


