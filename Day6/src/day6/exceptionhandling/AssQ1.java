package day6.exceptionhandling;
//Write a program that accepts a number as command line argument and display its table. Handle all possible
//exceptions. If the number is greater than 25 it should generate a custom exception. 
public class AssQ1 {
	public static void main(String args[]) {
		
		int n=0;
		
		try {
			n = Integer.parseInt(args[0]);
			if(n >25) {
				BigException be = new BigException("Number is greateer than 25.");
				throw be;
			}
			System.out.println("Table for " + n+ ":");
			for(int i =1; i<=10;i++) {
				System.out.println(n + " x " + i + " = " + n*i);
			}
		}
		catch(BigException b) {
			System.out.println(b.getMessage());
		}
	}
}
