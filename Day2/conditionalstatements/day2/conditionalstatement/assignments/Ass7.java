package day2.conditionalstatement.assignments;
import java.util.Scanner;
public class Ass7 {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
	
		if(year%4==0 || (year%100==0 && year%400 ==0))
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");

		sc.close();
	}
}
