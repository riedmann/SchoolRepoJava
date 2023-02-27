package at.ran.oo.demo.designpatterns.interfacedesign;

import java.util.Random;

public class Station implements BaseStation{
    private double temperature;
    private double humidity;

    public Station() {
        Random random = new Random();
        this.temperature = random.nextInt(100) - 50;
        this.humidity = random.nextInt(100) ;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }


}
