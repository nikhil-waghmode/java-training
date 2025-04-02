package day5.arrays;
import java.util.Scanner;
/*Write a program that accepts 10 names in an array and display all names that starts with “A”. */
public class ArraysQ5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[10];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Element: ");
			arr[i]=sc.nextLine();
		}
		for(String s: arr) {
			if(s.toUpperCase().startsWith("A")) {
				System.out.println(s);
			}
		}
		sc.close();
	}
}
