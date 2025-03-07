package com.java.design.patterns.creational.singleton.enumway;

public enum Singleton {

    // pros
    // simple & thread safe as [default -> Constructor is private & constant are public static final]
    // provide inherent serialization
    // protect against instantiation via serialization and reflection

    // cons
    // limited flexibility in terms of lazy initialization

    INSTANCE;
}
