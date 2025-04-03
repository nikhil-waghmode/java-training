package day8.list;

import java.util.*;

/*
 * Question 5:
Write a menu-driven Java program to perform CRUD operations (Create, Read, Update, Delete) on a List of Students.
The Student class should contain the following fields:
 id (int): Student's ID
 name (String): Student's name
 course (String): Course the student is enrolled in
 marks (double): Student's total marks
Also Override equals(), int hashCode(), and String toString() methods
Menu-Driven Operations:
1. Add a Student to the list.
2. Display all Students in the list.
3. Update a Student's marks (by ID). 
4. Delete a Student (by ID).
5. Sort Students by name in ascending order.
6. Sort Students by course and name in ascending order.
7. Calculate the average marks of all students.
8. Exit the program.
Additional Notes:
 Ensure that the student data is stored in an ArrayList<Student>.
 Implement methods for adding, updating, deleting, and displaying students.
 Implement a calculation operation to calculate the average marks of all students.
 Continuously prompt the user until they select the exit option. */
public class Q5 {
	public static void main(String[] args) {
		StudentList st = new StudentList();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("\n\n1. Add a Student to the list.\n"
					+ "2. Display all Students in the list.\n"
					+ "3. Update a Student's marks (by ID). \n"
					+ "4. Delete a Student (by ID).\n"
					+ "5. Sort Students by name in ascending order.\n"
					+ "6. Sort Students by course and name in ascending order.\n"
					+ "7. Calculate the average marks of all students.\n"
					+ "8. Exit the program.");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:
					st.addStudent();
					break;
				case 2:
					st.displayStudents();
					break;
				case 3:
					st.updateMarks();
					break;
				case 4:
					st.deleteStudent();
					break;
				case 5:
					st.sortStudentByName();
					break;
				case 6:
					st.sortStudentByCourseName();
					break;
				case 7:
					st.getAverageMarks();
					break;
				case 8:
					System.out.println("Thank you.");
					System.exit(0);
					sc.close();
				default:
					System.out.println("Invalid choice.");
			
			}
			
		}
	}
	
}
