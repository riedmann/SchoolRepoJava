package at.ran.oo.calculator;

import java.awt.*;

public class Calculator {
    private int width, height;
    private RANColor color;

    public Calculator(int width, int height, RANColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double add(double a , double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }
}
