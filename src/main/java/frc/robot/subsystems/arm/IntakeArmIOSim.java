package frc.robot.subsystems.arm;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;

import edu.wpi.first.wpilibj.DutyCycleEncoder;

public class IntakeArmIOSim {

    // These are declaring objects for the various classes we're using
    // namely the motor controller object, the inbuild PID controller, the relative Encoder (in the motor), and the absolute Encoder (outside the encoder)
    private CANSparkMax intakeArmMotor; 
    private SparkMaxPIDController pidController;
    private RelativeEncoder encoder;
    private DutyCycleEncoder absoluteEncoder;

    private double setpoint = 0;


}
