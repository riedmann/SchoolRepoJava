package at.ran.oo.demo.observer;

public class Heater implements Observer{
    @Override
    public void inform(int voltage) {
        System.out.println("I am a Heater. V:" + voltage);
    }
}
