package day9.map.vehicleregistrationmanagementsystem;
/**
 * Map 5: Vehicle Registration Management System
You are developing a Vehicle Registration Management System to store vehicle details. Each vehicle is uniquely
identified by its registration number and contains information like make, model, and owner name. The system
should use a TreeMap, where the key is the Registration Number (String) and the value is a custom class Vehicle
that holds vehicle details.
Custom Class:
class Vehicle {
 String make;
 String model;
 String owner;
}
Menu Options:
1. Register New Vehicles
 The user enters multiple registration numbers along with their make, model, and owner name.
 If a duplicate registration number is entered, it should not be added.
 Expected output:
Vehicles registered successfully.
2. Check Vehicle Ownership
 The user enters a registration number to check if the vehicle exists. 
 Expected output:
o If found:
The vehicle with registration number [RegNo] belongs to [Owner].
o If not found:
No vehicle found with registration number [RegNo].
3. Remove a Vehicle from Records
 The user enters a registration number to remove the vehicle from the system.
 Expected output:
The vehicle with registration number [RegNo] was removed from the system.
4. Update Owner of a Vehicle
 The user enters a registration number and a new owner name.
 Expected output:
Ownership of vehicle [RegNo] updated to [New Owner].
5. Display All Vehicles (Sorted Order)
 The program should display all registered vehicles in sorted order based on registration number.
 Expected output:
Registered Vehicles:
Reg No: [RegNo1], Make: [Make1], Model: [Model1], Owner: [Owner1]
Reg No: [RegNo2], Make: [Make2], Model: [Model2], Owner: [Owner2]
6. Find Vehicle by Owner
 The user enters an owner name to find all vehicles owned by that person.
 Expected output:
Vehicles owned by [Owner]:
Reg No: [RegNo1], Make: [Make1], Model: [Model1]
 If no vehicles are found, display:
No vehicles found for owner [Owner].
7. Exit
Exiting the Vehicle Registration Management System. Goodbye! */

import java.util.*;

public class VehicleMap {
	TreeMap<String, Vehicle> vehicleMap;

	public VehicleMap() {
		vehicleMap = new TreeMap<>();
	}

	Scanner sc = new Scanner(System.in);
	String regNo = new String();

	public void addVehicle() {
		System.out.println("Enter Vehicle Registration No: ");
		regNo = sc.nextLine();
		if (vehicleMap.containsKey(regNo)) {
			System.out.println("Duplicate registration number is entered");
			return;
		}
		Vehicle vehicle = new Vehicle();
		vehicle.acceptData();
		vehicleMap.put(regNo, vehicle);
		System.out.println("Vehicles registered successfully. ");
	}

	public void checkVehicleOwner() {
		System.out.println("Enter Vehicle Registration No to check owner: ");
		regNo = sc.nextLine();
		if (vehicleMap.containsKey(regNo)) {
			System.out.println("The vehicle with registration number [" + regNo + "] belongs to ["
					+ vehicleMap.get(regNo).getOwner() + "]. ");
			return;
		}
		System.out.println("No vehicle found with registration number [" + regNo + "]. ");
	}

	public void removeVehicle() {
		System.out.println("Enter Vehicle Registration No to remove: ");
		regNo = sc.nextLine();
		if (vehicleMap.containsKey(regNo)) {
			vehicleMap.remove(regNo);
			System.out.println("The vehicle with registration number [" + regNo + "] was removed from the system.");
			return;
		}
		System.out.println("No vehicle found with registration number [" + regNo + "]. ");
	}

	public void updateOwner() {
		System.out.println("Enter Vehicle Registration No to updateOwner: ");
		regNo = sc.nextLine();
		if (vehicleMap.containsKey(regNo)) {
			System.out.println("Enter new Vehicle Owner: ");
			String newOwner = sc.nextLine();
			vehicleMap.get(regNo).setOwner(newOwner);
			System.out.println(
					"Ownership of vehicle [" + regNo + "] updated to [" + vehicleMap.get(regNo).getOwner() + "].");
			return;
		}
		System.out.println("No vehicle found with registration number [" + regNo + "]. ");
	}

	public void displayVehicles() {
		if (vehicleMap.isEmpty()) {
			System.out.println("No Vehicles Registered to display.");
			return;
		}
		vehicleMap.forEach((K, V) -> System.out.println("Reg No: [" + K + "], Make: [" + V.getMake() + "], Model: ["
				+ V.getModel() + "], Owner: [" + V.getOwner() + "] "));
	}

	public void getOwnerVehicles() {
		System.out.println("Enter Vehicle Owner: ");
		String owner = sc.nextLine();
		boolean ownerFound = false;
		System.out.println("Vehicles owned by [" + owner + "]: ");
		for (Map.Entry<String, Vehicle> entry : vehicleMap.entrySet()) {
			if (entry.getValue().getOwner().equals(owner)) {
				ownerFound = true;
				System.out.println("Reg No: [" + entry.getKey() + "], Make: [" + entry.getValue().getMake()
						+ "], Model: [" + entry.getValue().getModel() + "] ");
			}
		}
		if(!ownerFound) {
			System.out.println("No vehicles found for owner ["+owner+"].");
		}

	}
}
