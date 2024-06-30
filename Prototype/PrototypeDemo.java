package Prototype;
//using the Prototype Pattern
public class PrototypeDemo {
    public static void main(String[] args) {
        //original object
        Circle orgCir = new Circle(10);
        Rectangle orgRect = new Rectangle(6,12);

        //cloned objects
        Circle clonedCircle;
        Rectangle clonedRectangle;

        clonedCircle =(Circle) orgCir.clone();
        clonedRectangle = (Rectangle) orgRect.clone();

        //Draw the original and cloned objects
        System.out.println("Original Circle: ");
        orgCir.draw();
        System.out.println("Cloned circle: ");
        clonedCircle.draw();

        System.out.println("\nOriginal Rectangle: ");
        orgRect.draw();
        System.out.println("Cloned Rectangle: ");
        orgRect.draw();
    }
}
