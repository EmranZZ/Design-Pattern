package Factory.concrete_product;

import Factory.product.Asteroids;

public class Silicon_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Silicon_Asteroids popped up");
    }
}