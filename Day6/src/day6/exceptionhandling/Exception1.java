package day6.exceptionhandling;
//Write a program that accepts a number as command line argument and display its square. 
public class Exception1 {
	public static void main(String[] args) {
		int n =0;
		try {
			n =Integer.parseInt(args[0]);
			if(n >25) {
				BigException be = new BigException("Big Exception");
				n = 0; //resetting the number or else error and square both will occur. which should not be the case.
				throw be; //this throws custom exception object
			}
		}
		catch(NumberFormatException ne) {
			System.out.println("Invalid format!");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("enter a arguement");
		}
		
		catch(BigException b) {
			System.out.println(b.getMessage());
		}
//		catch(Exception e) { //when any other exception occurs.
////			System.out.println("some exception");
////			e.getMessage(); //in-build java message. end user friendly
//			e.printStackTrace(); //in-build java message for exception. developer friendly
//		}
		finally {
			System.out.println("Square value is " + (n*n));
		}
//		System.out.println("Square value is " + (n*n));
	}
}
