package day2.conditionalstatement.assignments;
import java.util.Scanner;

//Check if char is upper lower number or special char
public class Ass8 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a char: ");
		
		char c = in.nextLine().charAt(0);
		
		if (c >= 'A' && c <='Z') {
			System.out.println("Upper Case");
		}
		else if (c >= 'a' && c <='z') {
			System.out.println("Lower Case");
		}
		else if (c>='0' && c<='9') {
			System.out.println("Digit");
		}
		else
			System.out.println("Special");
		in.close();
	}
}
