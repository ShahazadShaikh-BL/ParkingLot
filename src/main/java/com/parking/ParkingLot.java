package com.parking;
// Parking Lot Class
class ParkingLot {
    private int capacity;
    private int occupiedSpaces;
    private boolean isFull;
    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.occupiedSpaces = 0;
        this.isFull = false;
    }
    public boolean parkCar() {
        if (occupiedSpaces < capacity) {
            occupiedSpaces++;
            System.out.println("Car parked successfully. Occupied spaces: " + occupiedSpaces);

            if (occupiedSpaces == capacity && !isFull) {
                notifyOwnerParkingFull();
                isFull = true;
            }

            return true;
        } else {
            System.out.println("Parking lot is full!");
            return false;
        }
    }

    private void notifyOwnerParkingFull() {
        System.out.println("Parking lot is now full. Put out the full sign!");
    }

    public void unparkCar() {
        if (occupiedSpaces > 0) {
            occupiedSpaces--;
            System.out.println("Car unparked successfully. Occupied spaces: " + occupiedSpaces);

            if (occupiedSpaces < capacity && isFull) {
                notifyOwnerSpaceAvailable();
                isFull = false;
            }
        } else {
            System.out.println("Parking lot is already empty!");
        }
    }

    private void notifyOwnerSpaceAvailable() {
        System.out.println("Parking lot has space available again. Take in the full sign.");
    }


    public int getAvailableSpaces() {
        return capacity - occupiedSpaces;
    }
}
