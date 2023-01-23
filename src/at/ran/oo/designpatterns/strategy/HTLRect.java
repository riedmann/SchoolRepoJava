package at.ran.oo.designpatterns.strategy;

public class HTLRect implements Actor {
    public void update(){
        System.out.println("Update Rect");
    }

    @Override
    public void render() {
        System.out.println("rect render");
    }

    public void doC(){

    }
}
