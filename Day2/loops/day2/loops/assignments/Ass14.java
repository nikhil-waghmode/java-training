package day2.loops.assignments;
import java.util.Scanner;
/*Write a program that accepts a n number (till the user wants) of integers, and then prints the sum of the
even and odd integers. 
 * */
public class Ass14 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char inp = sc.next().charAt(0);
		int evencnt=0, oddcnt=0;
//		System.out.println(inp);
		while(inp=='y') {
			int num = sc.nextInt();
			if(num%2==0) {
				evencnt++;
			}
			else
				oddcnt++;
			inp = sc.next().charAt(0);
		}
		System.out.println("Even count is " + evencnt + "\nOdd count is " + oddcnt);
		
		
		sc.close();
	}
}
