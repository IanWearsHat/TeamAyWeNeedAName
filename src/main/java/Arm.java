// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.



import com.ctre.phoenix.motorcontrol.can.MotControllerJNI;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Add your docs here. */
public class Arm extends SubsystemBase {
  private static final Command Initializing = null;
  public WPI_TalonFX leftFollower;
  public WPI_TalonFX rightFollower;
  public WPI_TalonFX rightLeader;
  public WPI_TalonFX leftLeader;

  @Override
  public void intiDefaultCommand

  public Arm(WPI_TalonFX leftFollower) {
    this.leftFollower = leftFollower;
  } 