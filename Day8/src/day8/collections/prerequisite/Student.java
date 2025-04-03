package day8.collections.prerequisite;

public class Student {
	
	int rollNo;
	String name;
	String grade;
	
	Student(){
		
	}
	Student(int rollNo, String name, String grade){
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}
	//GETTER SETTER
	
	public String toString() { //returns class name & hashcode if not overriden
		return "Student [" + rollNo +"," + name+"," + grade+"]";
	}
	
	public boolean equals(Object ob) {
		if(ob != null && ob instanceof Student) {
			Student o2 = (Student) ob;
			if(rollNo == o2.rollNo && name.equals(o2.name)&& grade.equals(o2.grade)) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {	
		return (rollNo);
	}
	
	public static void main(String[] args) {
		Student o1 = new Student(12,"Rahul","A");
//		Student o2 = new Student(12,"Rahul","A");
		Student o2 = new Student(12,"Suresh","C");
		System.out.println("Student obj1: "+ o1);
		System.out.println("Student obj2: "+ o2);
		
//		System.out.println(o1.hashCode() == (o2.hashCode()));
		if(o1.hashCode() == o2.hashCode()) {
			System.out.println(o1.equals(o2));
		}
		else {
			System.out.println(false);
		}
		
		
	}
	
}
