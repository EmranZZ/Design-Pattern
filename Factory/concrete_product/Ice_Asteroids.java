package Factory.concrete_product;

import Factory.product.Asteroids;

public class Ice_Asteroids implements Asteroids {

    @Override
    public void show() {
        System.out.println("Ice_Asteroids popped up");
    }
}
