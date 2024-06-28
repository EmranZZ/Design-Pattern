package Factory;

import Factory.concrete_creator.Level1AsteroidsFactory;
import Factory.concrete_creator.Level2AsteroidsFactory;
import Factory.creator.AsteroidsFactory;
import Factory.product.Asteroids;

public class client {
    public static void main(String[] args) {
        int level = (int) (Math.random()*2) + 1;
        AsteroidsFactory asteroidsFactory;
        if(level == 1) asteroidsFactory = new Level1AsteroidsFactory();
        else asteroidsFactory = new Level2AsteroidsFactory();

        int score = (int) (Math.random()*2000);
        Asteroids asteroids = asteroidsFactory.createAsteroids(score);
        asteroids.show();
    }
}