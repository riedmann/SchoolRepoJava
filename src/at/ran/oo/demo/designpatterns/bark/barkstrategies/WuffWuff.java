package at.ran.oo.demo.designpatterns.bark.barkstrategies;

public class WuffWuff implements BarkStrategy{
    @Override
    public void bark() {
        System.out.println("WuffWuff");
    }
}
