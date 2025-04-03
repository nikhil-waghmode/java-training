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
public class EmployeeList {
	protected List<Employee> employees;  //declaration of array list
	
	public EmployeeList() {
		employees = new ArrayList<>(); //creation of array list for every object of employeelist.
	}
	
	public void addEmployee() {
		Employee em = new Employee(); //creates a object for Employee class.
		em.acceptData(); //accepts data members for Employee class.
		employees.add(em); //adds the new employee to the Employee List.
	}
	
	public void displayAllEmployees() {
		for(Employee ob: employees) {
			System.out.println(ob);
		}
	}
	
	public void updateEmployee() {
		Employee emp = new Employee();
		emp.acceptData();
		for(int i =0;i<employees.size();i++) {
			Employee e1 = employees.get(i);
			if(emp.name.equalsIgnoreCase(e1.name)) {
				e1.setName(emp.name);
				e1.setCode(emp.code);
				e1.setBasic(emp.basic);
				e1.setDepartment(emp.department);
				e1.setDesignation(emp.designation);
				return;
			}
		}
		System.out.println("No such employee");
	}
	
	public void deleteEmployee(String name) {
		for(int i =0;i<employees.size();i++) {
			Employee e1 = employees.get(i);
			if(name.equalsIgnoreCase(e1.name)) {
				employees.remove(i);
				System.out.println("Employee with name " +name+" removed.");
				return;
			}
		}
		System.out.println("No such employee");
	}
	public void sortEmployee() {
		employees.sort(Comparator.comparing(Employee::getName));
		employees.forEach(System.out::println);	
	}
	public void reverseSortEmployee() {
		employees.sort(Comparator.comparingDouble(Employee::getBasic).reversed());
		displayAllEmployees();
	}
	
}
