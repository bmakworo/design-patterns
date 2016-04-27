package com.betty.pattern.observer;

/**
 * Created by Betty on 27-Apr-16.
 */
public class ObserverImpl implements com.betty.pattern.observer.Observer {

    private Subject subject;

    public ObserverImpl(Subject sub){
        subject = sub;
        subject.registerObserver(this);
    }

    @Override
    public void update(Object obj) {

    }

    private void unregister(){
        subject.removeObserver(this);
    }
}
