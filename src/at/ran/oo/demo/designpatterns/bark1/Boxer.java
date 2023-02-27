package at.ran.oo.demo.designpatterns.bark1;

import at.ran.oo.demo.designpatterns.bark1.strategies.WufStrategy;

public class Boxer extends AbstractDog{


    public Boxer(WufStrategy strategy) {
        super(strategy);
    }

    @Override
    public void run() {
        System.out.println("I am a boxer. I am running");
        strategy.bark();
    }

}
