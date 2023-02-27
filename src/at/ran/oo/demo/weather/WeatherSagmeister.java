package at.ran.oo.demo.weather;

public class WeatherSagmeister implements Station{
    private int tmp;

    public WeatherSagmeister() {
        this.tmp = 19;
    }



    @Override
    public int getTemperature() {
        return tmp;
    }
}
