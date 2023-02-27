package at.ran.oo.demo.designpatterns.demo;

public class DerGeraet {
    private int powerUsage;
    private int sumOfPowerUsage;
    private int todaysProductionAmount;
    private boolean isOn;

    public DerGeraet(int powerUsage) {
        this.powerUsage = powerUsage;
        this.todaysProductionAmount = 0;
    }

    public void makeDoener(){
        sumOfPowerUsage += powerUsage;
        todaysProductionAmount += 20;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public int getTodaysProductionAmount() {
        return todaysProductionAmount;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getSumOfPowerUsage() {
        return sumOfPowerUsage;
    }
}
