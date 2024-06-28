package Factory.creator;

import Factory.product.Asteroids;

public abstract class AsteroidsFactory {
    public abstract Asteroids createAsteroids(int score);
}
