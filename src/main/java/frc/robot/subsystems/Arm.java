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

  public Arm() {
    leftFx = new WPI_TalonFX(10);
    rightFx = new WPI_TalonFX(11);
    middleFx = new WPI_TalonFX(12);
  }

  public void moveForwardArm(WPI_TalonFX leftFx) {

  }

  public void rotateArm(WPI_TalonFX rightFx) {

  }

  public void stopArm(WPI_TalonFX middleFx) {

  }
  
}
