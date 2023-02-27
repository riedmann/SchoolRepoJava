package at.ran.oo.demo.factory;

public class Bee extends AbstractActor{
    public Bee(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("My name is " + this.name + " i am a " + getClass().getName());
    }
}
