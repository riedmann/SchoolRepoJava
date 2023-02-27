package at.ran.oo.demo.calc;

import java.util.Scanner;

public class GUI {
    public static void main(String[] args) {
        StandardCalc calc = new StandardCalc();

        System.out.println(calc.add(4,7));

        SinusCalculator sinus = new SinusCalculator();
        sinus.sinus(4);


        System.out.println("Wähle deine Funktion");
        Scanner scan = new Scanner(System.in);
        int selection = scan.nextInt();

        switch (selection){
            case 0: // Please enter a, und b
                calc.add(4,7);
                break;
        }
    }
}
