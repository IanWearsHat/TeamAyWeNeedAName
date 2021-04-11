package frc.robot.subsystems;

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.



import javax.tools.ForwardingFileObject;

import com.ctre.phoenix.motorcontrol.can.MotControllerJNI;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.XboxController;


/** Add your docs here. */
public class Arm extends SubsystemBase {
  private static final Command Initializing = null;
  public WPI_TalonFX leftFollower;
  public WPI_TalonFX rightFollower;
  public WPI_TalonFX rightLeader;
  public WPI_TalonFX leftLeader;
  private WPI_TalonFX wpi_TalonFX;



  public void MoveForwardArm(WPI_TalonFX leftFollower) {
  extracted(leftFollower);
  } 

  private void extracted(WPI_TalonFX leftFollower2) {
  }

  public void RotateArm(WPI_TalonFX rightFollowerFx) {
    extracted(rightFollowerFx);
  };
