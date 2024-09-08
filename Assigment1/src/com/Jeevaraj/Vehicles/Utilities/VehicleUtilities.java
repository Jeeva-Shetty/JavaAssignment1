package com.Jeevaraj.Vehicles.Utilities;

import com.Jeevaraj.Vehicles.Types.Vehicle;
import java.time.Year;
public class VehicleUtilities {
	public static int getVehicleAge(Vehicle vehicle) {
        int currentYear = Year.now().getValue();
        return currentYear - vehicle.getYear();
    }
	public static boolean isOldModel(Vehicle vehicle) {
	        return getVehicleAge(vehicle) > 10;
	}
}
