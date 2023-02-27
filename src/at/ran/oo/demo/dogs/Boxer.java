package at.ran.oo.demo.dogs;

import at.ran.oo.demo.dogs.barkstrategies.BarkStrategy;

public class Boxer extends AbstractDog{

    public Boxer(String name, int age, BarkStrategy strategy) {
        super(name, age, strategy);
    }

    @Override
    public void run() {
        System.out.println("I am a boxer. My name is " + this.name);
        this.strategy.bark();
    }
}
