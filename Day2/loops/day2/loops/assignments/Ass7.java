package day2.loops.assignments;
import java.util.Scanner;
//Write a program that accepts a number and print its multiplication table. 
public class Ass7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num*i);
		}
		sc.close();
	}
}
