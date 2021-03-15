// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import org.ejml.sparse.csc.linsol.qr.LinearSolverQrLeftLooking_DSCC;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class Drive extends CommandBase {

  private DriveTrain driveTrain;
  private Joystick joystickLeft;
  private Joystick joystickRight;

  public Drive(Joystick left, Joystick right, DriveTrain subsystem) {
    joystickLeft = left;
    joystickRight = right;
    driveTrain = subsystem;
    addRequirements(driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (joystickLeft.getY() > 0.1 || joystickRight.getY() > 0.1 || joystickLeft.getY() < -0.1 || joystickRight.getY() < -0.1) {
      driveTrain.tankDrive(joystickLeft.getY(), joystickRight.getY());
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
