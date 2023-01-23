package at.ran.oo.calculator;

public class Main {
    public static void main(String[] args) {
        ScienceCalculator bc = new ScienceCalculator();

        double result = bc.add(4,3.2);
        System.out.println(result);
    }
}
