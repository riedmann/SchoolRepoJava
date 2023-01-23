package at.ran.oo.ifsample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GUI {
    public static void main(String[] args) {

        Inventar v1 = new Bike("123", 1);
        Inventar v2 = new Car("12345");
        Inventar v3 = new Car("123456");
        Inventar v4 = new Car("123457");

        Inventar c5 = new Car("aaaa");
        System.out.println(c5.getSerial()  );

        List<Inventar> inventars = new ArrayList<>();
        inventars.add(v1);
        inventars.add(v2);
        inventars.add(v3);
        inventars.add(v4);
        inventars.add(new Door());


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 für Liste, 2exit");

            int selection = scanner.nextInt();

            if (selection == 1) {
                for (Inventar inventar : inventars) {
                    System.out.println(inventar.getSerial());
                }
            } else {
                break;
            }

        }


    }
}
