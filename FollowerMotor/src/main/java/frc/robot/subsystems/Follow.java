// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Follow extends SubsystemBase {
  /** Creates a new Follow. */
  TalonFX motor1 = new TalonFX(0);
  TalonFX motor2 = new TalonFX(1);
  public Follow() {
    motor1.setControl(new DutyCycleOut(0.5));
    motor2.setControl(new Follower(0, false));
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
