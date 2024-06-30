package Decorator;

import Decorator.Components.Pizza;
import Decorator.Components.PlainPizza;
import Decorator.Decorators.ConcreteDecorators.ChessDecorated;
import Decorator.Decorators.ConcreteDecorators.PepperoniDecorator;
import Decorator.Decorators.PizzaDecorators;

public class client {
    //add plain pizza
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getsDes()+"Cost: $"+pizza.getCost());

        //add cheese to that pizza
        Pizza pizzaWithChess = new ChessDecorated(pizza);
        System.out.println(pizzaWithChess.getsDes()+"Cost: $"+pizzaWithChess.getCost());

        //add Pepparoni
        Pizza pizzaWithPepparoni = new PepperoniDecorator(pizza);
        System.out.println(pizzaWithPepparoni.getsDes()+"Cost: $"+pizzaWithPepparoni.getCost());
    }
}
