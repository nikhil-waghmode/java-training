package day7.generics;
/*
 * Define a generic interface MinMax<T> with methods:
 T min(T[] array): Returns the smallest element.
 T max(T[] array): Returns the largest element.
Implement this interface in a class and test it for an array of Integer. 
 */
public class MinMaxClass implements MinMax<Integer> {
	@Override
	public Integer min(Integer[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	@Override
	public Integer max(Integer[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		MinMaxClass obj1 = new MinMaxClass();
		Integer[] arr = {241,231,4355,56464};
		System.out.println(obj1.min(arr));
		System.out.println(obj1.max(arr));
	}
}
