package com.parking;
// Parking Lot Class
class ParkingLot {
    private int capacity;
    private int occupiedSpaces;
    private boolean securityNotified;
    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.occupiedSpaces = 0;
        this.securityNotified = false;
    }
    public boolean parkCar() {
        if (occupiedSpaces < capacity) {
            occupiedSpaces++;
            System.out.println("Car parked successfully. Occupied spaces: " + occupiedSpaces);

            if (occupiedSpaces == capacity && !securityNotified) {
                notifySecurity();
            }

            return true;
        } else {
            System.out.println("Parking lot is full!");
            return false;
        }
    }

    private void notifySecurity() {
        System.out.println("Parking lot is now full. Notify security for redirection of staff.");
        securityNotified = true;
    }

    public void unparkCar() {
        if (occupiedSpaces > 0) {
            occupiedSpaces--;
            System.out.println("Car unparked successfully. Occupied spaces: " + occupiedSpaces);

            if (occupiedSpaces < capacity && securityNotified) {
                resetSecurityNotification();
            }
        } else {
            System.out.println("Parking lot is already empty!");
        }
    }

    private void resetSecurityNotification() {
        System.out.println("Parking lot is no longer full. Reset security notification.");
        securityNotified = false;
    }


    public int getAvailableSpaces() {
        return capacity - occupiedSpaces;
    }
}
