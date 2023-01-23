package at.ran.oo.designpatterns.interfacedesign;

public class Main {
    public static void main(String[] args) {
        WeatherService ws = new WeatherService();
        Station s1 = new Station();
        Station s2 = new Station();
        TopStation ts1 = new TopStation();
        ws.addStation(s1);
        ws.addStation(s2);
        ws.addStation(ts1);
        double result  = ws.getAvgTemperature();
        System.out.println(result);


        TopStation ts = new TopStation("string");
    }
}
