package Decorator.Components;

public class PlainPizza implements Pizza{
    @Override
    public String getsDes() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}
