package at.ran.oo.demo.designpatterns.bark1;

import at.ran.oo.demo.designpatterns.bark1.strategies.WufStrategy;

public class Dogge extends AbstractDog{
    public Dogge(WufStrategy strategy) {
        super(strategy);
    }

    @Override
    public void run() {
        System.out.println("I am a dogge");
        strategy.bark();
    }
}
