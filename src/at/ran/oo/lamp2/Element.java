package at.ran.oo.lamp2;

public class Element {
    private boolean isOn = false;
    private int consumption = 0;

    public Element(int consumption) {
        this.consumption = consumption;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
}
