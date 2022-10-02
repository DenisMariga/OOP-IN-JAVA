package MethodRecursion;

public class TryRecursion {
    public static void main(String[] args) {
        ComplexFunction complexFunction=new ComplexFunction();
        int factorial = complexFunction.calculateFactorial(5);
        System.out.println("Factorial is: "+ factorial);
    }
}
