package com.parking;

import java.util.Map;

// Parking Lot Class
class ParkingLot {
    private int capacity;
    private int occupiedSpaces;
    private Map<Integer, Car> parkedCars;
    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.occupiedSpaces = 0;

    }
    public boolean parkCar(Car car) {
        if (occupiedSpaces < capacity) {
            occupiedSpaces++;
            parkedCars.put(occupiedSpaces, car);
            System.out.println("Car with license plate " + car.getLicensePlate() + " parked successfully. Occupied spaces: " + occupiedSpaces);
            return true;
        } else {
            System.out.println("Parking lot is full!");
            return false;
        }
    }

    public boolean parkCarByAttendant(Car car) {
        if (occupiedSpaces < capacity) {
            occupiedSpaces++;
            System.out.println("Attendant parked car with license plate " + car.getLicensePlate() +
                    ". Occupied spaces: " + occupiedSpaces);
            return true;
        } else {
            System.out.println("Parking lot is full, attendant cannot park more cars!");
            return false;
        }
    }



    public void unparkCar(int spotNumber) {
        if (occupiedSpaces > 0 && parkedCars.containsKey(spotNumber)) {
            parkedCars.remove(spotNumber);
            occupiedSpaces--;
            System.out.println("Car from spot " + spotNumber + " unparked successfully. Occupied spaces: " + occupiedSpaces);
        } else {
            System.out.println("Parking spot is empty or car not found!");
        }
    }
    public int findCarSpot(Car car) {
        for (Map.Entry<Integer, Car> entry : parkedCars.entrySet()) {
            if (entry.getValue().equals(car)) {
                return entry.getKey();
            }
        }
        return -1; // Car not found
    }

    public int getAvailableSpaces() {
        return capacity - occupiedSpaces;
    }
}
