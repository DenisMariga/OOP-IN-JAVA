package Inheritance;

public class MountainBike extends bicycle{
    public float wheelDiameter;

    public MountainBike(float wheelDiameter,int speed, int gear) {
        super(speed, gear);
        this.wheelDiameter=wheelDiameter;
    }

    public void setWheelDiameter(float wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
}
