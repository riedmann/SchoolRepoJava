package at.ran.oo.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherCentral {
    private List<Station> stations;


    public WeatherCentral() {
        this.stations = new ArrayList<>();
    }

    public void addStation(Station station){
        this.stations.add(station);
    }

    public int getAverageTemperature(){
        int avg = 0;
        for (Station station: this.stations) {
            System.out.println("temp:" + station.getTemperature());
            avg += station.getTemperature();
        }
        return avg/this.stations.size();
    }
}
