package com.parking;

// Driver Class
public class Driver {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(100);
        // Driver parks their car
        lot.parkCar();
        lot.parkCar(); // Parking 2nd car
        // D Driver unparks their car to go home

        Car car1 = new Car("ABC123");
        Car car2 = new Car("XYZ789");

        lot.parkCarByAttendant(car1);
        lot.parkCarByAttendant(car2);
       // lot.unparkCar();
    }
}
