package com.betty.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Betty on 27-Apr-16.
 */
public class SubjectImpl implements Subject {
    List<Observer> observerList = new ArrayList<>();
    private Object theChange;

    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyStatusChange() {
        for (Observer observer : observerList) {
            observer.update(theChange);
        }
    }

    @Override
    public void someChange(Object obj) {
        theChange = obj;
        notifyStatusChange();
    }
}
