package Factory.concrete_creator;

import Factory.concrete_product.Iron_Asteroids;
import Factory.concrete_product.Rocky_Asteroids;
import Factory.creator.AsteroidsFactory;
import Factory.product.Asteroids;

public class Level2AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score>1000) return new Rocky_Asteroids();
        else return new Iron_Asteroids();
    }
}
