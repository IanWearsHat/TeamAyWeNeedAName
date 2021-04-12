// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import static frc.robot.Robot.Arm;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class CloseArm extends CommandBase {
  
  private static final boolean isDone = false;

  private Arm m_arm;

  public CloseArm(Arm arm) {
    m_arm = arm;
    addRequirements(m_arm);
  }

  @Override
  public void initialize() {
    
  }
  
  @Override
  public void execute() {
    m_arm.setArmSpeed(-0.5);
  }

  // Called once after isFinished returns true
  @Override
  public void end(boolean interrupted) {

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return isDone;
  }
}
