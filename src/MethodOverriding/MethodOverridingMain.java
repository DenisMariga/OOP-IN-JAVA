package MethodOverriding;

public class MethodOverridingMain {
    public static void main(String[] args) {
        Bike bike =new Bike(10,20);
        System.out.println("Bike gear is: "+ bike.gear);
        System.out.println("Bike speed is: "+bike.speed);
        bike.applyBrakes(10);
        System.out.println("Bike speed after applying breaks: "+bike.speed);
        Bike bike1 =new MountainBike(10,10,20);
        System.out.println("Bike gear is: "+ bike.gear);
        System.out.println("Bike speed is: "+bike.speed);
        bike.applyBrakes(10);
        System.out.println("Bike speed after applying breaks: "+bike.speed);
    }
}
