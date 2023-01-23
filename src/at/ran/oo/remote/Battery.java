package at.ran.oo.remote;

public class Battery {
    private int state;

    public Battery(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
