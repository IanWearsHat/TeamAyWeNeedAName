// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import static frc.robot.Robot.Arm;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class CloseArm extends CommandBase {

  private static final boolean isDone = false;




  public CloseArm(Arm subsystem) {
    Arm = subsystem;
  }


  @Override
  public void initialize() {
  SetleftFXSpeed(0.5);
  SetRightFXSpeed(0.5);
   
  }

  protected void SetRightFXSpeed(double d) {
  }

  protected void SetleftFXSpeed(double d) {
  }

  @Override
  public void execute() {}

  @Override
  public boolean isFinished() {
    return isDone;
  
  }


  @Override
  public void end(boolean interrupted) {
  
  }
    

  
  
  public void interrupted() {}

  }