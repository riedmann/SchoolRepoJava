package at.ran.oo.projects.aeroplane;

import java.util.ArrayList;
import java.util.List;

public class Aeroplane {
    private int amountOfSeats;
    private int km;
    private int actualHeight;

    private List<Engine> engines;

    public Aeroplane(int amountOfSeats, int km, int actualHeight) {
        this.amountOfSeats = amountOfSeats;
        this.km = km;
        this.actualHeight = actualHeight;
        this.engines = new ArrayList<>();
    }

    public List<Engine> getEngines() {
        return engines;
    }

    public void addEngine(Engine engine) {
        this.engines.add(engine);
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(int amountOfSeats) {

        this.amountOfSeats = amountOfSeats;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getActualHeight() {
        return actualHeight;
    }

    public void setActualHeight(int actualHeight) {
        if (actualHeight < 0) {
            this.actualHeight = 0;
        } else {
            this.actualHeight = actualHeight;
        }
    }
}
