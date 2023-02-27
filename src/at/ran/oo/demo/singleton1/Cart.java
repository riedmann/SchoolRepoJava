package at.ran.oo.demo.singleton1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static Cart instance = null;
    private List<String> items = new ArrayList<>();

    private Cart() {
    }
    public static Cart getInstance(){
        if (instance==null){
            instance = new Cart();
        }
        return instance;
    }

    public void addItem(String item){
        this.items.add(item);
    }

    public void printItems(){
        for (String item:this.items
             ) {
            System.out.println("Item:" + item);

        }
    }
}
