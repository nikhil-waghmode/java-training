package day8.list;

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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductList {
	protected List<Product> products;

	public ProductList() {
		products = new ArrayList<>();
	}

	public void addProduct() {
		Product pd = new Product();
		pd.acceptData();
		products.add(pd);
	}

	public void displayProducts() {
		System.out.println(products);
//		products.forEach(System.out::println);
	}

	public void updateProduct() {
		Product pd = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code:");
		int code = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < products.size(); i++) {
			Product p1 = products.get(i);
			if (p1.code == code) {
				System.out.println("Enter name:");
				p1.setName(sc.nextLine());
				System.out.println("Enter category:");
				p1.setCategory(sc.nextLine());
				System.out.println("Enter price:");
				p1.setPrice(sc.nextDouble());
				sc.nextLine();
				System.out.println("Enter quantity:");
				p1.setQuantity(sc.nextInt());
				sc.nextLine();
				return;
			}
		}
		System.out.println("No such product code.");
	}

	public void deleteProduct() {
		Product pd = new Product();
		pd.acceptData();
		for (int i = 0; i < products.size(); i++) {
			Product p1 = products.get(i);
			if (p1.code == pd.code) {
				products.remove(i);
			}
		}
		System.out.println("No such product code.");
	}

	public void sortProductsByName() {
		products.sort(Comparator.comparing(Product::getName));
		products.forEach(System.out::println);
	}

	public void sortProductsByPrice() {
		products.sort(Comparator.comparing(Product::getPrice).reversed());
		products.forEach(System.out::println);
	}

	public void stockPrice() {
		double stockPrice = 0;
		for (int i = 0; i < products.size(); i++) {
			Product pd = products.get(i);
			stockPrice += pd.getPrice() * pd.getQuantity();
		}
		System.out.println("Stock price is " + stockPrice);
	}

	public void stockPrice() {
		double stockPrice = 0;
		for (Product pd : products) {
			stockPrice += pd.getPrice() * pd.getQuantity();
		}
		System.out.println("Stock price is " + stockPrice);
	}
}
