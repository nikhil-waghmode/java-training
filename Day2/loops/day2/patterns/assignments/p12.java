package day2.patterns.assignments;
import java.util.Scanner;
/*
543212345
5432 2345
543   345
54     45
5       5
 */
public class p12 {
	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n+1-i;j++) {
				System.out.print(n+1-i);
			}
		
			for(j=0;j<i-1;j++) {
				System.out.print(" ");
			}
			for(j=1;j<i-1;j++) {
				System.out.print(" ");
			}
			for(j=n-i-1;j<=n+1-i;j++) {
				if(j>7) {
					break;
				}
//				else
//					System.out.print(n+1-i);
				System.out.print(j);
			}
			
			System.out.println();
		}
		sc.close();
	}
}
