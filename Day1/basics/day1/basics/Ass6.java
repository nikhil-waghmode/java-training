package day1.basics;

import java.util.Scanner;

//Product of Two Numbers:
//Write a program that asks the user to input two floating-point numbers and prints their product. 

public class Ass6 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		float n1, n2;
		
		n1= in.nextFloat();
		n2= in.nextFloat();
		
		System.out.println("Product =" + (n1 * n2));
		
		in.close();
	}
	
}
