package com.company.parking;

import com.company.vehicle.*;

import java.util.HashMap;
import java.util.Map;

public class CarPark {

    private Map<SpaceType, Integer> carParkAvailability = new HashMap<>();
    private int size;

    public CarPark(int size) {
        this.size = size;
        allocateSpace();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<SpaceType, Integer> getCarParkAvailability() {
        return carParkAvailability;
    }

    public void setCarParkAvailability(Map<SpaceType, Integer> carParkAvailability) {
        this.carParkAvailability = carParkAvailability;
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle.getClass() == (Motorbike.class)) {
            decreaseSpace(SpaceType.bikes);
        }
        if (vehicle.getClass() == (Car.class)) {
            decreaseSpace(SpaceType.cars);
        }
        if (vehicle.getClass() == (Van.class)) {
            decreaseSpace(SpaceType.vans);
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        if (vehicle.getClass() == (Motorbike.class)) {
            increaseSpace(SpaceType.bikes);
        }
        if (vehicle.getClass() == (Car.class)) {
            increaseSpace(SpaceType.cars);
        }
        if (vehicle.getClass() == (Van.class)) {
            increaseSpace(SpaceType.vans);
        }
    }

    private void allocateSpace() {
        carParkAvailability.put(SpaceType.bikes, size / 3);
        carParkAvailability.put(SpaceType.cars, size / 3);
        carParkAvailability.put(SpaceType.vans, size / 3);

    }

    public String availability() {
        return "Spots available: \n" + " -> Motorbikes: " + carParkAvailability.get(SpaceType.bikes) +
                "\n -> Cars: " + carParkAvailability.get(SpaceType.cars) +
                "\n -> Vans: " + carParkAvailability.get(SpaceType.vans);
    }

    public String totalSpots() {
        int totalSpots = carParkAvailability.get(SpaceType.bikes) +
                carParkAvailability.get(SpaceType.cars) +
                carParkAvailability.get(SpaceType.vans);
        return "Total Spots: " + totalSpots;
    }

    public void decreaseSpace(SpaceType spaceType) {
        int space = carParkAvailability.get(spaceType);

        if (size == 0) {
            System.out.println("The parking lot is FULL");
        } else if (space != 0) {
            space--;
            carParkAvailability.put(spaceType, space);
        } else {
            System.out.println("All the spots for " + spaceType + " are full");
        }

    }

    public void increaseSpace(SpaceType spaceType) {
        int space = carParkAvailability.get(spaceType);
        if (space != size / 3) {
            space++;
            carParkAvailability.put(spaceType, space);
        } else {
            System.out.println("All the spots for " + spaceType + " are empty");
        }
    }


}
