package day3.oops;
/*
Create a class that counts the number of its object created. If the objects counter it less than 5, it should display
a message “Too Less”, when it is equal to 5 “Will do” should be displayed and if more than 5 objects are created
it should display “Exceeding the Limits”. Write suitable constructors and methods. Also write a method that
returns the number of objects created. 
*/
public class ObjCounter {
	protected static int counter;
	static {
		counter =0;
	}
	public ObjCounter(){
		counter++;
//		getMsg(); //OPTION 2
	}
	public static void getMsg() {
		if(counter <5) {
			System.out.println("Too Less");
		}
		else if(counter == 5) {
			System.out.println("Will do");
		}
		else {
			System.out.println("Exceeding the Limits");
		}
	}
	public static int getCounter() {
		return counter;
	}
	
	public static void main(String args[]) {
		ObjCounter a = new ObjCounter();
		ObjCounter b = new ObjCounter();
		ObjCounter c = new ObjCounter();
		ObjCounter d = new ObjCounter();
		ObjCounter e = new ObjCounter();
		ObjCounter f = new ObjCounter();
		System.out.println(getCounter());
		getMsg();
	}
}
