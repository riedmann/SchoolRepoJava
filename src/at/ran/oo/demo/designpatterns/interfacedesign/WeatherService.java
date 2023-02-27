package at.ran.oo.demo.designpatterns.interfacedesign;

import java.util.ArrayList;
import java.util.List;

public class WeatherService {
    private List<BaseStation> stations;


    public WeatherService() {
        this.stations = new ArrayList<>();
    }

    public void addStation(BaseStation station){
        this.stations.add(station);
    }
    public double getAvgTemperature(){
        double sum = 0;
        for (BaseStation station: stations) {
            System.out.println(station.getTemperature());
            sum += station.getTemperature();
        }

        double result = sum/stations.size();
        return result;
    }
}
