package day8.list;

//import java.util.Iterator;
import java.util.Scanner;
//import java.util.jar.Attributes.Name;

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
public class Q3 {
	public static void main(String[] args) {
		EmployeeList em = new EmployeeList();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add an Employee to the list.\n"
					+ "2. Display all Employees in the list.\n"
					+ "3. Update an Employee (by name).\n"
					+ "4. Delete an Employee (by name).\n"
					+ "5. Sort Employees by name in ascending order.\n"
					+ "6. Sort Employees by basic salary in descending order.\n"
					+ "7. Exit the program.");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				em.addEmployee();
				break;
			case 2:
				em.displayAllEmployees();
				break;
			case 3:
				em.updateEmployee();
				break;
			case 4:
				System.out.println("Enter name of employee to be deleted:");
				em.deleteEmployee(sc.nextLine());
				break;
			case 5:
				em.sortEmployee();
				break;
			case 6:
				em.reverseSortEmployee();
				break;
			case 7:
				System.out.println("Thank you.");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice.");
			}
		}
	}
}
