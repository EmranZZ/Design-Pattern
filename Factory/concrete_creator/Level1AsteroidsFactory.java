package Factory.concrete_creator;

import Factory.concrete_product.Ice_Asteroids;
import Factory.concrete_product.Iron_Asteroids;
import Factory.creator.AsteroidsFactory;
import Factory.product.Asteroids;

public class Level1AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score){
        if(score>500) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}
