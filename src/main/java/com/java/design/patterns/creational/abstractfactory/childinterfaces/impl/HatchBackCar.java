package com.java.design.patterns.creational.abstractfactory.childinterfaces.impl;

import com.java.design.patterns.creational.abstractfactory.childinterfaces.Car;

public class HatchBackCar implements Car {
    @Override
    public void assemble() {
        System.out.println("assembling HatchBack car");
    }
}
