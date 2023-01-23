package at.ran.oo.designpatterns.bark;

import at.ran.oo.designpatterns.bark.barkstrategies.BarkStrategy;

public class Boxer extends Dog{

    public Boxer(String name, BarkStrategy strategy) {
        super(name, strategy);
    }

    @Override
    public void givePaw() {
        System.out.println("uiuiui");
    }
}
