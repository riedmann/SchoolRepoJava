package at.ran.oo;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;

        int result = add(a, b);
        System.out.println(a);

        Car c1 = new Car();
        System.out.println(c1.getSerial());


    }



    // call by value = KOPIE
    // call by refernce = Zeiger
    public static int add(int a, int b) {
        a = 9;
        return a + b;
    }


}
