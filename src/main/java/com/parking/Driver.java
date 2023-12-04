package com.parking;

public class Driver {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(100);

        // Driver parks their car
        lot.parkCar();

        // Driver unparks their car
        lot.unparkCar();
    }
}
