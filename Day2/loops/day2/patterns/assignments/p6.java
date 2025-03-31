package day2.patterns.assignments;
import java.util.Scanner;
/*
0
10
010
1010
01010
 */
public class p6 {
	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print((i-j)%2);
			}
			
			System.out.println();
		}
		sc.close();
	}
}
