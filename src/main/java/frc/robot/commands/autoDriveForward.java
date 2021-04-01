// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class autoDriveForward extends CommandBase {
    private DriveTrain m_driveTrain;
    boolean isDone = false;

  public autoDriveForward() {

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
      m_driveTrain.resetEncoders();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //Drive
    m_driveTrain.tankDrive(0.3, 0.3);
    //condition
    if (m_driveTrain.getLeftEncoderValue() >= 1500) {
        //stop
        m_driveTrain.tankDrive(0, 0);
        isDone = true;
    }
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_driveTrain.resetEncoders();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return isDone;
  }
}