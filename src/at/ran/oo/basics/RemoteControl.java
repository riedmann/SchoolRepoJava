package at.ran.oo.basics;

public class RemoteControl {
    private boolean isOn;
    private Battery battery1;
    private Battery battery2;

    public RemoteControl() {
        this.isOn =false;
    }

    public void pressButton(int number){
        int value;
        // send signal
        // decrease battery
    }

    public void turnOff() {

        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public Battery getBattery1() {
        return battery1;
    }

    public void setBattery1(Battery battery1) {
        this.battery1 = battery1;
    }

    public Battery getBattery2() {
        return battery2;
    }

    public void setBattery2(Battery battery2) {
        this.battery2 = battery2;
    }
}
