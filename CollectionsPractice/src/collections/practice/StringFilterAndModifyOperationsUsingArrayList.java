/**
 * 
 */
package collections.practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Question 4: String Filter & Modify OperaƟons using ArrayList Problem
 * Statement: Write a menu-driven Java program to manage an ArrayList of strings
 * that allows the user to perform filtering and string transformaƟon operaƟons.
 * Menu OpƟons: 1. Add a new string 2. Remove all strings shorter than a given
 * length 3. Display all strings starƟng with a vowel 4. Replace a specific
 * string with another 5. Convert all strings to Title Case (First LeƩer
 * Capital) 6. Find and print the longest string(s) 7. Find and print the
 * shortest string(s) 8. Remove duplicate strings 9. Display all strings in
 * reverse order of inserƟon 10. Display all strings with their lengths 11. Exit
 * Notes:  Focus on filtering and transforming string content.  Handle case
 * sensiƟvity where required.  Use efficient string operaƟons like replace,
 * substring, toLowerCase, etc.
 */
public class StringFilterAndModifyOperationsUsingArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<>();
		String str = new String();
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Add a new string");
			System.out.println("2. Remove all strings shorter than a given length");
			System.out.println("3. Display all strings starting with a vowel");
			System.out.println("4. Replace a specific string with another");
			System.out.println("5. Convert all strings to Title Case (First letter Capital)");
			System.out.println("6. Find and print the longest string(s)");
			System.out.println("7. Find and print the shortest string(s)");
			System.out.println("8. Remove duplicate strings");
			System.out.println("9. Display all strings in reverse order of insertion");
			System.out.println("10. Display all strings with their lengths");
			System.out.println("11. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter String to add: ");
				arrlist.add(sc.nextLine());
				break;
			case 2:
				int len = 0;
				System.out.println("Enter a length: ");
				n = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < arrlist.size(); i++) {
					len = arrlist.get(i).length();
					if (len < n) {
						System.out.print(arrlist.get(i) + " ");
						arrlist.remove(i);
					}
				}
				break;
			case 3:
				System.out.println("Enter String to search: ");
				str = sc.nextLine();
				for (int i = 0; i < arrlist.size(); i++) {
					if (str.equalsIgnoreCase(arrlist.get(i))) {
						System.out.println("String found at " + i);
						break;
					}
				}
				System.out.println("String not found");
				break;
			case 4:
				System.out.println("Enter index to remove: ");
				n = sc.nextInt();
				sc.nextLine();
				arrlist.remove(n);
				break;
			case 5:
				System.out.println("ArrayList in UPPERCASE:");
				for (String x : arrlist) {
					System.out.print(x.toUpperCase() + " ");
				}
				break;
			case 6:
				System.out.println("ArrayList in lowercase:");
				for (String x : arrlist) {
					System.out.print(x.toLowerCase() + " ");
				}
				break;
			case 7:

				break;
			case 8:
				System.out.println("Strings that contains only digits.");
				for (String x : arrlist) {
					try {
						Integer.parseInt(x);
						System.out.print(x + " ");
					} catch (Exception e) {
						continue;
					}
				}
				break;
			case 9:
				for (String x : arrlist) {
					String sb = new StringBuilder(x).reverse().toString();
					System.out.print(sb + " ");
				}
				break;
			case 10:
				System.out.println("Clearing the entire list...");
				arrlist.clear();
				break;

			case 11:
				sc.close();
				System.out.println("Exiting the program.");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
