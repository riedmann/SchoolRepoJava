package at.ran.oo.designpatterns.bark1;

import at.ran.oo.designpatterns.bark1.strategies.WufStrategy;
import at.ran.oo.designpatterns.bark1.strategies.WuffWuffStrategy;
import at.ran.oo.designpatterns.bark1.strategies.WuuuuufStrategy;

public class Main {
    public static void main(String[] args) {
        WufStrategy ws1 = new WuffWuffStrategy();
        WufStrategy ws2 = new WuuuuufStrategy();


        Boxer d1 = new Boxer(ws2);
        Dogge d2 = new Dogge(ws1);

        d2.run();




    }
}
