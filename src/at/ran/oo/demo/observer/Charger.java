package at.ran.oo.demo.observer;

public class Charger implements Observer{
    @Override
    public void inform(int voltage) {
        System.out.println("I am a Charger. V:" + voltage);
    }
}
