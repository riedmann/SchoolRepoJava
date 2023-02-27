package at.ran.oo.demo.factory;

public class Test {
    public static void main(String[] args) {

        // Singleton


        Actor a1 = Factory.getActor();
        Actor a2 = Factory.getActor();
        Actor a3 = Factory.getActor();
        Actor a4 = Factory.getActor();

        a1.sayHello();
        a2.sayHello();
        a3.sayHello();
        a4.sayHello();
    }
}
