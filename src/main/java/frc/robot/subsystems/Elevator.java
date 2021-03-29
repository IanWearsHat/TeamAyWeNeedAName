// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap; 

public class Elevator extends SubsystemBase {
  /** Creates a new Elevator. */
  public WPI_TalonFX leftElevatorMotor;
  public WPI_TalonFX rightElevatorMotor;
  public Elevator() {

    leftElevatorMotor = new WPI_TalonFX(RobotMap.ElevatorMap.leftElevatorMotorCanID);
    rightElevatorMotor = new WPI_TalonFX(RobotMap.ElevatorMap.rightElevatorMotorCanID);  
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
