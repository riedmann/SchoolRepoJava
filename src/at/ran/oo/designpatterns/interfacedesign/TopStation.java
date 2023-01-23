package at.ran.oo.designpatterns.interfacedesign;

import java.util.Random;

public class TopStation implements BaseStation {
    private int temp;

    public TopStation() {
        this.temp = (new Random()).nextInt(20);
    }

    public TopStation(int a){

    }

    public TopStation(String a){

    }

    public int getTemp() {

        return temp;
    }

    @Override
    public double getTemperature() {
        int data = 7;
        return this.temp;
    }
}
