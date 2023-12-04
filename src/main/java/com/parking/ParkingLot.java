package com.parking;

class ParkingLot {
    private int capacity;
    private int occupiedSpaces;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.occupiedSpaces = 0;
    }

    public boolean parkCar() {
        if (occupiedSpaces < capacity) {
            occupiedSpaces++;
            System.out.println("Car parked successfully. Occupied spaces: " + occupiedSpaces);
            return true;
        } else {
            System.out.println("Parking lot is full!");
            return false;
        }
    }

    public void unparkCar() {
        if (occupiedSpaces > 0) {
            occupiedSpaces--;
            System.out.println("Car unparked successfully. Occupied spaces: " + occupiedSpaces);
        } else {
            System.out.println("Parking lot is already empty!");
        }
    }

    public int getAvailableSpaces() {
        return capacity - occupiedSpaces;
    }
}
