package at.ran.oo.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Element> elements;


    public Lamp() {
        elements = new ArrayList<>();
    }

    public void addElement(Element element){
        elements.add(element);
    }

    public void turnAllOn(){
        for (Element element: this.elements) {
            element.turnOn();
        }
    }
}
