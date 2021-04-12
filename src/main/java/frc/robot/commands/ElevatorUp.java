/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import frc.robot.subsystems.Elevator;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ElevatorUp extends CommandBase {
  /**
   * Creates a new ElevatorUp.
   */
  private Elevator elevator; 
  boolean isDone = false; 

  public ElevatorUp(Elevator subsystem ) {
    // Use addRequirements() here to declare subsystem dependencies.
	  elevator = subsystem;
    addRequirements(elevator);
  } 

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    elevator.setPosition(0); 
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //going up
    elevator.setElevatorSpeed(0.3, 0.3); 
    //when to stop
    if (elevator.getEncoder() >= 1000) {
      //stop the elevator
      elevator.setElevatorSpeed(0, 0); 
      isDone = true; 
    }

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return isDone;
  }
}
