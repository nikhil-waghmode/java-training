package day2.conditionalstatement.assignments;
import java.util.Scanner;
public class Ass3 {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		long n1,n2,n3;
		n1 = sc.nextLong();
		n2 = sc.nextLong();
		n3 = sc.nextLong();
		
//		if(n1>n2 && n1>n3) {
//			System.out.println(n1);
//		}
//		else if(n3>n2 && n3>n1) {
//			System.out.println(n3);
//		}
//		else
//			System.out.println(n2);
		System.out.println(n1>n2 && n1>n3 ? n1 : n2>n3 && n2>n1 ? n2 : n3);
		sc.close();
	}

}
