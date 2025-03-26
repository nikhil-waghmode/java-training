package day2;
import java.util.Scanner;
public class VowelConsonent {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		switch(c) {
		case 'A':  //break isn't present so it skips to next case.
		case 'a': System.out.println("Vowel.");
					break;
		
		}
	}
}
