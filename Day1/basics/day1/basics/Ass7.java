package day1.basics;
import java.util.Scanner;

//Circle Area and Circumference:
//Take the radius of a circle as input from the user and print the area of the circle. Use the formula: `Area = π * r^2`,
//`Circumference = 2 * π * r`. 

public class Ass7 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		float radius, area =0, circum = 0;
		radius = obj.nextFloat();
		
		area = (float) (Math.PI * Math.pow(radius,2));
		//area = 3.14f * radius * radius;
		
		
		circum = (float) (2 * Math.PI * radius);
		
		System.out.println(area);
		System.out.println(circum);
		obj.close();
	}
}
