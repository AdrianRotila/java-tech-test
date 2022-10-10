package com.company.vehicle;

import java.util.ArrayList;

public class VehicleFactory {

    private ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

    public Vehicle createVehicle(VehicleType type) {
        Vehicle created = doCreateVehicle(type);
        vehicleArrayList.add(created);
        return created;
    }

    private Vehicle doCreateVehicle(VehicleType type) {
        switch (type) {
            case motorBike:
                return new Motorbike(1);
            case car:
                return new Car(1);
            case van:
                return new Van(3);
        }
        throw new IllegalArgumentException(String.format("Vehicle type %s cannot be created", type));
    }
}
