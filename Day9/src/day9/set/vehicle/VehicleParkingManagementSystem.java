package day9.set.vehicle;

/**
 * Set 2: Vehicle Parking Management System
You are developing a Vehicle Parking Management System for a parking lot that tracks the unique license plate
numbers of parked vehicles. The system should use a HashSet to store license plate numbers, ensuring no duplicate
entries. Implement a menu-driven program to perform the following operations.
Menu Options:
1. Park a Vehicle (Add License Plate)
 The user enters a license plate number to park a vehicle.
 If the vehicle is already parked (duplicate entry), it should not be added.
 The system should display:
Vehicle with license plate [LICENSE_PLATE] parked successfully.
 If it's a duplicate:
Vehicle with license plate [LICENSE_PLATE] is already parked.
2. Check if a Vehicle is Parked
 The user enters a license plate number to check if the vehicle is in the parking lot.
 Expected output:
o If the vehicle is parked:
The vehicle with license plate [LICENSE_PLATE] is parked in the lot.
o If the vehicle is not found:
The vehicle with license plate [LICENSE_PLATE] is not in the lot.
3. Remove a Vehicle (Unpark)
 The user enters a license plate number to remove the vehicle from the parking lot.
 Expected output: 
o If the vehicle is found and removed:
The vehicle with license plate [LICENSE_PLATE] has left the parking lot.
o If the vehicle is not found:
The vehicle with license plate [LICENSE_PLATE] was not found in the parking lot.
4. Display All Parked Vehicles
 The program should display all parked vehicles stored in the HashSet.
 Expected output:
Currently parked vehicles:
License Plate: [LICENSE_PLATE_1]
License Plate: [LICENSE_PLATE_2]
...
 If the HashSet is empty, display:
No vehicles are parked in the lot.
5. Count Vehicles with Odd-Ending License Plates
 The program counts how many parked vehicle license plates end with an odd digit.
 Expected output:
Number of vehicles with odd-ending license plates: [COUNT]
6. Exit the Program
 The program should terminate when the user selects this option.
 Expected output:
Exiting the Vehicle Parking Management System. Goodbye! */
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class VehicleParkingManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Collection<String> plateNos = new HashSet<>();
		String plateNo = new String();
		while (true) {
			System.out.println("1. Park a Vehicle (Add License Plate)\n" + "2. Check if a Vehicle is Parked\n"
					+ "3. Remove a Vehicle (Unpark)\n" + "4. Display All Parked Vehicles\n"
					+ "5. Count Vehicles with Odd-Ending License Plates\n" + "6. Exit the Program");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Add License Plate: ");
				plateNo = sc.nextLine();
				if (plateNos.add(plateNo.toUpperCase())) {
					System.out.println("Vehicle with license plate [" + plateNo + "] parked successfully.");
					break;
				}
				System.out.println("Vehicle with license plate [" + plateNo + "] is already parked.");
				break;
			case 2:
				System.out.println("Enter License Plate to check if parked: ");
				plateNo = sc.nextLine();
				if (plateNos.contains(plateNo.toUpperCase())) {
					System.out.println("The vehicle with license plate [" + plateNo + "] is parked in the lot.");
					break;
				}
				System.out.println("The vehicle with license plate [" + plateNo + "] is not in the lot.");
				break;
			case 3:
				System.out.println("Enter License Plate to remove a vehicle: ");
				plateNo = sc.nextLine();
				if (plateNos.contains(plateNo.toUpperCase())) {
					plateNos.remove(plateNo.toUpperCase());
					System.out.println("The vehicle with license plate [" + plateNo + "] has left the parking lot.");
					break;
				}
				System.out
						.println("The vehicle with license plate [" + plateNo + "] was not found in the parking lot.");
				break;
			case 4:
				if (plateNos.isEmpty()) {
					System.out.println("No vehicles are parked in the lot.");
					break;
				}
				plateNos.forEach((E) -> System.out.println("License Plate: [" + E + "]"));
				break;
			case 5:
				int count = 0;
				for (String str : plateNos) {
					if (str.endsWith("1") || str.endsWith("3") || str.endsWith("5") || str.endsWith("7")
							|| str.endsWith("9")) {
						count++;
					}
				}

				System.out.println("Number of vehicles with odd-ending license plates: [" + count + "] ");
				break;
			case 6:
				System.out.println("Exiting the Vehicle Parking Management System. Goodbye!");
				System.exit(0);
				sc.close();
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
