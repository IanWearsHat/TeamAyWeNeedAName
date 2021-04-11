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
  public CANSparkMax setLeftElevatorMotor;
  public CANSparkMax setRightElevatorMotor;
  public Elevator() {

    setLeftElevatorMotor = new CANSparkMax(RobotMap.ElevatorMap.leftElevatorMotorCanID, null);
    setRightElevatorMotor = new CANSparkMax(RobotMap.ElevatorMap.rightElevatorMotorCanID, null);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

public void setLeftElevatorMotor(double d, double e) {
}

public void setRightElevatorMotor(double d, double e) {
}
public double getEncoder() {
  return setLeftElevatorMotor.getEncoder().getPosition(); 
}

public void setPosition(int start) {
  setLeftElevatorMotor.getEncoder().setPosition(start);  
}

}


