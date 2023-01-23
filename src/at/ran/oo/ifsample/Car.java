package at.ran.oo.ifsample;

public class Car extends Vehicle{
    private String color;


    public void drive(){
        System.out.println("driving");
    }
    public Car(String serial) {
        super(serial);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
