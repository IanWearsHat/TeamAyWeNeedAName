// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
    public WPI_TalonFX leftLeader;
    public WPI_TalonFX leftFollower;
    public WPI_TalonFX rightLeader;
    public WPI_TalonFX rightFollower;
  /** Creates a new DriveTrain. */
  public DriveTrain() {
    leftLeader = new WPI_TalonFX(1);
    rightLeader = new WPI_TalonFX(3);

    rightFollower = new WPI_TalonFX(4);
    rightFollower.follow(rightLeader);
    leftFollower = new WPI_TalonFX(2);
    leftFollower.follow(leftLeader);
    

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
