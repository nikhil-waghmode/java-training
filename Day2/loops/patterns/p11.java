package patterns;
import java.util.Scanner;
/*
543212345
5432 2345
543   345
54     45
5       5
 */
public class p11 {
	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print(j);
			}
			
			for(j=0;j<i-1;j++) {
				System.out.print(" ");
			}
			for(j=1;j<i-1;j++) {
				System.out.print(" ");
			}
			
			for(j=i;j<=n;j++) {
				if(i==j && j==1)
					continue;
				else
					System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
