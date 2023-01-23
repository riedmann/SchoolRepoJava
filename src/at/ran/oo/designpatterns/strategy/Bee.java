package at.ran.oo.designpatterns.strategy;

public class Bee implements Actor{
    @Override
    public void update() {
        System.out.println("I am abee");
    }

    @Override
    public void render() {
        System.out.println("Bee render");
    }
}
