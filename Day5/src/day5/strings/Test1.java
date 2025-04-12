/**
 * 
 */
package day5.strings;

interface StringChecker {
	boolean isEmpty(String str);
}

/**
 * 
 */
public class Test1 {
	public static boolean checkStringIsEmpty(String str) {
		return str.isEmpty();
	}

	public static void main(String[] args) {
		StringChecker checker = str -> str.isEmpty();
		String t1 = "";
		String t2 = "hello";

//		System.out.println("is t1 empty? " + checker.isEmpty(t1));
//		System.out.println("is t2 empty? " + checker.isEmpty(t2));

		System.out.println(checkStringIsEmpty(t2));
	}

}
