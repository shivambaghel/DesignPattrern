package com.java.design.patterns.creational.abstractfactory.childinterfaces.impl;

import com.java.design.patterns.creational.abstractfactory.childinterfaces.CarSpecification;

public class EuropeCarSpecification implements CarSpecification {
    @Override
    public void displayCarSpecification() {
        System.out.println("Europe car specification");
    }
}
