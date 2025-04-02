package day5.strings;
/*
  Write a program that initializes a String with “Betty got a bit of bitter better butter” and perform the following
operations:
a. Display all the occurrences (index) of “b” and “t” in the String.
b. Display each word along with its length in a new line.
c. Display all the words that starts with “b” is the String. 
*/

public class StringsQ1 {
	protected String str = "Betty got a bit of bitter better butter";
	public StringsQ1() {
		
	}
	public void charOccurence(char c) {
		for(int i =0; i<str.length();i++) {
			if(str.toLowerCase().charAt(i) == c ) {
				System.out.println("Index of "+ c +": " + i);
			}
		}
	}
	public void wordsLength() {
		String s[] = str.split(" ");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i] + ": " + s[i].length());
		}
	}
	
	public void startsWithChar(char c) {
		String s[] = str.split(" ");
		System.out.println("Words that starts with " + c + ": " );
		for(int i=0;i<s.length;i++) {
			if(s[i].charAt(0) == 'b')
				System.out.print(s[i]+ ", ");
		}
	}
	
	public static void main(String[] args) {
		StringsQ1 obj = new StringsQ1();
		obj.charOccurence('b');
		obj.charOccurence('t');
		System.out.println();
		obj.wordsLength();
		System.out.println();
		obj.startsWithChar('b');
	}
}
