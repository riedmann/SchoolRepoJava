package at.ran.oo.demo.observer;

public class Tester {
    public static void main(String[] args) {
        SunCollector sc = new SunCollector();

        sc.addObserver(new Heater());
        sc.addObserver(new Charger());
        sc.addObserver(new Charger());

        sc.inform();
    }
}
