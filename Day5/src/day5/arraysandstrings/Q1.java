package day5.arraysandstrings;

import java.util.Scanner;

//Write a Java program to find the maximum element and minimum element in a given integer array. 
public class Q1 {
	protected int n=0;
	int arr[];
	Q1(){
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
	public void showData() {
		System.out.print("Array: ");
		for(int x : this.arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Q1 obj = new Q1();
		obj.acceptData();
		obj.showData();
		System.out.println("Max element is " + obj.getMax() + "\nMin element is " + obj.getMin());
		
	}
}
