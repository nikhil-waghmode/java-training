package day2.patterns.assignments;
import java.util.Scanner;
/*
    1
   101
  10101
 1010101
10101010
 */
public class p10 {
	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(j=i;j>=1;j--) {
				System.out.print((i-j+1)%2);
			}
			for(j=i-1;j>=1;j--) {
				if(i==n && j==n-i+1) {
					continue;
				}
				else {
					System.out.print((n-j+1)%2);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
