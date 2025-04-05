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
import java.util.Scanner;

public class VehicleRegistrationManagementSystem {
	public static void main(String[] args) {
		VehicleMap vehicleMap = new VehicleMap();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Register New Vehicles\n"+
							"2. Check Vehicle Ownership\n"+
						"3. Remove a Vehicle from Records\n"+
							"4. Update Owner of a Vehicle\n"+
						"5. Display All Vehicles (Sorted Order)\n"+
							"6.Find Vehicle by Owner\n"+
						"7. Exit the Program");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1: 
				vehicleMap.addVehicle();
				break;
			case 2:
				vehicleMap.checkVehicleOwner();
				break;
			case 3:
				vehicleMap.removeVehicle();
				break;
			case 4:
				vehicleMap.updateOwner();
				break;
			case 5:
				vehicleMap.displayVehicles();
				break;
			case 6:
				vehicleMap.getOwnerVehicles();
				break;
			case 7:
				System.out.println("Exiting the Library Book Management System. Goodbye!");
				System.exit(0);
				sc.close();
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		
	}
}
