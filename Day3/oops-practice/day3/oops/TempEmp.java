package day3.oops;
import java.util.Scanner;
/*
 * Create a class called Employee that stores his code and name. Create two derive classes of Employee named
TempEmp (temporary employee) and PerEmp (permanent employee). TempEmp should store wage grade and
number of days worked whereas PerEmp should store department, designation and basic salary. Write
constructors, getter/setters and appropriate operations. */
public class TempEmp extends Employee {
	protected int wageGrade;
	protected int numOfDays;
	
	public TempEmp() {
		
	}
	
	public TempEmp(String code, String name, int wageGrade, int numOfDays) {
		super(code,name);
		this.wageGrade = wageGrade;
		this.numOfDays = numOfDays;
	}

	public int getWageGrade() {
		return wageGrade;
	}

	public void setWageGrade(int wageGrade) {
		this.wageGrade = wageGrade;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}
	public void showData() {
		super.showData(); //super is used to access method from parent class in child class.
		System.out.println("Wage Grade: " + this.wageGrade);
		System.out.println("numOfDays: " + this.numOfDays);
	}
	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Wage Grade: ");
		wageGrade = sc.nextInt();
		System.out.println("Enter Number of Days: ");
		numOfDays = sc.nextInt();
		
		sc.close();
	}
	public static void main(String args[]) {
		TempEmp tempEmp = new TempEmp("ll","nn",99, 80);
		tempEmp.acceptData();
		tempEmp.showData();
	}
}
