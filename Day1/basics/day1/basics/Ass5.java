package day1.basics;
import java.util.Scanner;
//5. Sum of Two Numbers:
//Ask the user to input two integers and print the sum

public class Ass5 {
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int n1, n2;
		
		n1= in.nextInt();
		n2= in.nextInt();
		
		System.out.println("Sum=" + (n1 + n2));
		in.close();
	}
}