package com.parking;

// Driver Class
public class Driver {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(100);
        // Driver parks their car
        lot.parkCar();
        lot.parkCar(); // Parking 2nd car
        // D Driver unparks their car to go home
        lot.unparkCar();
    }
}
