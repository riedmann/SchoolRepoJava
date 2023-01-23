package at.ran.oo.designpatterns.singleton;

import com.sun.source.tree.Scope;

public class Main {
    public static void main(String[] args) {
        Counter c1 = Counter.getSingleton();
        Counter c2 = Counter.getSingleton();

        c1.increaseScore();
        c2.increaseScore();
        c1.increaseScore();



    }
}
