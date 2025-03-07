package com.java.design.patterns.creational.factorymethod;

import com.java.design.patterns.creational.factorymethod.basestructure.Vehicle;
import com.java.design.patterns.creational.factorymethod.factory.VehicleFactory;

public class Client {
    private Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory) {
        vehicle = vehicleFactory.create();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
