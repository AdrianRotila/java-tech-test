package com.company;

import com.company.parking.CarPark;
import com.company.vehicle.VehicleFactory;
import com.company.vehicle.VehicleType;

public class Main {

    public static void main(String[] args) {
        CarPark carPark = new CarPark(9);
        System.out.println(carPark.totalSpots());
        System.out.println(carPark.availability());

        VehicleFactory vehicleFactory = new VehicleFactory();

        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));


        System.out.println("\n" + carPark.totalSpots() + "\n");
        System.out.println(carPark.availability() + "\n");

        carPark.addVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));

        System.out.println("\n" + carPark.totalSpots() + "\n");
        System.out.println(carPark.availability() + "\n");

        carPark.addVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));

        System.out.println("\n" + carPark.totalSpots() + "\n");
        System.out.println(carPark.availability() + "\n");

        carPark.addVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));

        System.out.println("\n" + carPark.totalSpots() + "\n");
        System.out.println(carPark.availability() + "\n");

        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.motorBike));

        System.out.println("\n" + carPark.totalSpots() + "\n");
        System.out.println(carPark.availability() + "\n");

        // CHECK FOR EMPTY PARKING
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.car));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.car));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.car));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.car));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.van));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.van));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.van));
        carPark.removeVehicle(vehicleFactory.createVehicle(VehicleType.van));

    }
}
