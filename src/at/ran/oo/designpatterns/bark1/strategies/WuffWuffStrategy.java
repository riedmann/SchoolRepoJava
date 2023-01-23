package at.ran.oo.designpatterns.bark1.strategies;

public class WuffWuffStrategy implements WufStrategy{
    @Override
    public void bark() {
        System.out.println("WuffWuff");
    }
}
