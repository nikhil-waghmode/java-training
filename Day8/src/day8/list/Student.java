package day8.list;

import java.util.Objects;
import java.util.Scanner;

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
public class Student {
	protected int id;
	protected String name;
	protected String course;
	protected double marks;
	public Student() {
		super();
	}
	public Student(int id, String name, String course, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(course, id, marks, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && id == other.id
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter course: ");
		course = sc.nextLine();
		System.out.print("Enter marks: ");
		marks = sc.nextInt();
		sc.nextLine();
	}
	
	
}
