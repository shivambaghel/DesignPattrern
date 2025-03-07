package com.java.design.patterns.creational.abstractfactory.factoryinterfaces.impl;

import com.java.design.patterns.creational.abstractfactory.childinterfaces.Car;
import com.java.design.patterns.creational.abstractfactory.childinterfaces.CarSpecification;
import com.java.design.patterns.creational.abstractfactory.childinterfaces.impl.NorthAmericanCarSpecification;
import com.java.design.patterns.creational.abstractfactory.childinterfaces.impl.SedanCar;
import com.java.design.patterns.creational.abstractfactory.factoryinterfaces.CarFactory;

public class NorthAmericanCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        System.out.println("car required at NorthAmericanCarFactory");
        return new SedanCar();
    }

    @Override
    public CarSpecification CreateSpecification() {
        System.out.println("car specification required at NorthAmericanCarFactory");
        return new NorthAmericanCarSpecification();
    }
}
