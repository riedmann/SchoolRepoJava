package at.ran.oo.demo.designpatterns.demo;

import java.util.LinkedList;
import java.util.List;

public class DoenerMan {
    private int id;
    private String name;
    private List<DerGeraet> derGeraeters;

    public DoenerMan(int id, String name) {
        this.id = id;
        this.name = name;
        this.derGeraeters = new LinkedList<>();
    }

    public void addDerGeraet(DerGeraet geraet){
        this.derGeraeters.add(geraet);
    }

    public int getOverallPowerUsage(){
        int sum = 0;
        for (DerGeraet geraet :this.derGeraeters) {
            sum += geraet.getSumOfPowerUsage();
        }
        return sum;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<DerGeraet> getDerGeraeters() {
        return derGeraeters;
    }


}
