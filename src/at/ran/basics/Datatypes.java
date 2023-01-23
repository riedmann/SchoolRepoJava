package at.ran.basics;

import java.util.*;

public class Datatypes {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(9);


        list.add(2,3);
        System.out.println(list);

    }



    public static int getMinValue(List<Integer> data) {
        int minValue = Integer.MAX_VALUE;
        for (int i=0;i<data.size();i++) {
            if (data.get(i) < minValue) {
                minValue = data.get(i);
            }
        }

        return minValue;
    }

}
