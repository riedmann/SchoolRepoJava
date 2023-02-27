package at.ran.oo.demo.designpatterns.bark;

import at.ran.oo.demo.designpatterns.bark.barkstrategies.BarkStrategy;

public class Pudeel extends Dog{

    public Pudeel(String name, BarkStrategy strategy) {
        super(name, strategy);
    }

    @Override
    public void givePaw() {
        System.out.println("jupidi");
    }
}
