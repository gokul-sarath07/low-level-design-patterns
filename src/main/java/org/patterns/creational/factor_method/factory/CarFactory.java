package org.patterns.creational.factor_method.factory;

import org.patterns.creational.factor_method.model.Car;
import org.patterns.creational.factor_method.model.Vehicle;

// Concrete Creator: CarFactory
public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        System.out.println("Car is created...");
        return new Car(); // returns a Car instance
    }
}
