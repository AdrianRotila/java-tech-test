package com.company;

import com.company.parking.CarPark;

public class Main {

    public static void main(String[] args) {
        CarPark carPark = new CarPark(100);
        System.out.println(carPark.totalSpots());
        System.out.println(carPark.availability());
    }
}
