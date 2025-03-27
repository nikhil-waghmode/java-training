package day2.conditionalstatements;

import java.util.Scanner;

public class Ass1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int inp = sc.nextInt();
		if(inp%2 ==0) {
			System.out.println("Even number.");
		}
		else {
			System.out.println("Odd number.");
		}
		sc.close();
	}
}
