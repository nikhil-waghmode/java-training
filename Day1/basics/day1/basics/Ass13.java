package day1.basics;
import java.util.Scanner;
//Character Input:
//Write a program to take a character input from the user and display it with a message
public class Ass13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		System.out.println("Your character is: " + ch);
		sc.close();
	}
}
