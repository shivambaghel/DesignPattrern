package com.java.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable {

    List<Integer> attributes;

    public Prototype(List<Integer> attributes) {
        this.attributes = attributes;
    }


    @Override   // shallow copy -> attached,  if i change on original obj it will be changed.
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Prototype deepClone(){   // detached ->  if i change original obj it will not be changed.
        List<Integer> newAttributesList = new ArrayList<>(attributes); // deep copy>
        return new Prototype(newAttributesList);
    }
}
