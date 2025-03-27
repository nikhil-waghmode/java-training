package day3.oops;

import java.util.Scanner;
/*
 * Create a class called Employee that stores his code and name. Create two derive classes of Employee named
TempEmp (temporary employee) and PerEmp (permanent employee). TempEmp should store wage grade and
number of days worked whereas PerEmp should store department, designation and basic salary. Write
constructors, getter/setters and appropriate operations. */
public class PerEmp extends Employee{
	protected String dept;
	protected String design;
	protected double salary;
	
	public PerEmp() {
		
	}
	public PerEmp(String code, String name, String dept, String design, double salary) {
		super(code,name);
		this.dept = dept;
		this.design = design;
		this.salary = salary;
	}
	
	public String getDept() {
		return dept;
	}
	public String getDesign() {
		return design;
	}
	public double getSalary() {
		return salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void showData() {
		super.showData(); //super is used to access method from parent class in child class.
		System.out.println("Department: " + this.dept);
		System.out.println("Designation: " + this.design);
		System.out.println("Salary: " + this.salary);
	}
	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department: ");
		dept = sc.nextLine();
		System.out.println("Enter Designation: ");
		design = sc.nextLine();
		System.out.println("Enter Salary: ");
		salary = sc.nextInt();
		sc.close();
	}
	public static void main(String args[]) {
		PerEmp perEmp = new PerEmp("ll","nn","COMP", "HOD",1000);
		perEmp.acceptData();
		perEmp.showData();
	}
	
}
