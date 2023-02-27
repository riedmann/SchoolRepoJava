package at.ran.oo.demo.factory;

public class Ant extends AbstractActor{

    public Ant(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("I am " + this.name + " i am an " + getClass().getName());
    }
}
