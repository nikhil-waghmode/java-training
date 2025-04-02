package day5.strings;
import java.util.Scanner;
/*
 Write a program that accepts a String from user and perform the following checks:
a. The string should have atleast 5 characters.
b. The string should not have any special characters or alphabets except digits.
If any condition is not satisfied appropriate error message should be displayed. 
*/
public class StringsQ3 {
	
	//accept digits only
	public void validateString(int minLength) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		if(str.length()<minLength) {
			System.out.println("Invalid string length.");
			sc.close();
			return;
		}
		
		for(int i =0; i<str.length();i++) {
			if(!(str.charAt(i) >='0' && str.charAt(i) <= '9')) {
				System.out.println("String is invalid due to " + str.charAt(i));
			}
			else if(i == str.length()-1) {
				System.out.println("String is valid.");
			}
		}
		sc.close();
		
	}
	
	public static void main(String[] args) {
		StringsQ3 obj = new StringsQ3();
		obj.validateString(5);
	}
}
