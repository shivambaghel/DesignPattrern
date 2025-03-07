package com.java.design.patterns.creational.factorymethod.factory;

import com.java.design.patterns.creational.factorymethod.basestructure.FourWheeler;
import com.java.design.patterns.creational.factorymethod.basestructure.Vehicle;

public class FourWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle create() {
        System.out.println("Creating Four Wheeler from Factory of Four Wheeler");
        return new FourWheeler();
    }
}
