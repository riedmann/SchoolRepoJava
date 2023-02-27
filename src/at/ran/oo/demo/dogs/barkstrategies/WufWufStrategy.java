package at.ran.oo.demo.dogs.barkstrategies;

public class WufWufStrategy implements BarkStrategy{
    @Override
    public void bark() {
        System.out.println("WufWuf");
    }
}
