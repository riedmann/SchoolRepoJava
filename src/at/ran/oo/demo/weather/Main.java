package at.ran.oo.demo.weather;

public class Main {
    public static void main(String[] args) {
        WheaterStation ws1 = new WheaterStation();
        WheaterStation ws2 = new WheaterStation();
        WeatherSagmeister sag1 = new WeatherSagmeister();

        System.out.println(ws1.getTemperature());
        System.out.println(ws2.getTemperature());

        WeatherCentral wc = new WeatherCentral();
        wc.addStation(ws1);
        wc.addStation(ws2);
        wc.addStation(sag1);

        System.out.println(wc.getAverageTemperature());
    }
}
