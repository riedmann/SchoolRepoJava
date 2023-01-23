package at.ran.oo.designpatterns.bark;

import at.ran.oo.designpatterns.bark.barkstrategies.BarkStrategy;

public class Pudeel extends Dog{

    public Pudeel(String name, BarkStrategy strategy) {
        super(name, strategy);
    }

    @Override
    public void givePaw() {
        System.out.println("jupidi");
    }
}
