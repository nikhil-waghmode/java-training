package day2.patterns.assignments;
import java.util.Scanner;
/*
    1
   212
  32123
 4321234
543212345
 */
public class p9 {
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
				System.out.print(j);
			}
			for(j=i-1;j>=1;j--) {
				System.out.print(i-j+1);
			}
			System.out.println();
		}
		sc.close();
	}
}
