package at.ran.oo.designpatterns.bark1;

import at.ran.oo.designpatterns.bark1.strategies.WufStrategy;

import java.time.LocalDate;

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
