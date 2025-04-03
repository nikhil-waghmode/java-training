package day8.list;

import java.util.ArrayList;
import java.util.*;
/*Question 2:
Write a menu-driven Java program to perform the following operations on an ArrayList of Strings:
1. Add a string to the ArrayList.
2. Check if a given string exists in the ArrayList.
3. Remove a particular string from the ArrayList and display the updated list.
4. Print all strings in the ArrayList.
5. Count the total number of strings in the ArrayList.
6. Find all strings that start with a given prefix.
7. Find all strings that end with a given suffix.
8. Find all strings that contain a given substring.
9. Sort the strings in ascending order. 
10. Sort the strings in descending order.
11. Exit the program.
Note:
 The program should continue prompting the user with the menu until the user selects option 11 (Exit).
 Use ArrayList to store the strings, and make sure to implement string matching operations like prefix, suffix,
and substring checks.
 Implement only one method to print the strings in the ArrayList (such as using a loop or any other
appropriate method). 
*/
public class Q2 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String str = new String();
		
		while(true) {
			System.out.println("1. Add a string to the ArrayList.\n"
					+ "2. Check if a given string exists in the ArrayList.\n"
					+ "3. Remove a particular string from the ArrayList and display the updated list.\n"
					+ "4. Print all strings in the ArrayList.\n"
					+ "5. Count the total number of strings in the ArrayList.\n"
					+ "6. Find all strings that start with a given prefix.\n"
					+ "7. Find all strings that end with a given suffix.\n"
					+ "8. Find all strings that contain a given substring.\n"
					+ "9. Sort the strings in ascending order. \n"
					+ "10. Sort the strings in descending order.\n"
					+ "11. Exit the program.");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter String to add: ");
				strings.add(sc.nextLine());
				System.out.println("String added successfully.");
				break;
			case 2:
				System.out.println("Enter a string to search: ");
				str = sc.nextLine();
				for(int i =0;i<strings.size();i++) {
					if(str.equals(strings.get(i))) {
						System.out.println("String exists");
						break;
					}
				}
				System.out.println("String doesn't exist");
				break;
			case 3:
				System.out.println("Enter a string to remove: ");
				str = sc.nextLine();
				for(int i =0;i<strings.size();i++) {
					if(str.equals(strings.get(i))) {
						strings.remove(i);
						strings.forEach(System.out::println);
						break;
					}
				}
				System.out.println("String doesn't exist");
				break;
			case 4:
				strings.forEach(System.out::println);
				break;
			case 5:
				System.out.println("Count of strings in arraylist: " + strings.size());
				break;
			case 6:
				System.out.println("Enter prefix to search: ");
				str = sc.nextLine();
				for(int i=0;i<strings.size();i++) {
					if(strings.get(i).startsWith(str)) {
						System.out.println(strings.get(i) + " ");
						break;
					}
					if(i==strings.size()-1) {
						System.out.println("Prefix doesn't exist");
					}
				}				
				break;
			case 7:
				System.out.println("Enter suffix to search: ");
				str = sc.nextLine();
				for(int i=0;i<strings.size();i++) {
					if(strings.get(i).endsWith(str)) {
						System.out.println(strings.get(i) + " ");
						break;
					}
					if(i==strings.size()-1) {
						System.out.println("Suffix doesn't exist");
					}
				}			
				break;
			case 8:
				System.out.println("Enter substring to search: ");
				str = sc.nextLine();
				for(int i=0;i<strings.size();i++) {
					if(strings.get(i).contains(str)) {
						System.out.println(strings.get(i) + " ");
						break;
					}
					if(i==strings.size()-1) {
						System.out.println("Substring doesn't exist");
					}
				}
				break;
			case 9:
				strings.sort((a,b)->a.compareTo(b));
				strings.forEach(System.out::println);
				break;
			case 10:
				strings.sort((a,b)->b.compareTo(a));
				strings.forEach(System.out::println);
				break;
			case 11:
				System.out.println("Exiting...Thank you.");
				System.exit(0);
				
				sc.close();
			}
			
		}	
		
	}
}
