package at.ran.basics.demo;

public class Runner {
    public static void main(String[] args) {
        Person p1 = new Person("Susi");
        Person p2 =null;
        p2.setName("HAns");
        doSomething(p1);
        System.out.println(p1.getName());

    }

    public static void doSomething(Person p){
        p.setName("Method");

    }
}
