package MethodOverriding;

public class MountainBike extends Bike{
    public int setHeight;
    public MountainBike(int setHeight,int gear, int speed) {
        super(gear, speed);
        this.setHeight=setHeight;
    }

    public void setSetHeight(int setHeight) {
        this.setHeight = setHeight;
    }

    @Override
    public void setGear(int gear) {
        gear=gear+2;
    }

    @Override
    public void speedup(int increment) {
        speed=speed+increment+10;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed=speed+decrement-10;

    }
}
