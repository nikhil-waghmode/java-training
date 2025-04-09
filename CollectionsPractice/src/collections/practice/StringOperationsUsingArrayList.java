/**
 * 
 */
package collections.practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Question 3: String List OperaƟons using ArrayList Problem Statement: Write a
 * menu-driven Java program to perform the following operaƟons on an ArrayList
 * of strings with some advanced string manipulaƟons. Menu OpƟons: 1. Add a
 * string to the list 2. Insert a string at a specific index 3. Check if a
 * string exists (case-insensiƟve) 4. Remove a string by index 5. Display all
 * strings in UPPERCASE 6. Display all strings in lowercase 7. Count how many
 * strings have length greater than a given number 8. Display strings that
 * contain only digits 9. Reverse each string in the list and print 10. Clear
 * the enƟre list 11. Exit Notes:  Use ArrayList<String> to store and manage
 * the strings.  Ensure input validaƟon for operaƟons like insert at index and
 * remove by index.  Only one loop or method should be used to print all
 * strings.
 */
public class StringOperationsUsingArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<>();
		String str = new String();
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("\nMenu Options:\n" + "1. Add a string to the list\n"
					+ "2. Insert a string at a specific index\n" + "3. Check if a string exists (case-insensitive)\n"
					+ "4. Remove a string by index\n" + "5. Display all strings in UPPERCASE\n"
					+ "6. Display all strings in lowercase\n"
					+ "7. Count how many strings have length greater than a given number\n"
					+ "8. Display strings that contain only digits\n" + "9. Reverse each string in the list and print\n"
					+ "10. Clear the entire list\n" + "11. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter String to add: ");
				arrlist.add(sc.nextLine());
				break;
			case 2:
				System.out.println("Enter String to add: ");
				str = sc.nextLine();
				System.out.println("Enter index: ");
				n = sc.nextInt();
				sc.nextLine();
				arrlist.add(n, str);
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
				int len = 0;
				int count = 0;
				System.out.println("Enter a length: ");
				n = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < arrlist.size(); i++) {
					len = arrlist.get(i).length();
					if (len > n) {
						count++;
					}
				}
				System.out.println(count + " Strings have length greater than a length " + n);
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
