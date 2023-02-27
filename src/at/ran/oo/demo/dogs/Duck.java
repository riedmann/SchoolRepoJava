package at.ran.oo.demo.dogs;

import at.ran.oo.demo.dogs.barkstrategies.BarkStrategy;

public class Duck extends AbstractDog implements IDuck{
    public Duck(String name, int age, BarkStrategy strategy) {
        super(name, age, strategy);
    }

    @Override
    public void run() {
        this.strategy.bark();
    }

    @Override
    public void waddle() {

    }
}
