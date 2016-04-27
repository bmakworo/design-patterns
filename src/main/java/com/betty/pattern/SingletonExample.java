package com.betty.pattern;

/**
 * Created by Betty on 27-Apr-16.
 */
public class SingletonExample {

    private SingletonExample() {
    }

    private volatile static SingletonExample singletonExample;

    public static SingletonExample getInstance() {
        if (singletonExample == null) {

            synchronized (SingletonExample.class) {
                if (singletonExample == null) {
                    singletonExample = new SingletonExample();
                }
            }
        }
        return singletonExample;
    }

    public void printTest(){
        System.out.println("Hello singleton!");
    }

    public static void main(String[] args){
        SingletonExample singleton = SingletonExample.getInstance();
        singleton.printTest();
    }
}
