package at.ran.oo.demo.ifsample;

public class Bike extends Vehicle {

    private int typ;


    public Bike(String ser, int typ) {
        super(ser);
        this.typ = typ;
    }


    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }


}
