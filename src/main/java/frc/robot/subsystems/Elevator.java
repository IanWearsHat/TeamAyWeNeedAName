// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap; 

public class Elevator extends SubsystemBase {
  /** Creates a new Elevator. */
  public CANSparkMax leftElevatorMotor;
  public CANSparkMax rightElevatorMotor;
  public Elevator() {

    leftElevatorMotor = new CANSparkMax(RobotMap.ElevatorMap.leftElevatorMotorCanID, null);
    rightElevatorMotor = new CANSparkMax(RobotMap.ElevatorMap.rightElevatorMotorCanID, null);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

public void leftElevatorMotor(double d, double e) {
}

public void rightElevatorMotor(double d, double e) {
}
public double getEncoder() {
  return leftElevatorMotor.getEncoder().getPosition(); 
}

public void setposition(int start) {
  leftElevatorMotor.getEncoder().setPosition(start);  
}

}


