package org.patterns.creational.factor_method.model;

// Concrete Product: Truck
public class Truck implements Vehicle {

    @Override
    public void design() {
        System.out.println("Designing a Truck...");
    }
}
