package Decorator.Decorators.ConcreteDecorators;

import Decorator.Components.Pizza;
import Decorator.Decorators.PizzaDecorators;

public class ChessDecorated extends PizzaDecorators {
    public ChessDecorated(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getsDes() {
        return super.getsDes() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
