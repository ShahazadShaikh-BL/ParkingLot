package com.parking;

// Driver Class
public class ParkingLotSystem {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(100);


        Car car1 = new Car("ABC123");
        Car car2 = new Car("XYZ789");

        lot.parkCar(car1);
        lot.parkCar(car2);

        // Driver tries to find their car
        int spotNumber = lot.findCarSpot(car1);
        if (spotNumber != -1) {
            System.out.println("Car found at spot: " + spotNumber);
        } else {
            System.out.println("Car not found in the parking lot!");
        }
       // lot.unparkCar();
    }
}
