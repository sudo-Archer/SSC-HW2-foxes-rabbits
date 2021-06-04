package io.muic.ooc.fab.view;

import io.muic.ooc.fab.Field;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(int step, Field field){
        for(int i=0; i<observers.size(); i++){
            observers.get(i).update(step, field);
        }
    }


}
