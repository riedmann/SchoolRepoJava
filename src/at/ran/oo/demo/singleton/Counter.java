package at.ran.oo.demo.singleton;

public class Counter {
    private static Counter instance = null;
    private static int count = 0;

    public  Counter() {
    }

    public static void increase(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
