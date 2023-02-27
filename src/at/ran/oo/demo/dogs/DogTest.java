package at.ran.oo.demo.dogs;

import at.ran.oo.demo.dogs.barkstrategies.BarkStrategy;
import at.ran.oo.demo.dogs.barkstrategies.WufWufStrategy;
import at.ran.oo.demo.dogs.barkstrategies.WuuufStrategy;

public class DogTest {
    public static void main(String[] args) {
        BarkStrategy s1 = new WuuufStrategy();
        BarkStrategy s2 = new WufWufStrategy();
        Boxer b1 = new Boxer("hans",17, s2);
        Puddel p1 = new Puddel("paul",18, s1);

        b1.run();
        p1.run();



    }
}
