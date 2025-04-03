package day9.set.employee;


import java.util.*;
import java.util.Scanner;

/**
 * Set 3: Employee Attendance Tracking System
You are developing an Employee Attendance Tracking System for an office to manage unique employee ID numbers
of employees who check in daily. The system should use a HashSet to store employee IDs, ensuring no duplicates.
Implement a menu-driven program to perform the following operations.
Menu Options:
1. Mark Employee Attendance (Check-In)
 The user enters an employee ID number to mark attendance for the day.
 If the employee has already checked in, the system should not allow duplicate entries.
 Expected output:
Employee ID [ID] has checked in successfully. 
 If duplicate entry:
Employee ID [ID] has already checked in today.
2. Check If an Employee Checked In
 The user enters an employee ID to verify if they have checked in for the day.
 Expected output:
o If the employee is found:
Employee ID [ID] has checked in today.
o If the employee is not found:
Employee ID [ID] has not checked in today.
3. Remove Employee from Attendance (Check-Out)
 The user enters an employee ID to remove their attendance record (indicating they checked out).
 Expected output:
o If the employee is found and removed:
Employee ID [ID] has checked out.
o If the employee is not found:
Employee ID [ID] was not found in the attendance list.
4. Display All Employees Who Checked In
 The program should display all checked-in employees stored in the HashSet.
 Expected output:
Employees who checked in today:
Employee ID: [ID_1]
Employee ID: [ID_2]
...
 If the HashSet is empty, display:
No employees have checked in today.
5. Count Employees with Even Employee IDs
 The program counts how many checked-in employees have an even employee ID number.
 Expected output:
Number of employees with even ID numbers: [COUNT]
6. Exit the Program
 The program should terminate when the user selects this option.
 Expected output: 
Exiting the Employee Attendance Tracking System. Goodbye! 
 */
public class EmployeeAttendanceTrackingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Collection<Integer> empIds = new HashSet<>();
		int empId =0;
		while(true) {
			System.out.println("1. Mark Employee Attendance (Check-In)\n"+
							"2. Check If an Employee Checked In\n"+
							"3. Remove Employee from Attendance (Check-Out)\n" +
							"4. Display All Employees Who Checked In\n"+
							"5. Count Employees with Even Employee IDs\n"+
							"6. Exit the Program");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Mark Employee Attendance (Check-In):");
				empId = sc.nextInt();
				if(empIds.add(empId)) {
					System.out.println("Employee ID ["+empId+"] has checked in successfully.");
					break;
				}
				System.out.println("Employee ID ["+empId+"] has already checked today.");
				break;
			case 2:
				System.out.println("Enter Employee ID to check if Checked In:");
				empId = sc.nextInt();
				if(empIds.contains(empId)) {
					System.out.println("Employee ID ["+empId+"] has checked in today.");
					break;
				}
				System.out.println("Employee ID ["+empId+"] has not checked in today.");
				break;
			case 3:
				System.out.println("Enter Employee ID to remove attendance:");
				empId = sc.nextInt();
				if(empIds.contains(empId)) {
					empIds.remove(empId);
					System.out.println("Employee ID ["+empId+"] has checked out.");
					break;
				}
				System.out.println("Employee ID ["+empId+"] was not found in the attendance list.");
				break;
			case 4:
				empIds.forEach((E)->System.out.println("Employee ID: ["+ E+"]"));
				break;
			
			case 5:
				int count =0;
				for(int n: empIds) {
					if(n%2==0) {
						count++;
					}
				}
				System.out.println("Number of employees with even ID numbers: ["+ count+"] ");
				break;
			case 6:
				System.out.println("Exiting the Employee Attendance Tracking System. Goodbye!");
				System.exit(0);
				sc.close();
			default:
				System.out.println("Invalid Choice");
				
			}
		}
	}
}
