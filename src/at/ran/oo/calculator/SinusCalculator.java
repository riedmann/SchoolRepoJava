package at.ran.oo.calculator;

public class SinusCalculator extends Calculator {

    public SinusCalculator(int width, int height, RANColor color) {
        super(width, height, color);
    }

    public double sin(double a){
        return Math.sin(a);
    }
}
