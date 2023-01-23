package at.ran.oo.aeroplane;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Color c1 = new Color(10,10,10);

        Engine e1 = new Engine(175000);
        Engine e2 = new Engine(160000);

        Aeroplane a1 = new Aeroplane(4000, 2500,c1, e1 );
        Aeroplane a2 = new Aeroplane(7000,6000,new Color(9,8,7),e2);

        System.out.println(a2.getEngine().getHp());

        a1 = a2;

        System.out.println(a1.getEngine().getHp());




    }
}
