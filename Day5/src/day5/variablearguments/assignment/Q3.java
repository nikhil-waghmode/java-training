package day5.variablearguments.assignment;
/*
 * 1. Array and Command Line:
- Create a program that accepts a list of integers via command line arguments, stores them in an array,
and sorts the array in ascending order. */
public class Q3 {
	public static void main(String[] args) {
		int arr[] = new int[args.length];
		for(int i =0;i<args.length;i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		System.out.println("Unsorted array: ");
		for(int x: arr) {
			System.out.print(x+ " ");
		}
		int temp =0;
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\nSorted array: ");
		for(int x: arr) {
			System.out.print(x+ " ");
		}
		
	}
}
