package day1.basics;

import java.util.Scanner;

//Personal Details:
//Write a program that accepts your name, address and mobile number and display it on screen. 
public class Ass4 {
	public static void main(String arg[]) {
		Scanner obj = new Scanner(System.in);
		String name, address, mobile;
		
		name = obj.nextLine();
		address= obj.nextLine();
		mobile = obj.nextLine();
		System.out.println("Name: " + name + "\nAddress: " + address + "\nContact: " + mobile);
		
		obj.close();
	}
}
