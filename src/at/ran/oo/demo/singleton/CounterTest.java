package at.ran.oo.demo.singleton;

public class CounterTest {
    public static void main(String[] args) {


        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(c1.getCount());
        Counter.increase();;


        System.out.println(c1.getCount());
        System.out.println(c2.getCount());
    }
}
