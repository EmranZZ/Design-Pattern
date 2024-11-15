package UpdatePractice.factory;

//products

public class Ice_Asteroids implements asteroids {

    @Override
    public void show() {
        System.out.println("ICE Asteroids");
    }
}

class Iron_Asteroids implements asteroids{

    @Override
    public void show() {
        System.out.println("IRON");
    }
}

class Silver_Asteroids implements asteroids{

    @Override
    public void show() {
        System.out.println("Silver");
    }
}

class Gold_Asteroids implements asteroids{

    @Override
    public void show() {
        System.out.println("Gold");
    }
}

//creators

class level1 extends asteroidFactory{

    @Override
    public asteroids createAsteroids(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return new Iron_Asteroids();

    }
}

class level2 extends asteroidFactory{

    @Override
    public asteroids createAsteroids(int score) {
        if(score > 1000) return new Gold_Asteroids();
        else return new Silver_Asteroids();

    }
}

class main {
    public static void main(String[] args) {
        int level = (int)(Math.random()*2) + 1;

        asteroidFactory asteroid_fact;

        if(level==1) asteroid_fact = new level1();
        else asteroid_fact = new level2();

        int score = (int)(Math.random()*1500);

        asteroids ast = asteroid_fact.createAsteroids(score);
        ast.show();
    }
}