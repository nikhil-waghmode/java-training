package day2.loops.assignments;
import java.util.Scanner;

/*Write a program that accepts a number and print the number in reverse order. For example, if the
number is 7322 then the reverse number is 2237
*/
public class Ass12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();

		int reminder=0;
		
		while(num>0) {
			reminder=num%10;
			num=num/10;
			System.out.print(reminder);
		}
		sc.close();
		
	}
}
