package se.iths.martin.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unRegisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.listener();
        }
    }
}
