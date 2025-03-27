package assignment3;

import java.util.Scanner;
/*
 Write a program that accepts a positive integer. It should then print a message indicating whether the
number is a prime number or not. */
public class Ass15 {
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i =2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				System.out.println("Not Prime");
				return;
			}

		}
		System.out.println("Prime");
		
	}
}
