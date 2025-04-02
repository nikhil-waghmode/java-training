package day5.arrays.assignment;

import java.util.Arrays;

/*
  Create a jagged array to store the number of days in each month (considering February has 28 days).
Write a program to print the number of days in each month
*/
public class Q3 {	
	public static void main(String[] args) {
		int arr[][] = new int[12][];
		
		arr[0] = new int[31];
		arr[1] = new int[28];
		arr[2] = new int[31];
		arr[3] = new int[30];
		arr[4] = new int[31];
		arr[5] = new int[30];
		arr[6] = new int[31];
		arr[7] = new int[31];
		arr[8] = new int[30];
		arr[9] = new int[31];
		arr[10] = new int[30];
		arr[11] = new int[31];
		
		String[] months = {
	            "January", "February", "March", "April", "May", "June", 
	            "July", "August", "September", "October", "November", "December"
	    };
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(months[i]+ " Month has " + arr[i].length + " days.");
		}
		
	}
}
