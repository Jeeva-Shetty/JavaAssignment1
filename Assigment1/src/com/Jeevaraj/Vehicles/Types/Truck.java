package com.Jeevaraj.Vehicles.Types;

public class Truck extends Vehicle {
	private double cargoCapacity;
    private int numberOfAxles;

    public Truck(String make, String model, int year, double cargoCapacity, int numberOfAxles) {
        super(make, model, year);
        this.cargoCapacity = cargoCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons, Number of Axles: " + numberOfAxles);
    }
}
