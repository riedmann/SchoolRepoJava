package at.ran.oo.demo.remote;

public class Remote {
    private Battery battery1;
    private Battery battery2;

    public Remote(Battery battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public int getState(){
        int state = (this.battery1.getState() + this.battery2.getState())/2;
        return state;

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
