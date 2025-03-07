package com.java.design.patterns.creational.abstractfactory.childinterfaces.impl;

import com.java.design.patterns.creational.abstractfactory.childinterfaces.Car;

public class SedanCar implements Car {
    @Override
    public void assemble() {
        System.out.println("assembling Sedan car");
    }
}
