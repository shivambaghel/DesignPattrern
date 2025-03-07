package com.java.design.patterns.creational.singleton.lazyInititalization;

public class Singleton {
    // Lazy Initialization
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
       return instance;
    }
}
