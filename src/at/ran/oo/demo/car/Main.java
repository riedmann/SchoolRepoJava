package at.ran.oo.demo.car;

public class Main {
    public static void main(String[] args) {
        Battery b1 = new Battery(100,3);
        Battery b2= new Battery(80,3);

       RemoteControl rc = new RemoteControl("red","Epson");
        rc.setBattery1(b1);
        rc.setBattery2(b2);
Car c1 =new Car();

        rc.getBattery1().getLoadPercentage();


    }
}
