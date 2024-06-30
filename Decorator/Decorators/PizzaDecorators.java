package Decorator.Decorators;

import Decorator.Components.Pizza;

public class PizzaDecorators implements Pizza {
    protected Pizza decoratedPizza;
    public PizzaDecorators(Pizza decoratedPizza){
        this.decoratedPizza = decoratedPizza;
    }
    @Override
    public String getsDes() {
        return decoratedPizza.getsDes();
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}