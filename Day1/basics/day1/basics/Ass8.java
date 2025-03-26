package day1.basics;
import java.util.Scanner;

//Simple and Compound Interest:
//Write a program that accepts principle, rate and time and display simple and compound interest. Use the formula:
//`Simple Interest = Principal x Rate x Time / 100`, `Compound Interest = Principal (1 + Rate)^Time - Principal` 

public class Ass8 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int p, r;
		float t;
		
		double simpleInt = 0, compundInt = 0;
		
		p = in.nextInt();
		r = in.nextInt();
		t = in.nextFloat();
		
		simpleInt = (p*r*t)/100;
		
		compundInt = (p * Math.pow((1+r),t))-1;
		
		System.out.println("Simple Interest: " + simpleInt + "\nCompund Interest: " + compundInt);
		in.close();
	}
}
