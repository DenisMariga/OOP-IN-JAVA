package MethodOverloading;

public class TryMethodOverloading {
    public int multiply(int x, int y){

        return( x*y);
    }
    public int multiply(int x,int y,int z){
        return (x*y*z);
    }
    public double multiply(double x,double y,double z){
        return (x*y*z);
    }

    public static void main(String[] args) {
        TryMethodOverloading tryMethodOverloading=new TryMethodOverloading();
        System.out.println(tryMethodOverloading.multiply(2,2));
        System.out.println(tryMethodOverloading.multiply(2,2,4));
        System.out.println(tryMethodOverloading.multiply(1.2,2.44,32.43));
    }
}
