package day7.lambda.assignment;

import java.util.Scanner;

/**
 Write Lambda expressions for the following cases:
a. Convert string to title case.
b. Convert string to camel case.
c. Remove spaces from string.
d. Count number of vowels in a string.
e. Count number of consonants in a string
f. Count number of alphabets in a string
g. Count number of words in a string

Before you start the code, think on the following points:
a. Identify the data types of ins' and outs' for the above cases.
b. How many functional interfaces are required?
c. Can we use Generics and reduce the number of functional interfaces?
*/
public class Test {
	
	public static String stringOps1(StringLibraryOne sl, String str) { //to call functional interface 1
		return sl.convert(str);
	}
	
	public static int stringOps2(StringLibraryTwo sl, String str) { //to call functional interface 2  
		return sl.convert(str);
	}
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter String :");
		String str = in.nextLine();
		//stringOps does the calling part. StringLibrary::removeSpaces give the coding and str is the output.
		String res = stringOps1(StringLibrary::removeSpaces, str); 
		System.out.println("String without spaces is " + res);
		
		System.out.println("Converted to TitleCase: " + stringOps1(StringLibrary::toTitleCase,str));
		System.out.println("Converted to camelCase: " + stringOps1(StringLibrary::toCamelCase,str));
		System.out.println("Count of vowels is " + stringOps2(StringLibrary::countVowels,str));
		System.out.println("Count of consonants is " + stringOps2(StringLibrary::countConsonants,str));
		System.out.println("Count of alphabets is " + stringOps2(StringLibrary::countAlphabets,str));
		
		
	}
}
