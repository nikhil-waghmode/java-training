package day2.conditionalstatement.assignments;
import java.util.Scanner;
public class Ass6 {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		double price, quantity;
		price = sc.nextDouble();
		quantity = sc.nextDouble();
		double rev = price*quantity;
		double discount = 0.1*rev;
		double netrev =(rev-discount);
		if(rev>=5000.000)
			System.out.println("Revenue is " + rev);
		else
			System.out.println("Net revenue is " + netrev);
			System.out.println("Discount amount is " + discount);
		sc.close();
	}
}
