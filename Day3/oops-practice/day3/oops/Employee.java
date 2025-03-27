package day3.oops;

import java.util.Scanner;

/*
 * Create a class called Employee that stores his code and name. Create two derive classes of Employee named
TempEmp (temporary employee) and PerEmp (permanent employee). TempEmp should store wage grade and
number of days worked whereas PerEmp should store department, designation and basic salary. Write
constructors, getter/setters and appropriate operations. */
public class Employee {
	protected String code;
	protected String name;
	
	public Employee() {
		this.code = "0000";
	}
	
	public Employee(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code: ");
		code = sc.nextLine();
		System.out.println("Enter name: ");
		name = sc.nextLine();
	}
	public void showData() {
		System.out.println("Code: " + code);
		System.out.println("Name: " + name);
	}
	public static void main(String args[]) {
		Employee e1 = new Employee();
		e1.acceptData();
		e1.showData();
	}
}
