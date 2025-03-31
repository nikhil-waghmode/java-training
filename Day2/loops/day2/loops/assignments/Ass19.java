package day2.loops.assignments;

import java.util.Scanner;

/*
  Write a program to print Fibonacci series of n terms where n is input by user :
	0 1 1 2 3 5 8 13 24 ..... 
*/
public class Ass19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b + " ");
		for(int i =0; i<n-2;i++) {
			System.out.print(a+b + " ");
			int c = a+b;
			a = b;
			b = c;
		}
			
		sc.close();
	}
}
