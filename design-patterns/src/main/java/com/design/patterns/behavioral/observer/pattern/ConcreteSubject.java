package com.design.patterns.behavioral.observer.pattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class ConcreteSubject extends Subject {

    private final HashMap<Integer, LinkedList<Observer>> observers;

    public ConcreteSubject() {
        observers = new HashMap<>();
    }

    private LinkedList<Observer> getList(int type) {
        if (!observers.containsKey(type)) {
            observers.put(type, new LinkedList<>());
        }
        return observers.get(type);
    }

    @Override
    public void attach(int eventType, Observer newObserver) {
        getList(eventType).add(newObserver);
    }

    @Override
    public void detach(int eventType, Observer observer) {
        getList(eventType).remove(observer);
    }

    @Override
    public void notifyObserver(int eventType, Event event) {
        if (observers.containsKey(eventType)){
            Iterator<Observer> iterator = observers.get(eventType).iterator();
            while(iterator.hasNext()){
                iterator.next().update(event);
            }
        }
    }

}
