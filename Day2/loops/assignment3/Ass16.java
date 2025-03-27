package assignment3;
/*
 Write a program to calculate HCF(Also known as GCD) of two given number. */

import java.util.Scanner;

public class Ass16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();
		sc.close();
		while(!((a%b)==0)) {
			int c = a%b;
			a=b;
			b=c;
		}
		System.out.println(b);
	}
	
}
