package day9.set.factory;

/*
 * Set 1: Factory Machine Management System
You are developing a Factory Machine Management System to manage unique machine IDs in a factory. The system
should use a HashSet to store machine IDs, ensuring uniqueness. Your task is to implement a menu-driven program
that allows users to perform various operations on the machine ID set.
Menu Options:
1. Add Machine IDs
 The user can input multiple unique machine IDs and store them in the HashSet.
 If a duplicate ID is entered, it should not be added.
 The system should display:
Machine IDs added successfully.
2. Check for a Machine ID
 The user enters a machine ID to check whether it exists in the HashSet.
 Expected output:
o SetIf the machine ID is found:
The machine ID [ID] is present in the HashSet.
o If the machine ID is not found:
The machine ID [ID] is not present in the HashSet.
3. Delete a Machine ID
 The user enters a machine ID for deletion.
 Expected output:
o If the machine ID exists and is removed:
The machine ID [ID] was removed from the HashSet.
o If the machine ID does not exist:
The machine ID [ID] was not found in the HashSet.
4. Display the Updated List of Machine IDs
 The program should display the remaining machine IDs stored in the HashSet.
 Expected output:
Updated list of machine IDs:
Machine ID: [ID1]
Machine ID: [ID2]
...
 If the HashSet is empty, display: 
No machine IDs available.
5. Count Odd Machine IDs
 The program counts how many stored machine IDs are odd numbers.
 Expected output:
Number of odd machine IDs: [count]
6. Exit the Program
 The program should terminate when the user selects this option.
 Expected output:
Exiting the Factory Machine Management System. Goodbye! */
import java.util.*;

public class FactoryMachineManagementSystem {

	public static void main(String[] args) {
		Collection<Integer> machineIds = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int id = 0;
		while (true) {
			System.out.println("1. Add Machine IDs\n" + "2.Check for a Machine ID\n" + "3. Delete a Machine ID\n" +
					"4.Display the Updated List of Machine IDs\n" + "5. Count Odd Machine IDs\n" + "6.Exit");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter new ID:");
				id = sc.nextInt();
				sc.nextLine();
				if (machineIds.add(id)) {
					System.out.println("Machine ID added successfully");
				} else {
					System.out.println("Machine ID already present.");
				}
				break;
			case 2:
				System.out.println("Enter ID to check:");
				id = sc.nextInt();
				sc.nextLine();
				if (machineIds.contains(id)) {
					System.out.println("The machine ID " + id + " is present in the HashSet.");
				} else {
					System.out.println("The machine ID " + id + " is not present in the HashSet.");
				}
				break;
			case 3:
				System.out.println("Enter ID to delete:");
				id = sc.nextInt();
				sc.nextLine();
				if (machineIds.contains(id)) {
					machineIds.remove(id);
					System.out.println("The machine ID " + id + " was removed from the HashSet.");
				} else {
					System.out.println("The machine ID " + id + " was not found in the HashSet.");
				}
				break;
			case 4:
				if (!machineIds.isEmpty()) {
					for (int x : machineIds) {
						System.out.println("Machine ID:" + " [" + x + "]");
					}
				} else {
					System.out.println("No Machine IDs available");
				}
			case 5:
				int count = 0;
				for (int x : machineIds) {
					if (x % 2 != 0) {
						count++;
					}
				}
				System.out.println("Number of odd machine IDs:" + " [" + count + "]");
				break;
			case 6:
				System.out.println("Exiting the Factory Machine Management System. Goodbye! ");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}

	}
}
