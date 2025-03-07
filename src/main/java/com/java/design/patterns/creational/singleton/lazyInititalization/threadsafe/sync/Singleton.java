package com.java.design.patterns.creational.singleton.lazyInititalization.threadsafe.sync;

public class Singleton {
    // Synchronized method Initialization
    // Thread Safe but slow
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
       return instance;
    }
}
