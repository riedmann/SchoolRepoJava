package at.ran.oo.demo.dogs;

import at.ran.oo.demo.dogs.barkstrategies.BarkStrategy;

public class Puddel extends AbstractDog{


    public Puddel(String name, int age, BarkStrategy strategy) {
        super(name, age,strategy);
    }

    @Override
    public void run() {
        System.out.println("I amm a Puddel. My name is " + this.name);
        this.strategy.bark();
    }
}
