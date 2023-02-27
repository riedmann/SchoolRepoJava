package at.ran.oo.demo.designpatterns.demo;

public class GUI {
    public static void main(String[] args) {
        DerGeraet g1 = new DerGeraet(17);
        DerGeraet g2 = new DerGeraet(10);

        g1.makeDoener();
        g1.makeDoener();
        g2.makeDoener();
        DoenerMan dm = new DoenerMan(10, "Mustafa");
        dm.addDerGeraet(g1);
        dm.addDerGeraet(g2);

        System.out.println(dm.getOverallPowerUsage());
        System.out.println("test");
    }
}
