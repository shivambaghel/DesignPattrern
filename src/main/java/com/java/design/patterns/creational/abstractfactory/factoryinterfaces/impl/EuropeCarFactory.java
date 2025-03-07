package com.java.design.patterns.creational.abstractfactory.factoryinterfaces.impl;

import com.java.design.patterns.creational.abstractfactory.childinterfaces.Car;
import com.java.design.patterns.creational.abstractfactory.childinterfaces.CarSpecification;
import com.java.design.patterns.creational.abstractfactory.childinterfaces.impl.EuropeCarSpecification;
import com.java.design.patterns.creational.abstractfactory.childinterfaces.impl.HatchBackCar;
import com.java.design.patterns.creational.abstractfactory.factoryinterfaces.CarFactory;

public class EuropeCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        System.out.println("car required at EuropeCarFactory");
        return new HatchBackCar();
    }

    @Override
    public CarSpecification CreateSpecification() {
        System.out.println("car specification required at EuropeCarFactory");
        return new EuropeCarSpecification();
    }
}
