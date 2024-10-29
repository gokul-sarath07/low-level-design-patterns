package org.patterns.creational.factor_method;

import org.patterns.creational.factor_method.factory.CarFactory;
import org.patterns.creational.factor_method.factory.VehicleFactory;

// Client code
// this could be code from different application or from a different module.
public class Client {
    public static void factoryMethod() {
        VehicleFactory vehicle = new CarFactory();
        vehicle.deliverVehicle();
    }
}
