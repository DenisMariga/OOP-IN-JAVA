import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat =new DecimalFormat("'ksh'###,##0.00");
        System.out.println(decimalFormat.format(10000000));
        System.out.println("Hello world!");
    }
}