package Prototype;

//Creating concrete class
public class Rectangle extends Shape {
    private int height, width;

    public Rectangle(int height, int width){
        this.height=height;
        this.width=width;
    }


    @Override
    void draw() {
        System.out.println("Creating a rectangle with width " + width + " and height " + height);
    }
}
