package day2.patterns.assignments;
import java.util.Scanner;
/*
    1
   222
  33333
 4444444
55555555
 */
public class p8 {
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
				System.out.print(i);
			}
			for(j=2;j<=i;j++) {
				if(i==n && j==n) {
					continue;
				}
				else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
