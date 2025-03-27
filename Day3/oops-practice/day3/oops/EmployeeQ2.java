package day3.oops;

import java.util.Scanner;

/*
 Create a class called Employee that stores its name, department, designation and basic salary. Write
constructors, getter/setters, behavior, and operations to accept and display the data. Also write methods that
return his incentive. The incentives are HRA (20%), DA (10%), CA (10%).Test the above code by creating an
implementation program. */
public class EmployeeQ2 {
	protected String name;
	protected String dept;
	protected String design;
	protected float salary;
	
	public EmployeeQ2() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void acceptData() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Name:");
		this.name = sc.nextLine();
		System.out.println("Enter Department:");
		this.dept = sc.nextLine();
		System.out.println("Enter Designation:");
		this.design = sc.nextLine();
		System.out.println("Enter Salary:");
		this.salary=sc.nextInt();
		sc.close();
	}
	public float getHRA() {
		return 0.2f*this.salary;
	}
	public float getDA() {
		return 0.1f*this.salary;
	}
	public float getCA() {
		return 0.1f*this.salary;
	}
	public double getGrossSalary() {
		return this.salary+getCA()+getHRA()+getDA();
	}
	public static void main(String args[]) {
		EmployeeQ2 e1= new EmployeeQ2();
		e1.acceptData();
		System.out.println("HRA: " + e1.getHRA());
		System.out.println("DA: " + e1.getDA());
		System.out.println("CA: " + e1.getCA());
		System.out.println("Gross Salary: " + e1.getGrossSalary());
		
	}

}
