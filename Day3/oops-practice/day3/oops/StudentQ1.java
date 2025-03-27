package day3.oops;
import java.util.Scanner;
/*
Create a class called Student that stores student name, class, section and marks in 4 subjects. Write
constructors, getter/setters, behaviour, and operations to accept and display the data. Also provide operations
that return total and percentage. Test the class by creating an implementation function (main). 
*/
public class StudentQ1 {
	protected String name;
	protected String studentClass;
	protected char section;
	protected int m1,m2,m3,m4;
	
	public StudentQ1(String studentClass) {
		this.studentClass = studentClass;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getM4() {
		return m4;
	}
	public void setM4(int m4) {
		this.m4 = m4;
	}
	
	public int totalMarks() {
		return m1+m2+m3+m4;
	}
	public double getPercentage() {
		return (this.totalMarks()*100/400f);
	}
	public void acceptData() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Name:");
		this.name = sc.nextLine();
		System.out.println("Enter Class:");
		this.studentClass = sc.nextLine();
		System.out.println("Enter Section:");
		this.section= sc.nextLine().charAt(0);
		System.out.println("Enter m1:");
		this.m1=sc.nextInt();
		System.out.println("Enter m2:");
		this.m2=sc.nextInt();
		System.out.println("Enter m3:");
		this.m3=sc.nextInt();
		System.out.println("Enter m4:");
		this.m4=sc.nextInt();
		sc.close();
	}
	
	public static void main(String a[]) {
		StudentQ1 s1 = new StudentQ1("A");
		
		s1.acceptData();
		System.out.println("Total Marks: " + s1.totalMarks());
		System.out.println("Percentage: " + s1.getPercentage());
//		s1.setM1(100); //used when we need to update the marks
//		s1.setM2(100);
//		s1.setM3(100);
//		s1.setM4(100);
	}
}
