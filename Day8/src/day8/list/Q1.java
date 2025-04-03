package day8.list;

import java.util.ArrayList;

import java.util.*;

/*
  Write a menu-driven Java program with the following options:
1. Add an integer to the ArrayList.
2. Check if a given number exists in the ArrayList.
3. Remove a particular element from the ArrayList and display the updated list.
4. Print all elements using a for loop.
5. Print all elements using the Iterator interface.
6. Print all elements using the for-each loop.
7. Print all elements in descending order.
8. Count the total number of elements in the ArrayList.
9. Exit the program.
Ensure the program continuously prompts the user for a choice until they select the exit option. 
 */
public class Q1 {
	
	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("\n\n1. Add an integer to the ArrayList.\n"
					+ "2. Check if a given number exists in the ArrayList.\n"
					+ "3. Remove a particular element from the ArrayList and display the updated list.\n"
					+ "4. Print all elements using a for loop.\n"
					+ "5. Print all elements using the Iterator interface.\n"
					+ "6. Print all elements using the for-each loop.\n"
					+ "7. Print all elements in descending order.\n"
					+ "8. Count the total number of elements in the ArrayList.\n"
					+ "9. Exit the program.");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter integer to add: ");
				n= sc.nextInt();
				lists.add(n);
				break;
			case 2:
				System.out.println("Enter integer to search: ");
				n= sc.nextInt();
				if(lists.contains(n)) {
					System.out.println("Exists");
				}
				else {
					System.out.println("Doesn't Exist");
				}
				break;
			case 3:
				System.out.println("Enter integer to remove: ");
				n= sc.nextInt();
				if(lists.contains(n)) {
					System.out.println("Element " + lists.remove(lists.indexOf(n)) + " Removed.");
				}
				else {
					System.out.println("Doesn't Exist");
				}
				break;
			case 4:
				for(int i =0;i<lists.size();i++) {
					System.out.print(lists.get(i) + " ");
				}
				break;
			case 5:
				Iterator<Integer> its = lists.listIterator();	
				while(its.hasNext()) {
					System.out.println(its.next());
				}
				break;
			case 6:
				for(int x : lists) {
					System.out.print(x + " ");
				}
				break;
			case 7:
				lists.sort((a,b) ->Integer.compare(b,a));
				for(int x : lists) {	
					System.out.print(x+ " ");
				}
				break;
			case 8:
				System.out.println("Total number of elements: " + lists.size());
				break;
			case 9:
				System.out.println("Thank you.");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice.");
			}
		}
	}
}
