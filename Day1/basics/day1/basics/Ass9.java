package day1.basics;
import java.util.Scanner;

//Centigrade and Fahrenheit
//Write a program that accepts temperature in Centigrade and display it in Fahrenheit. Use the formula: `F=C*9/5+32`

public class Ass9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double c = sc.nextDouble();
		
		double f =0;
		
		f= ((c*9)/5)+32;
		
		System.out.println("F: " + f);
		sc.close();
	}
}
