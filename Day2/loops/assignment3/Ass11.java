package assignment3;
import java.util.Scanner;
/*. Write a program that accepts a number and print the number of digits present in this number. For
example, if the number is 7322 then the number of digits are 4. 
*/
public class Ass11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		int counter =0;
		while(num>0) {
			counter++;
			num=num/10;
		}
		System.out.println(counter);
		sc.close();
	}
}
