package at.ran.oo.ifsample;

public abstract class Vehicle implements Inventar{
    private String serial;

    public Vehicle(String serial) {
        this.serial = serial;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
