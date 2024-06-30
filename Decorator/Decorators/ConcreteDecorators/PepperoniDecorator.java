package Decorator.Decorators.ConcreteDecorators;

import Decorator.Components.Pizza;
import Decorator.Decorators.PizzaDecorators;

public class PepperoniDecorator extends PizzaDecorators {
    public PepperoniDecorator(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getsDes() {
        return super.getsDes() + ", Pepparoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
