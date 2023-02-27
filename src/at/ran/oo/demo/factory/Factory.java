package at.ran.oo.demo.factory;

import java.util.Random;

public class Factory {
    private int number;

    public static Actor getActor(){

        Random random = new Random();
        switch (random.nextInt(2)){
            case 0: return new Ant("Ant " + random.nextInt(100));
            case 1: return new Bee("Bee " + random.nextInt(100));
            default:
                return new Bee("default");
        }
    }
}
