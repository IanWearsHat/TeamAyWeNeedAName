package frc.robot.subsystems;

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.




import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.XboxController.Button;

/** Add your docs here. */
public class Arm extends SubsystemBase {
  public WPI_TalonFX leftFx;
  public WPI_TalonFX rightFx;
  public WPI_TalonFX middleFx;
  


  public void MoveForwardArm(WPI_TalonFX leftFx) {
    extracted(leftFx);
  };

  private void extracted(WPI_TalonFX leftFx) {
  
  };

  public void RotateArm(WPI_TalonFX rightFx) {
    extracted(rightFx);
  };

  public void StopArm(WPI_TalonFX middleFx) {

  }

  public  void Open(Arm subsystemArm) {}
  void XboxController (Button Y)
  {};
  public void close(Arm subsyteArm){}
  void XboxController2 (Button X)
  {}};

