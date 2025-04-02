package day5.variablearguments.assignment;
/*2. Advanced Varargs:
- Implement a method using varargs that accepts an array of integers and returns the smallest number.
- Write a method that uses varargs to concatenate a series of strings into a single string. */
public class Q2 {
	
	public static int getSmallest(int...n) {
		int smallest=Integer.MAX_VALUE;
		for(int i =0;i<n.length;i++) {
			if(n[i]<smallest) {
				smallest = n[i];
			}
		}
		return smallest;
	}
	public static String concatString(String...s) {
		String temp="";
		for(int i=0;i<s.length;i++) {
			temp = temp.concat(s[i]);
		}
		return temp;
	}
	public static void main(String[] args) {
		
		System.out.println("Smallest number is: " + getSmallest(2,34,674,342) );
		System.out.println("Resultant string: " + concatString("Hello","This" ,"is" ,"new", "World.") );
	}
}
