package com.java.design.patterns.creational.factorymethod;

import com.java.design.patterns.creational.factorymethod.basestructure.Vehicle;
import com.java.design.patterns.creational.factorymethod.factory.FourWheelerFactory;
import com.java.design.patterns.creational.factorymethod.factory.TwoWheelerFactory;

public class MainFactoryMethod {
    public static void main(String[] args) {
        Client fourWheelerClient = new Client(new FourWheelerFactory());
        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        fourWheeler.useVehicle();

        System.out.println();

        Client twoWheelerClient = new Client(new TwoWheelerFactory());
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.useVehicle();

    }
}
