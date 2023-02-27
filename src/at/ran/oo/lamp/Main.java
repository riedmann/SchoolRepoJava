package at.ran.oo.lamp;

public class Main {
    public static void main(String[] args) {
        Element e1 = new Element("red");
        Element e2 = new Element("gree");
        Element e3 = new Element("red");

        Lamp lamp = new Lamp();
        lamp.addElement(e1);
        lamp.addElement(e2);

        lamp.turnAllOn();

        System.out.println("test");
    }
}
