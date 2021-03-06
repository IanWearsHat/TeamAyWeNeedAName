package frc.robot.subsystems;

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

/** create new Arm. */
public class Arm extends SubsystemBase {
    public WPI_TalonFX leftFx;
    public WPI_TalonFX rightFx;
    public WPI_TalonFX middleFx;

    public Arm() {
      leftFx = new WPI_TalonFX(RobotMap.ArmMap.leftArmMotorCanID);
      rightFx = new WPI_TalonFX(RobotMap.ArmMap.rightArmMotorCanID);
      middleFx = new WPI_TalonFX(RobotMap.ArmMap.middleArmMotorCanID);
    }

    /**
     * Sets the speed of all 3 of the arm motors.
     * 
     * @param speed the speed of all motors
     */
    public void setArmSpeed(double speed) {
      leftFx.set(speed);
      rightFx.set(speed);
      middleFx.set(speed);
    }
  }
  