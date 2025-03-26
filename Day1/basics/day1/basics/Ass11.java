package day1.basics;
import java.util.Scanner;
//User Input as Double:
//Write a program that asks the user to input a number in decimal format (double) and then prints the number.
public class Ass11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		System.out.println("Your Double is: " +  num);
		sc.close();
	}
}
