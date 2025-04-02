package day5.variablearguments.assignment;
/*
 * Varargs and Arrays:
- Write a method that accepts an array of strings via varargs, sorts them alphabetically, and returns the
sorted array. */
public class Q4 {
	public static void main(String[] args) {
		String arr[] = new String[args.length];
		for(int i =0;i<args.length;i++) {
			arr[i] = args[i];
		}
		System.out.println("Unsorted array: ");
		for(String x: arr) {
			System.out.print(x+ " ");
		}
		String temp ="";
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length-i-1;j++) {
				if(Integer.parseInt(arr[j])>Integer.parseInt(arr[j+1])) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\nSorted array: ");
		for(String x: arr) {
			System.out.print(x+ " ");
		}
	}
}
