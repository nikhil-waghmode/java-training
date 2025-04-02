package day5.commandlinearguments.assignment;
/*1. Basic Usage:
- Write a Java program that accepts command line arguments and prints them in reverse order.
- Create a program that accepts two numbers as command line arguments and prints their sum,
difference, product, and quotient. */
public class Q1 {
	public static void main(String[] args) {
		
		for(int i = args.length-1 ; i >= 0 ; i--) {
			 System.out.print(args[i] + " ");
		}
		
		
		if(args.length!=2) {
			System.out.println("Enter exactly two arguments.");
			System.exit(0);
		}
		System.out.println();
		System.out.println();
		System.out.println("Sum: " + (Integer.parseInt(args[0])+Integer.parseInt(args[1])));
		System.out.println("Difference: " + (Integer.parseInt(args[0])-Integer.parseInt(args[1])));
		System.out.println("Product: " + (Integer.parseInt(args[0])*Integer.parseInt(args[1])));
		System.out.println("Quotient: " + (Integer.parseInt(args[0])/Integer.parseInt(args[1])));
		
		
	}
}
