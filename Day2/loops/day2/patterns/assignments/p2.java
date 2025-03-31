package day2.patterns.assignments;
import java.util.Scanner;
/*
 	1
   21
  321
 4321
54321 */

public class p2 {
	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt(), i, j;
		for (i =1;i<=n;i++) {
			for(j = 1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(j = i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
