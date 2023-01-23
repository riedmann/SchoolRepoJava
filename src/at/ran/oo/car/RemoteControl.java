package at.ran.oo.car;

public class RemoteControl {
    private String color;
    private String producer;
    private Battery battery1;
    private Battery battery2;

    public RemoteControl(String color, String producer) {
        this.color = color;
        this.producer = producer;
    }


    public void pressButton(int number){
        System.out.println("button pressed" + number);
    }

    public String getColor() {
        return color;
    }



    public String getProducer() {
        return producer;
    }



    public Battery getBattery1() {
        return battery1;
    }

    public void setBattery1(Battery battery1) {
        this.battery1 = battery1;
    }

    public Battery getBattery2() {
        return battery2;
    }

    public void setBattery2(Battery battery2) {
        this.battery2 = battery2;
    }
}
