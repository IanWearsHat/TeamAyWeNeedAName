// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class DriveTrain extends SubsystemBase {
    public WPI_TalonFX leftLeader;
    public WPI_TalonFX leftFollower;
    public WPI_TalonFX rightLeader;
    public WPI_TalonFX rightFollower;

    private DifferentialDrive differentialDrive;
    
  /** Creates a new DriveTrain. */
  public DriveTrain() {

    leftLeader = new WPI_TalonFX(RobotMap.DriveTrainMap.leftLeaderCanID);
    rightLeader = new WPI_TalonFX(RobotMap.DriveTrainMap.rightLeaderCanID);

    rightFollower = new WPI_TalonFX(RobotMap.DriveTrainMap.rightFollowerCanID);
    rightFollower.follow(rightLeader);
    leftFollower = new WPI_TalonFX(RobotMap.DriveTrainMap.leftFollowerCanID);
    leftFollower.follow(leftLeader);
    
    rightLeader.setNeutralMode(NeutralMode.Brake);
    rightFollower.setNeutralMode(NeutralMode.Coast);
    leftLeader.setNeutralMode(NeutralMode.Brake);
    leftFollower.setNeutralMode(NeutralMode.Coast);

    rightLeader.setInverted(false);
    leftLeader.setInverted(true);
    rightFollower.setInverted(InvertType.FollowMaster);
    leftFollower.setInverted(InvertType.FollowMaster);

    differentialDrive = new DifferentialDrive(leftLeader, rightLeader);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void tankDrive(double left, double right) {
    differentialDrive.tankDrive(left, right);
  }

  public int getLeftEncoderValue() {
    return (int) leftLeader.getSelectedSensorPosition();
  }

  public void resetEncoders() {
    leftLeader.setSelectedSensorPosition(0);
    leftFollower.setSelectedSensorPosition(0);
    rightLeader.setSelectedSensorPosition(0);
    rightFollower.setSelectedSensorPosition(0);
  }

}
  
}
