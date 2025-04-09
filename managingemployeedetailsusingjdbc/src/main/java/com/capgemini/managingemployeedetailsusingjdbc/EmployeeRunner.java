/**
 * 
 */
package com.capgemini.managingemployeedetailsusingjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 
 */
public class EmployeeRunner {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost/example1";
	public static final String USER = "root";
	public static final String PASSWORD = "6969";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao empDao = new EmployeeDao();
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			while (true) {
				System.out
						.println("\n1. Insert new employee details\n" + "2. Retrieve and display all employee details\n"
								+ "3. Update the salary of an existing employee based on empId\n"
								+ "4. Delete an employee record based on empId\n" + "5. Exit the program\n");

				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					empDao.createNewEmployee(conn, sc);
					break;
				case 2:
					empDao.displayAllEmployee(conn);
					break;
				case 3:
					empDao.updateEmployeeSalary(conn, sc);
					break;
				case 4:
					empDao.deleteEmployee(conn, sc);
					break;
				case 5:
					System.out.println("Program terminated");
					System.exit(0);
					sc.close();
				default:
					System.out.println("Invalid Option");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Exited System sucessfully....");

	}
}
