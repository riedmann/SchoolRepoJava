package at.ran.oo.demo.car;

public class Battery {
    private int loadPercentage;
    private int capacity;

    public Battery(int loadPercentage, int capacity) {
        this.loadPercentage = loadPercentage;
        this.capacity = capacity;
    }

    public int getLoadPercentage() {
        return loadPercentage;
    }

    public void setLoadPercentage(int loadPercentage) {
        this.loadPercentage = loadPercentage;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
