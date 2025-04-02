package day5.arrays.assignment;

import java.util.Scanner;

/*
 1. Basic Array Operations:
- Write a Java program to create an array of integers, input 5 values, and print the sum of the array
elements.
- Write a program to reverse the elements of a single-dimension array. 
*/
public class Q1 {
	
	public static void main(String[] args) {
		int arr[];
		arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length;i++) {
			System.out.print("Enter element " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}
		int sum= 0;
		for(int x: arr) {
			sum += x;
		}
		System.out.println("Array: ");
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println("\nSum of array elements is " + sum );

		for(int i =0,j = arr.length-1;i<j;i++,j--) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	
		System.out.println("Reversed Array: ");
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}
}
