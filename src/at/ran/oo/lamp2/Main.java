package at.ran.oo.lamp2;


public class Main {
    public static void main(String[] args) {
        Element e1 = new Element(70);
        Element e2 = new Element(50);

        Lamp l1 = new Lamp();

        l1.addElement(e1);
        l1.addElement(e2);

        l1.turnAllOn();

        System.out.println(e1.isOn());
        System.out.println(e1.getConsumption());
    }
}
