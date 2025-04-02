package day5.arrays.assignment;

import java.util.Arrays;
import java.util.Scanner;

/*
 Array Searching and Sorting:
- Write a Java program to implement a binary search on a sorted array.
- Implement bubble sort on an array of integers. 
*/
public class Q4 {
	protected int n=0;
	int arr[];
	Q4(){
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
	public void showData() {
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public void bubbleSort(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Q4 obj = new Q4();
		obj.acceptData();
		System.out.print("Unsorted Array: ");
		obj.showData();
//		Arrays.sort(obj.arr);
		obj.bubbleSort(obj.arr);
		System.out.print("Sorted Array: ");
		obj.showData();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key to search: ");
		int k = sc.nextInt();
		System.out.println(k+" is present at the index: " + (Arrays.binarySearch(obj.arr,k)<0?"Not found":Arrays.binarySearch(obj.arr,k)));
		
		
	}
}
