package at.ran.oo.lamp2;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Element> elements;


    public Lamp() {
        this.elements = new ArrayList<>();
    }

    public void addElement(Element element){
        elements.add(element);

    }

    public void turnAllOn(){
        for (Element element:this.elements) {
            element.setOn(true);
        }
    }


}
