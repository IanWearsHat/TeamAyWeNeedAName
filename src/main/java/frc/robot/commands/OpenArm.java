// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class OpenArm extends CommandBase{
  
  private static final boolean isDone = false;
  public OpenArm() {
    
  }




  @Override
  public void initialize() {
  SetleftFXSpeed(0.5);
  SetRightFXSpeed(0.5);
  }

 

  private void SetleftFXSpeed(double d) {
  }



  private void SetRightFXSpeed(double d) {
  }

  {}

  
  @Override
  public void execute() {}

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return isDone;
  }

  // Called once after isFinished returns true
  @Override
  public void end(boolean interrupted) {

  }
  public void interrupted() {}

  }
