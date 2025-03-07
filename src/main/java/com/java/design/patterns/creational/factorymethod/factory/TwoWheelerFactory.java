package com.java.design.patterns.creational.factorymethod.factory;

import com.java.design.patterns.creational.factorymethod.basestructure.TwoWheeler;
import com.java.design.patterns.creational.factorymethod.basestructure.Vehicle;

public class TwoWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle create() {
        System.out.println("Creating Two Wheeler from Factory of Two Wheeler");
        return new TwoWheeler();
    }
}
