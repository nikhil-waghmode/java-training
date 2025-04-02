package day5.variablearguments.assignment;
/*
 * 1. Basic Varargs:
- Write a Java method using varargs to find the sum of an arbitrary number of integers passed as
arguments.
- Create a method that takes a string and any number of integers as arguments, then prints the string
followed by the sum of the integers. */
public class Q1 {
		public static int getSum(int...n) {
			int sum =0;
			for(int i =0;i<n.length;i++) {
				sum+=n[i];
			}
			return sum;
		}
		public static void showStringIntegers(String str,int...n) {
			System.out.println("String: "+str);
			int sum =0;
			for(int i =0;i<n.length;i++) {
				sum+=n[i];
			}
			System.out.println("Sum: "+sum);
		}
		public static void main(String[] args) {
			System.out.println(getSum(1,2,3,4,5));
			System.out.println(getSum(33,11,342,32432,543543));
			showStringIntegers("hello worlddd",1,2,3,4,5);
		}
}
