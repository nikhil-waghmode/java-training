package day5.strings;

import java.util.Scanner;

/*
4. Write a program that accepts a String from user and perform the following checks:
a. The string should have atleast 6 characters. 
b. The string should not have any special characters except @.
If any condition is not satisfied appropriate error message should be displayed. */
public class StringsQ4 {
	//no special characters except @.
	public void validateString(int minLength) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		if(str.length()<minLength) {
			System.out.println("Invalid string length.");
		}
		
		for(int i = 0;i<str.length();i++) {
			char c = str.charAt(i);
			if(!(c >= 'a' && c <= 'z' || c>='A' && c<='Z' || c=='@')) {
				System.out.println("Invalid character: " + str.charAt(i));
			}
			else if(i == str.length()-1) {
				System.out.println("Valid String.");
			}
		}
		sc.close();
		
	}
	public static void main(String args[]) {
		
		StringsQ4 obj = new StringsQ4();
		obj.validateString(6);
	}

}
