package day5.arrays.assignment;

import java.util.Scanner;

/*
 Multi-Dimension Arrays:
- Create a 3x3 matrix in Java, initialize it with values, and find the sum of the diagonal elements.
- Write a program to transpose a 2x3 matrix. 
*/
public class Q2 {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print("Enter element arr[" + (i+1)+"]"+"["+(j+1)+"]"+": ");
				arr[i][j]= sc.nextInt();
				if(i==j) {
					sum += arr[i][j];
				}
			}
		}
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of diagonal: " + sum);
		
		System.out.println("Transpose: ");
		
		int arr1[][] = new int[2][3];
		int arr2[][] = new int[3][2];
		
		for(int i =0;i<arr1.length;i++) {
			for(int j =0;j<arr1[i].length;j++) {
				System.out.print("Enter element arr1[" + (i+1)+"]"+"["+(j+1)+"]"+": ");
				arr1[i][j]= sc.nextInt();
			}
		}
		System.out.println("arr1: ");
		for(int i =0;i<arr1.length;i++) {
			for(int j =0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		for(int i =0;i<arr2.length;i++) {
			for(int j =0;j<arr2[i].length;j++) {
				arr2[i][j]= arr1[j][i];
			}
		}
		
		System.out.println("Transpose of arr1: ");
		for(int i =0;i<arr2.length;i++) {
			for(int j =0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}
