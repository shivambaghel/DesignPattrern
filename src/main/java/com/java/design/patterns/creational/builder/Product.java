package com.java.design.patterns.creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Product {
    private String name;
    private String description;
    private double price;
}
