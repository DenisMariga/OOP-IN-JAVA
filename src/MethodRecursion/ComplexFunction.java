package MethodRecursion;

public class ComplexFunction {
    int calculateFactorial(int i){
        if(i==1){
            return 1;
        }else
            return (i*calculateFactorial(i-1));
    }
}
