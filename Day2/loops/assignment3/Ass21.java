package assignment3;

import java.util.Scanner;

/*
 Write a menu driven program with the following options
a. Table
b. Reverse Multiplication Table
c. Factorial value.
d. Fibonacci series
e. Armstrong numbers
f. Exit*/
public class Ass21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one of the following:"
				+ "a. Table\n"
				+ "b. Reverse Multiplication Table\n"
				+ "c. Factorial value.\n"
				+ "d. Fibonacci series\n"
				+ "e. Armstrong numbers\n"
				+ "f. Exit");
		char ch = sc.next().charAt(0);

		switch(ch) {
			case 'a':
			case 'A':
				Ass7.main(null);
				break;
			case 'b':
			case 'B':
				Ass8.main(null);
				break;
			case 'c':
			case 'C':
				Ass9.main(null);
				break;
			case 'd':
			case 'D':
				Ass19.main(null);
				break;
			case 'e':
			case 'E':
				Ass18.main(null);
				break;
			case 'f':
			case 'F':
				System.out.println("Thank you.");
				break;	
			default:
				System.out.println("Wrong option.");
		}	
		
		sc.close();
		
	}
}
