package day5.strings;
import java.util.Scanner;
public class StringMethods {
	/*Write a function that accepts a string and prints all the index of a.*/
	public void charOccurence(char c) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//easy approach
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i) == c) {
				System.out.println("Index: " + i);
			}
		}
		
		//efficient approach - reverse example.
//		int index = str.length();
//		while(index != -1) {
//			index = str.lastIndexOf(c, index);
//			if(index != -1) {
//				System.out.println("Index: " + index);
//				index--;
//			}
//		}
		
	}
	/*
	 write a function that acccepts a string. the string should have atleast 5 characters. String should not contain any 
	 special characters or digits.*/
	public void validateString() {
//		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
//		abc: //label  break
		while(true) {
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			if(str.length() <5) {
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
					System.out.println("VALID STRING.");
				}
			}
//			System.out.println("Valid string");
			break;
		}
		
	}
	public static void main(String[] args) {
		String str = new String("Welcome");
		
		int a = str.indexOf("e");
		int b = str.indexOf("e",a+1);
		int c = str.lastIndexOf("e");
		int d = str.lastIndexOf("e",5);
		
		
		StringMethods obj = new StringMethods();
//		obj.charOccurence('a');
		obj.validateString();
		
//		String s1 = new String("Hello World");
//		System.out.println(s1.toUpperCase()); //creates a new string since strings are immutable.
//		System.out.println(s1.toLowerCase()); //creates a new string since strings are immutable.
//		System.out.println(s1.equals(str));
//		System.out.println(s1.equalsIgnoreCase(s1.toLowerCase()));
//		System.out.println(s1.startsWith("W"));
//		System.out.println(s1.endsWith("D"));
//		System.out.println();
//		
//		
//		//MOSTLY USED
//		String s2 = " OH WOW! ";
//		System.out.println(s2.trim().length()); //trim() removes leading and trailing spaces
//		System.out.println(s2.length()); //12
//		System.out.println(s2.substring(0,4)); //starting is inclusive, ending is exclusive i.e 0, 1, 2, 3.
//		System.out.println(s2.substring(4)); //starting from 4 ending to the end of string.
//		
//		String s3[] = s2.split(" ");
		
		
		
		
		
	}
}
