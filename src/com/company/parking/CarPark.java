package com.company.parking;

import java.util.HashMap;
import java.util.Map;

public class CarPark{

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

    private void allocateSpace() {
        int cars = size - size/2;
        carParkAvailability.put(SpaceType.bikeSpace, cars/2);
        carParkAvailability.put(SpaceType.carSpace, cars);
        carParkAvailability.put(SpaceType.vanSpace, cars/2);

    }

    public String availability () {
        return "Spots available: \n" + " -> Motorbikes: " + carParkAvailability.get(SpaceType.bikeSpace) +
                "\n -> Cars: " + carParkAvailability.get(SpaceType.carSpace) +
                "\n -> Vans: " + carParkAvailability.get(SpaceType.vanSpace);
    }

    public String totalSpots() {
        return "Total Spots: " + size;
    }
}
