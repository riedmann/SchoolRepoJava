package at.ran.oo.demo.observer;

import java.util.ArrayList;
import java.util.List;

public class SunCollector {
    public List<Observer> observers;

    public SunCollector() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        // here i could check the observer
        this.observers.add(observer);
    }

    public void inform(){
        for (Observer observer:this.observers) {
            observer.inform(20);
        }
    }
}
