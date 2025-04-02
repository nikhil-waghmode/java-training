package day5.arrays;
import java.util.*;
/*Write a Java program that: (Sorting and Searching)
a. Takes an integer array as input from the user.
b. Sorts the array in ascending order using Arrays.sort().
c. Asks the user to enter a number to search for.
d. Uses Arrays.binarySearch() to find the index of the number and displays the result. */
public class ArraysQ14 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n = sc.nextInt();
		int arr[];
		arr = new int[n];
		
		for(int i =0; i<n;i++) {
			System.out.print("Enter element" + i + ": " );
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(arr));

		System.out.println("Enter a number to search: ");
		int key = sc.nextInt();
		
		
		System.out.println((Arrays.binarySearch(arr, key)<=0)?"Key not found":("Index of key is "+ Arrays.binarySearch(arr, key)));


	}
}
