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
    public Integer addBreaks(int decrement){
        Speed-=decrement;
        return decrement;
    }
    public void setSpeed(int increase){
        Speed+=increase;
    }
}
