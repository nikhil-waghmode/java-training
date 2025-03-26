package patterns;
import java.util.Scanner;
/*
54321
5432
543
54
5
 */
public class p3 {
	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
