package at.ran.oo.demo.designpatterns.bark;

import at.ran.oo.demo.designpatterns.bark.barkstrategies.BarkStrategy;

public abstract class Dog {
    private String name;
    private BarkStrategy strategy;

    public Dog(String name, BarkStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void setStrategy(BarkStrategy strategy){
        this.strategy = strategy;
    }

    public void run(){
        System.out.println("I am " + name + " I am barking:");
        this.strategy.bark();
    }

    public abstract void givePaw();
}
