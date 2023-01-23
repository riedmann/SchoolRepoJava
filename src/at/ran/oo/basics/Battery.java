package at.ran.oo.basics;

public class Battery {
    private int size;
    private double voltage;
    private int weightInGrams;
    private int chargingStatus;

    public Battery(double voltage, int chargingStatus) {
        this.voltage = voltage;
        this.chargingStatus = chargingStatus;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public int getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }
}
