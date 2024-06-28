package Factory.concrete_product;

import Factory.product.Asteroids;

public class Rocky_Asteroids implements Asteroids {
    @Override
    public void show() {
        System.out.println("Rocky_Asteroids popped up");
    }
}
