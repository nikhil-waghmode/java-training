package day2.conditionalstatements;
import java.util.Scanner;
public class Ass4 {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		if(num>0)
			System.out.println("positive");
		else if(num<0)
			System.out.println("negative");
		else
			System.out.println("Zero");
		sc.close();
	}
}
