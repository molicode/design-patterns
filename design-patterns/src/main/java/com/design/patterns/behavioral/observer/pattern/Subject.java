package com.design.patterns.behavioral.observer.pattern;

public abstract class Subject {

    public abstract void attach(int eventType, Observer observer);
    public abstract void detach(int eventType, Observer ovObserver);
    public abstract void notifyObserver(int eventType, Event event);

}
