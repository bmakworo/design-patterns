package com.betty.pattern.observer;


/**
 * Created by Betty on 27-Apr-16.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyStatusChange();
    void someChange(Object object);

}
