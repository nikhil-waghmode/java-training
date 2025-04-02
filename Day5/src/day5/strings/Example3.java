package day5.strings;
/*Example:
Write a program that creates matrix of size 3 by 4.
Accepts all integer elements and print sum of all rows, all columns and entire
matrix.*/

import java.util.Scanner;

public class Example3 {
	public static void main(String args[]) {
		int arr[][]= new int[3][4];
		
		int rowSum[] = new int[arr.length]; //array to store sum of each row.
		int colSum[] = new int[arr[0].length]; //array to store sum of each row.
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int i,j;
		for (i =0;i<arr.length;i++) {
			for(j =0;j<arr[i].length;j++) {
				System.out.print("Enter number [" + i + "]" +"["+j+"]: ");
				arr[i][j] = sc.nextInt();
				sum +=arr[i][j]; //sum of all elements of matrix
				rowSum[i] += arr[i][j]; //sum of rows
				colSum[j] +=arr[i][j]; //sum of column
			}
			
		}
		
		for(i =0; i<arr.length;i++) {
			for(j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(rowSum[i]);
		
		}
		for(j =0;j<colSum.length;j++) {
			System.out.print(colSum[j] + "\t");
		}
		System.out.println(sum);
		
		sc.close();
	}
}
