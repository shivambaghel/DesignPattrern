package com.java.design.patterns.creational.singleton.eagerinitialization;

public class Singleton {
    // Eager Initialization
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
