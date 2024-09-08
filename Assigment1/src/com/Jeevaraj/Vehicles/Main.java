package com.Jeevaraj.Vehicles;

import com.Jeevaraj.Vehicles.Types.Car;
import com.Jeevaraj.Vehicles.Types.Truck;
import com.Jeevaraj.Vehicles.Utilities.VehicleUtilities;
import java.util.Scanner;

public class Main {
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the car details ");
		System.out.println("MAKE :");
		String CMake = in.next();
		System.out.println("Model :");
		String CModel = in.next();
		System.out.println("Year :");
		int CYear = in.nextInt();
		System.out.println("Seating Capacity :");
		int Csc = in.nextInt();
		System.out.println("Fuel Type :");
		String CFuel = in.next();
		
		System.out.println("Enter the Truck details ");
		System.out.println("MAKE :");
		String TMake = in.next();
		System.out.println("Model :");
		String TModel = in.next();
		System.out.println("Year :");
		int TYear = in.nextInt();
		System.out.println("Cargo Capacity :");
		double Tcc = in.nextDouble();
		System.out.println("Number of Axles :");
		int TAxles = in.nextInt();
		
		Car car = new Car(CMake,CModel,CYear,Csc,CFuel);
        Truck truck = new Truck(TMake,TModel,TYear,Tcc,TAxles);

        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\nTruck Details:");
        truck.displayDetails();

        System.out.println("\nCar Age: " + VehicleUtilities.getVehicleAge(car) + " years");
        System.out.println("Is Car Old? " + VehicleUtilities.isOldModel(car));

        System.out.println("\nTruck Age: " + VehicleUtilities.getVehicleAge(truck) + " years");
        System.out.println("Is Truck Old? " + VehicleUtilities.isOldModel(truck));
	}
}
