package com.java.design.patterns.structural.bridge;

import com.java.design.patterns.structural.bridge.bridges.Device;
import com.java.design.patterns.structural.bridge.bridges.Radio;
import com.java.design.patterns.structural.bridge.bridges.Tv;
import com.java.design.patterns.structural.bridge.remotes.AdvancedRemote;
import com.java.design.patterns.structural.bridge.remotes.BasicRemote;

public class BridgeMainClass {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
