package day1.basics;
import java.util.Scanner;
//Currency Conversion:
//Ask the user to input an amount in dollars (double) and print the equivalent amount in euros. Assume the conversion
//rate is 0.85 euros per dollar. 
public class Ass12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double usd, euro =0.0;
	
		usd = sc.nextDouble();
	
		euro = usd*0.85;
	
		System.out.println("Euro equivalent is " + euro);
		sc.close();
	}
	
}
