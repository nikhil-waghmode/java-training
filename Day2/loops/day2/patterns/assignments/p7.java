package day2.patterns.assignments;
import java.util.Scanner;
/*
    1
   10
  101
 1010
10101
 */
public class p7 {
	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(j%2);
			}
			System.out.println();
		}
		sc.close();
	}
}
