package day1.basics;
import java.util.Scanner;
/*. Concatenating Strings:
Ask the user to input two separate strings and print them concatenated into one sentence. */
public class Ass10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s1, s2;
		s1= sc.nextLine();
		s2= sc.nextLine();
		
		System.out.println("Result: " + s1 + " " +s2);
		sc.close();
	}
}
