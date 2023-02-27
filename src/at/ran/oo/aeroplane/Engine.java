package at.ran.oo.demo.aeroplane;

public class Engine {
    private int hp;
    private boolean isOn;

    public Engine(int hp) {
        this.hp = hp;
        this.isOn = false;
    }

    public int getHp() {
        return hp;
    }



    public void start(){
        this.isOn = true;
    }

    public void stop(){
        this.isOn = false;
    }

    public void run(int amount){

    }
}
