package day7.generics;

import java.util.Arrays;

/*
 Write a generic function swap(T[] array, int i, int j) that swaps two elements in an array. Test it for an Integer and
String array.
Example:
Integer[] numbers = {1, 2, 3, 4};
swap(numbers, 0, 2);
System.out.println(Arrays.toString(numbers)); // Output: [3, 2, 1, 4]
String[] words = {"A", "B", "C"};
swap(words, 1, 2);
System.out.println(Arrays.toString(words)); // Output: ["A", "C", "B"]
*/

public class SwapClass {
	public static <T>void swap(T[] array, int i,int j){
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3, 4};
		swap(numbers, 0, 2);
		System.out.println(Arrays.toString(numbers)); // Output: [3, 2, 1, 4]
		String[] words = {"A", "B", "C"};
		swap(words, 1, 2);
		System.out.println(Arrays.toString(words)); // Output: ["A", "C", "B"]
	}
}
