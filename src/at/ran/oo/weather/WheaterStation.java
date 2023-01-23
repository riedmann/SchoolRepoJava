package at.ran.oo.weather;

import java.util.Random;

public class WheaterStation implements Station{
    // Kapselung
    private int temperature;

    public WheaterStation() {
        setRandomTemperature();
    }

    public void setRandomTemperature(){
        this.temperature = (new Random()).nextInt(100) -50;
    }

    public int getTemperature() {
        return temperature;
    }


}
