/**
 * 
 */
package com.capgemini.managingemployeedetailsusingjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Employee data access object.
 */
public class EmployeeDao {
	public void createNewEmployee(Connection conn, Scanner sc) throws SQLException {
		Employee emp = new Employee();
		emp.acceptData(sc);
		String SQL = "insert into employee(empName, salary) values(?,?)";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, emp.getEmpName());
		pstmt.setDouble(2, emp.getSalary());
		int result = pstmt.executeUpdate();
		if (result == 1) {
			System.out.println("employee Record created successfully");
		} else {
			System.out.println("Unable to create employee Record.");
		}
		pstmt.close();
	}

	public void displayAllEmployee(Connection conn) throws SQLException {
		String SQL = "select * from employee"; // static statement since no variable present.
		Statement stmt = conn.createStatement();
//		PreparedStatement pstmt = conn.prepareStatement(SQL);
// 		the above statement can be used if you dont want to use normal Statement
//		and the ResultSet will be as follows without argument
//		ResultSet rs = pstmt.executeQuery();
		ResultSet rs = stmt.executeQuery(SQL);
		while (rs.next()) {
			Employee emp = new Employee();
			emp.setEmpId(rs.getInt("empId"));
			emp.setEmpName(rs.getString("empName"));
			emp.setSalary(rs.getDouble("salary"));
			System.out.println(emp);
		}
		rs.close();
	}

	public void updateEmployeeSalary(Connection conn, Scanner sc) throws SQLException {
		System.out.println("Enter Employee Id:");
		int id = sc.nextInt();
		System.out.println("Enter updated Employee salary:");
		double salary = sc.nextDouble();
		String SQL = "update employee set salary = ? where empId =?";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setDouble(1, salary);
		pstmt.setInt(2, id);
		int result = pstmt.executeUpdate();
		if (result == 1)
			System.out.println("Employee Salary Updated Successfully");
		else
			System.out.println("Unable to update employee salary");
		pstmt.close();
	}

	public void deleteEmployee(Connection conn, Scanner sc) throws SQLException {
		System.out.println("Enter Employee Id:");
		int id = sc.nextInt();
		String SQL = "delete from employee where empId = ?";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setInt(1, id);
		int result = pstmt.executeUpdate();
		if (result == 1) {
			System.out.println("Employee Deleted Successfully");
		} else {
			System.out.println("Unable to Update Employee Salary");
		}
		pstmt.close();
	}

}
