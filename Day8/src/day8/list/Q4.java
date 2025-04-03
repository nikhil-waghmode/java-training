package day8.list;

import java.util.Scanner;

/*Question 4: 
Write a menu-driven Java program to perform CRUD operations (Create, Read, Update, Delete) on a List of Products.
The Product class should contain the following fields:
 code (int): Product's code
 name (String): Product name
 category (String): Category of the product
 price (double): Product's price
 quantity (int): Quantity of the product in stock
Also Override equals(), int hashCode(), and String toString() methods
Menu-Driven Operations:
1. Add a Product to the list.
2. Display all Products in the list.
3. Update a Product (by code).
4. Delete a Product (by code).
5. Sort Products by name in ascending order.
6. Sort Products by price in descending order.
7. Calculate the total stock value (price * quantity) for all products.
8. Exit the program.
Additional Notes:
 Ensure that the product data is stored in an ArrayList<Product>.
 Implement appropriate methods for adding, updating, deleting, displaying products.
 Include a calculation operation to calculate the total stock value.
 Continuously prompt the user until they select the exit option. 
*/
public class Q4 {
	public static void main(String[] args) {
		ProductList pl = new ProductList();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add a Product to the list.\n"
					+ "2. Display all Products in the list.\n"
					+ "3. Update a Product (by code).\n"
					+ "4. Delete a Product (by code).\n"
					+ "5. Sort Products by name in ascending order.\n"
					+ "6. Sort Products by price in descending order.\n"
					+ "7. Calculate the total stock value (price * quantity) for all products.\n"
					+ "8. Exit the program.");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				pl.addProduct();
				break;
			case 2:
				pl.displayProducts();
				break;
			case 3:
				pl.updateProduct();
				break;
			case 4:
				pl.deleteProduct();
				break;
			case 5:
				pl.sortProductsByName();
				break;
			case 6:
				pl.sortProductsByPrice();
				break;
			case 7:
				pl.stockPrice();
				break;
			case 8:
				System.out.println("Exiting...Thank you.");
				System.exit(0);
				sc.close();
			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
