package com.java.design.patterns.creational.singleton.billpugh;

public class Singleton {
    // Bill Pugh Pattern [used nested class approach]


    private Singleton() {}

    public static Singleton getInstance() {
       return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }
}
