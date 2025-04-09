/**
 * 
 */
package day13.assessment;

import java.util.Scanner;

/**
 * Program to acceptData in Comma Separated Values (CSV)
 */
class Employee {
	protected int empId;
	protected String empName;
	protected double empBasic;
	protected boolean isPresent;

	public void acceptData() {
		System.out.println("Enter employee details in csv format:");
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(",");
		empId = Integer.parseInt(input[0].trim());
		empName = input[1].trim();
		empBasic = Double.parseDouble(input[2].trim());
		isPresent = Boolean.parseBoolean(input[3].trim());
	}

	public void showData() {
		System.out.println("Emp Id: " + empId + "\nEmp name: " + empName + "\nEmp basic: " + empBasic + "\nisPresent: "
				+ isPresent);
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee em = new Employee();
		em.acceptData();
		em.showData();
	}

}
