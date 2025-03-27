package day2.conditionalstatements;
import java.util.Scanner;
public class Ass5 {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		double a1, a2, a3;
		a1 = sc.nextDouble();
		a2 = sc.nextDouble();
		a3 = sc.nextDouble();

		if(a1+a2+a3==180.00)
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
		sc.close();
	}
}
