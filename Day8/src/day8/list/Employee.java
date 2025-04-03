package day8.list;

import java.util.*;

/*Question 3:
Write a menu-driven Java program to perform CRUD operations (Create, Read, Update, Delete) on a List of Employees.
The Employee class should contain the following fields:
 code(int): Employee’s code
 name (String): Employee's name
 department (String): Department where the employee works
 designation (String): Employee's job title
 basic (double): Employee's basic salary
*Also Override equals(), int hashCode(), and String toString() methods
Menu-Driven Operations:
1. Add an Employee to the list.
2. Display all Employees in the list.
3. Update an Employee (by name).
4. Delete an Employee (by name).
5. Sort Employees by name in ascending order.
6. Sort Employees by basic salary in descending order.
7. Exit the program.
Additional Notes:
 Ensure that the employee data is stored in an ArrayList<Employee>.
 Implement appropriate methods for adding, updating, deleting, and displaying employees.
 Provide options for sorting employees by name and basic salary.
 Continuously */
public class Employee {
	protected int code;
	protected String name;
	protected String department;
	protected String designation;
	protected double basic;
	public Employee(int code, String name, String department, String designation, double basic) {
		super();
		this.code = code;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.basic = basic;
	}
	public Employee() {
		super();
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", department=" + department + ", designation="
				+ designation + ", basic=" + basic + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(basic, code, department, designation, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(basic) == Double.doubleToLongBits(other.basic) && code == other.code
				&& Objects.equals(department, other.department) && Objects.equals(designation, other.designation)
				&& Objects.equals(name, other.name);
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println("Enter Code: ");
		code = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Department: ");
		department = sc.nextLine();
		System.out.println("Enter Designation: ");
		designation = sc.nextLine();
		System.out.println("Enter Basic Salary: ");
		basic = sc.nextDouble();
		sc.nextLine();
	}
	
	
}
