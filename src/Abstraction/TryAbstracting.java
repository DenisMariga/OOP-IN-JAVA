package Abstraction;

public class TryAbstracting {
    public static void main(String[] args) {
        Abstracts circle=new Circle();
        circle.draw();
        circle.resize();
         Abstracts square=new Square();
        square.resize();
        square.draw(); 
    }
}
