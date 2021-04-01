/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.Elevator;

public class ElevatorUp extends CommandBase {
  /**
   * Creates a new ElevatorUp.
   */
  private Elevator elevator; 
  public XboxController operator = new XboxController(2);
  private Joystick joystickUp;
  boolean isDone = false; 

  public ElevatorUp(Joystick up, Elevator subsystem ) {
    // Use addRequirements() here to declare subsystem dependencies.
    joystickUp = up;
	  elevator = subsystem;
    addRequirements(elevator);
  } 

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    elevator.setposition(0); 
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // going up
    elevator.leftElevatorMotor(0.3,0.3); 
    elevator.rightElevatorMotor(0.3,0.3);
    //when to stop
    if (elevator.getEncoder() >= 1000) {
      //stop the elevator
      elevator.leftElevatorMotor(0,0); 
      elevator.rightElevatorMotor(0,0);
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
