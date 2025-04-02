package day5.arrays;
import java.util.Scanner;
/*Write a program that accepts 10 elements stores them in a array of size 10. and calculate sum and average. */
public class example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		float sum = 0f, avg =0f;
		for(int i = 0; i<num.length;i++) {
			System.out.println("Enter a number: ");
			num[i] = sc.nextInt();
			sum+=num[i];
		}
		avg=sum/num.length;
		
		
//		for(int x:num) {
//			
//		}
	}
}
