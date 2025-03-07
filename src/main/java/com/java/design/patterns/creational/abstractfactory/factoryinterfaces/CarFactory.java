package com.java.design.patterns.creational.abstractfactory.factoryinterfaces;

import com.java.design.patterns.creational.abstractfactory.childinterfaces.Car;
import com.java.design.patterns.creational.abstractfactory.childinterfaces.CarSpecification;

public interface CarFactory {
    Car createCar();
    CarSpecification CreateSpecification();
}
