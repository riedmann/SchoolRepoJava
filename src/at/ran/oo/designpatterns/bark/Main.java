package at.ran.oo.designpatterns.bark;

import at.ran.oo.designpatterns.bark.barkstrategies.BarkStrategy;
import at.ran.oo.designpatterns.bark.barkstrategies.WuffWuff;
import at.ran.oo.designpatterns.bark.barkstrategies.Wuuuuuuf;

public class Main {
    public static void main(String[] args) {
        BarkStrategy s1 = new Wuuuuuuf();
        BarkStrategy s2 = new WuffWuff();
        Dog d1 = new Pudeel("hansi", s1);
        Dog d2 = new Boxer("SeppBoxi",s2);

        d1.run();
        d2.run();


        d2.setStrategy(s1);
    }
}
