package Interface;

public class TryInterface {
    public static void main(String[] args) {
        MountainBike mountainBike=new MountainBike(10,20,30);
        System.out.println(mountainBike.getGear());
        mountainBike.setGear(80);
        System.out.println(mountainBike.getGear());
        System.out.println(mountainBike.getSeatHeight());
        System.out.println(mountainBike.getSpeed());
        mountainBike.speedUp(10);
        System.out.println("New speed: "+mountainBike.getSpeed());
        mountainBike.applyBrakes(30);
        System.out.println("New speed: "+mountainBike.getSpeed());
        mountainBike.canDrive();
        mountainBike.canRotate();

    }
}
