package org.patterns.creational.factor_method.factory;

import org.patterns.creational.factor_method.model.Truck;
import org.patterns.creational.factor_method.model.Vehicle;

// Concrete Creator: TruckFactory
public class TruckFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Truck(); // returns a Truck instance
    }
}
