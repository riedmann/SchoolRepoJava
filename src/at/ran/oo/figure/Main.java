package at.ran.oo.figure;

public class Main {

    public enum TraficLight{
        GREEN,
        ORANGE,
        RED
    }

    public static void main(String[] args) {
        TraficLight color = TraficLight.GREEN;

        printTrafficLight(color);

    }

    public static void printTrafficLight(TraficLight color){
        if (color==TraficLight.GREEN){
            System.out.println(TraficLight.GREEN.toString());
        } else if (color == TraficLight.ORANGE) {
            System.out.println("orange");
        } else if (color==TraficLight.RED){
            System.out.println("red");
        }
    }
}
