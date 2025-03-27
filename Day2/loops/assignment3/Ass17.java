package assignment3;
import java.util.Scanner;
/*
 Write a program to enter the numbers till the user wants and at the end the program should display the
largest and smallest numbers entered. */
public class Ass17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'Y';
		int largest =Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		do {
			System.out.println("Enter a number: ");
			int input = sc.nextInt();
			if(input>largest) {
				largest = input;
			}
			if(input<smallest) {
				smallest=input;
			}
			System.out.println("Do you want to continue: ");
			ch = sc.next().charAt(0);
		} while(ch=='Y' || ch =='y');
		
		System.out.println("Largest No is " + largest + "\nSmallest No is " + smallest);
		sc.close();
	}
}
