package Prototype;

//Creating concrete class
public class Circle extends Shape {
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with radius of " + radius);
    }
}
