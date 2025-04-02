package day5.strings;
/*
 Write a program that accepts a String from user and perform the following checks:
a. The string should have atleast 3 characters.
b. The string should not have any special characters or digits except alphabets.
If any condition is not satisfied appropriate error message should be displayed. 
*/
import java.util.Scanner;
public class StringsQ2 {
	Scanner sc = new Scanner(System.in);

	public void validateString(int minLength) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			if(str.length() <minLength) {
				System.out.println("Invalid length of string.");
				continue;
			}
			for(int i = 0;i<str.length();i++) {
				char c = str.charAt(i);
				if(!(c >= 'a' && c <= 'z' || c>='A' && c<='Z' )) {
					System.out.println("Invalid character: " + str.charAt(i));
					break;
				}
				else if(i == str.length()-1) {
					System.out.println("Valid String.");
				}
			}
			break;
		}
		sc.close();
		
	}
	public static void main(String[] args) {
		StringsQ2 obj = new StringsQ2();
		obj.validateString(3);
	}
}
