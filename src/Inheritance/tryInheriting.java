package Inheritance;

public class tryInheriting {
    public static void main(String[] args) {
        MountainBike mountainBike =new MountainBike((float) 3.1,10,10);
        System.out.println("Wheel Diameter is: " + mountainBike.wheelDiameter);
        System.out.println("Speed is: "+ mountainBike.Speed);
    mountainBike.addBreaks(11);
    if (mountainBike.Speed<=0){
        System.out.println("bike has stopped");
    }else {
        System.out.println("Speed is: "+ mountainBike.Speed);

    }

        System.out.println("Gear is: "+ mountainBike.Gear);
    }
}
