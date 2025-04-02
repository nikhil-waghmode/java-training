package day5.arrays.assignment;

import java.util.Arrays;
import java.util.Scanner;

/*
 * . Array Manipulation:
- Write a program to find the maximum and minimum values in an array of integers.
- Create a program that merges two arrays into a single array and removes duplicate elements*/
public class Q5 {
	protected int n=0;
	int arr[];
	Q5(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		n = sc.nextInt();
		arr= new int[n];
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<n;i++) {
			System.out.print("Enter element " + (i+1) +": ");
			arr[i] = sc.nextInt();
		}
	}
	public void showData(int arr[]) {
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public int getMax() {
		int max = Integer.MIN_VALUE;
		for (int i =0;i<n;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public int getMin() {
		int min = Integer.MAX_VALUE;
		for (int i =0;i<n;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public void mergeArrays(int[] arr1, int[] arr2) {
		
		int temp[];
		temp = Arrays.copyOf(arr1, arr1.length);
		Arrays.fill(temp, 0);
		for(int i =0;i<arr1.length;i++) {
			for(int j =0;j<arr2.length;j++) {
				if(arr2[i]!=temp[j]) {
					temp[arr1.length+j] = arr2[i];
				}
			}
		}
		System.out.println("Merged array: ");
		for(int x: temp) {
			System.out.println(x);
		}
		
	}
	public static void main(String[] args) {
		Q5 obj = new Q5();
		obj.acceptData();
		obj.showData(obj.arr);
		System.out.println("Max element is " + obj.getMax() + "\nMin element is " + obj.getMin());
		
		int arr1[] = {1,2,3};
		int arr2[] = {4,5};
		
		obj.mergeArrays(arr1,arr2);
		
	}
}
