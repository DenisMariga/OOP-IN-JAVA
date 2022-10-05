package Exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionWriting {
    public void writeList(){
        try {
            List<Integer>integerList=new ArrayList<>(10);
            integerList.add(10);
            System.out.println("Entering try statement");
            Integer a = integerList.get(1);
            System.out.println("Accessing the index of I ");
        }catch (IndexOutOfBoundsException e1){
            String e1Message = e1.getMessage();
            System.out.println(e1Message);
        }finally {
            System.out.println("This will be executed always");
        }
    }

    public static void main(String[] args) {
        ExceptionWriting exceptionWriting=new ExceptionWriting();
        exceptionWriting.writeList();
    }
}
