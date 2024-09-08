package com.Jeevaraj.Vehicles.Types;

public class Car extends Vehicle {
	private int seatingCapacity;
    private String fuelType;
    
    public Car(String make, String model, int year, int seatingCapacity, String fuelType) {
        super(make, model, year);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
    
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
    
}
