package org.patterns.creational.factor_method.factory;

import org.patterns.creational.factor_method.model.Vehicle;

// Creator Class
public abstract class VehicleFactory {

    // Factory method
    public abstract Vehicle createVehicle();

    public void deliverVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.design();
    }
}
