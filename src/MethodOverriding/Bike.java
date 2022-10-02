package MethodOverriding;

public class Bike {
    protected int gear;
    protected int speed;

    public Bike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void speedup(int increment) {
        this.speed = speed+increment;
    }
    public void applyBrakes(int decrement) {
        this.speed = speed+decrement;
    }
}
