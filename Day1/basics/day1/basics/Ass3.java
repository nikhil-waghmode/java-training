package day1.basics;
import java.util.Scanner;

//Write a program that prompts the user to enter their full name and age. Print a greeting message including their name
//and age. 
public class Ass3 {
	public static void main(String arg[]) {
		Scanner obj = new Scanner(System.in);
		String name, address;
		name = obj.nextLine();
		address= obj.nextLine();
		
		System.out.println("Hello " + name + ". Please conform your delivery address: " + address);
		
		obj.close();
	}
}
