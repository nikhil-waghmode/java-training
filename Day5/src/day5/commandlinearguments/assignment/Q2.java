package day5.commandlinearguments.assignment;
/*
 * Advanced Command Line Arguments:
- Create a program that accepts a list of integers via command line arguments and finds the average of
those numbers.
- Write a Java program that checks if the command line arguments contain a specific word. */
public class Q2 {
	public static void main(String[] args) {
		
		
		int sum =0;
		try {
			for(int i=0;i<args.length;i++) {
			sum+= Integer.parseInt(args[i]);
			}
			System.out.println("Average: " + sum/args.length);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
		
//		boolean containsWord = false;
//		for(String x: args) {
//			if(x.toLowerCase().contains("hello")) {
//				containsWord = true;	
//			}
//		}
//		if(containsWord) {
//			System.out.println("String contains the word 'hello'");
//		}
//		else {
//			System.out.println("String doesn't contain the word 'hello'");
//		}
		
	}
}
