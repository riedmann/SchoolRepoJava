package at.ran.oo.calculator;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ran",20);
        System.out.println(t1.getName());
        t1.talk();

        Calculator c1 = new Calculator(5, 10, new RANColor(100,100,100));
        double result = c1.add(4,7);
        System.out.println("res: " + result);

        SinusCalculator sinCalc = new SinusCalculator(10,20,new RANColor(50,40,30));
        sinCalc.sin(4);
        sinCalc.add(3,2);
    }
}
