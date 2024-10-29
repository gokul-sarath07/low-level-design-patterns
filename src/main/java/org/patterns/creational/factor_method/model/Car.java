package org.patterns.creational.factor_method.model;

// Concrete Product: Car
public class Car implements Vehicle {

    @Override
    public void design() {
        System.out.println("Designing a Car...");
    }
}
