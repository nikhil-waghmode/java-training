package day2.loops.assignments;
import java.util.Scanner;
//Write a program that accepts a number and print its factorial value. 
public class Ass9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact *=i;
		}
		System.out.println(fact);
		sc.close();
	}
}
