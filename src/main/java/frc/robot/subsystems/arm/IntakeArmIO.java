package frc.robot.subsystems.arm;

public interface IntakeArmIO {
    public static class Arm{
        public double angle = 0.0;
        public double speed = 0.0;
        public double radPerSec =0.0;
        public double appliedVolts = 0.0;
        public double tempC = 0.0;
        public double currrentAmps = 0.0;
    }

    public default void setVoltage(double motorVolts) {}

    public default void configInputs(double Inputvalues) {}


    /** PID */
    public default void setPIDConstants(double p, double i, double d, double ff) {}
    public default void setP(double P) {}
    public default void setI(double I) {}
    public default void setD(double D) {}
    public default void setff(double ff) {}
    public default double getP() { return 0.0; }
    public default double getI() { return 0.0; }
    public default double getD() { return 0.0; }
    public default double getFF() { return 0.0; }


    public default double getAngle() { return 0.0; }

    public default double getSpeed() { return 0.0; }


    /** Movement methods */
    public default void goToSetpoint(double setpoint) {}

    public default void setBrake(boolean brake) {}

    public default boolean atSetpoint() { return false; }


    
}
