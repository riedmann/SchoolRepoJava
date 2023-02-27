package at.ran.oo.lamp;

import java.sql.SQLOutput;

public class Element {
    private boolean isOn = false;
    private String color;

    public Element(String color) {
        this.color = color;
    }

    public void turnOn(){
        if (isOn){
            System.out.println("Already on");
        } else {
            isOn = true;
        }
    }



    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
