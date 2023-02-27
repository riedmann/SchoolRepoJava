package at.ran.oo.demo.singleton1;

public class Test {
    public static void main(String[] args) {
        Cart c1 = Cart.getInstance();
        Cart c2 = Cart.getInstance();
        c1.addItem("Seife");
        c2.addItem("Brot");
        c1.addItem("Döner");

        c1.printItems();
    }
}
