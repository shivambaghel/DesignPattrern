package com.java.design.patterns.creational.abstractfactory.childinterfaces.impl;

import com.java.design.patterns.creational.abstractfactory.childinterfaces.CarSpecification;

public class NorthAmericanCarSpecification implements CarSpecification {
    @Override
    public void displayCarSpecification() {
        System.out.println("North American car specification");
    }
}
