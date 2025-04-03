package day8.list;
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
import java.util.*;
public class StudentList {
	protected List<Student> students;
	StudentList(){
		students = new ArrayList<>();
	}
	Scanner sc = new Scanner(System.in);
	public void addStudent() {
		Student std = new Student();
		std.acceptData();
		students.add(std);
	}
	
	public void displayStudents() {
		for(Student x: students) {
			System.out.println(x + " ");
		}
	}
	
	public void updateMarks() {
		System.out.println("Enter ID to update marks: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter marks to update: ");
		int marks = sc.nextInt();
		sc.nextLine();
		for(int i =0;i<students.size();i++) {
			Student s = students.get(i);
			if(s.id==n) {
				s.marks = marks;
				System.out.println("Marks updated for student id "+ s.id );
			}
			System.out.println("Invalid student id");
		}
	}
	public void deleteStudent() {
		System.out.println("Enter ID of student to be deleted: ");
		int n = sc.nextInt();
		for(int i =0;i<students.size();i++) {
			Student s = students.get(i);
			if(s.id==n) {
				students.remove(i);
				System.out.println("Removed student "+ s.id);
			}
			System.out.println("Invalid student id");
		}
	}
	public void sortStudentByName() {
		students.sort(Comparator.comparing(Student::getName));
		for(Student sc: students) {
			System.out.print(sc + " ");
		}
	}
	public void sortStudentByCourseName() {
		students.sort(Comparator.comparing(Student::getCourse).thenComparing(Student::getName));
		for(Student sc: students) {
			System.out.print(sc + " ");
		}
	}
	public void getAverageMarks() {
		int sum = 0;
		for(int i =0;i<students.size();i++) {
			sum += students.get(i).getMarks();
		}
		System.out.println("Average: " + sum/students.size());
	}
}
