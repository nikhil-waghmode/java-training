package assignment3;
import java.util.Scanner;
//Write a program that accepts a number and print its reverse multiplication table.  
public class Ass8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		for(int i=10;i>=1;i--) {
			System.out.println(num*i);
		}
		sc.close();
	}
}
