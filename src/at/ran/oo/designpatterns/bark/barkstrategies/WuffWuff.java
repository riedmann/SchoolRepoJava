package at.ran.oo.designpatterns.bark.barkstrategies;

public class WuffWuff implements BarkStrategy{
    @Override
    public void bark() {
        System.out.println("WuffWuff");
    }
}
