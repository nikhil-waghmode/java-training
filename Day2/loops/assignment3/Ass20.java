package assignment3;

import java.util.Scanner;

/*
 Write a program to calculate the sum of following series where n is input by user.
 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
*/
public class Ass20 {
	public static void main(String[] args) {
		System.out.println("Enter value of n: ");
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		double sum =0;
		for(int i =1; i<=n;i++) {
			sum = sum + (double)1/i;
		}
		System.out.println("Sum: " + sum);
		
		sc.close();
	}
}
