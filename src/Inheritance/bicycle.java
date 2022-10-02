package Inheritance;

public class bicycle {
    protected int Speed;
    protected int Gear;
    public bicycle(int speed,int gear){
        this.Speed=speed;
        this.Gear=gear;
    }

    public void setGear(int gear) {
        Gear = gear;
    }
    public void addBreaks(int decrement){
        Speed-=decrement;
    }
    public void setSpeed(int increase){
        Speed+=increase;
    }
}
