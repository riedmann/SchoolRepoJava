package at.ran.oo.demo.basics;

public class Main {
    public static void main(String[] args) {

        int dddddd =31;
        int startDay = 4;

        for (int i = 0; i < startDay; i++) {
            System.out.print("  ");
        }

        for (int i = 1; i <= dddddd; i++) {

            if (i<10){
                System.out.print(" " + i + " ");
            }else {
                System.out.print(i + " ");
            }

            if (i%7==0){
                System.out.println();
            }
        }
    }
}
