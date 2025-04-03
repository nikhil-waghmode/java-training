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
import java.util.*;

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
	
	//Doubt
//	public void updateProduct() {
//		Product pd = new Product();
//		Scanner sc =new Scanner(System.in);
//		
////		pd.acceptData();
//		for(int i=0;i<products.size();i++) {
//			Product p1 = products.get(i);
//			if(p1.code == pd.code) {
//				System.out.println("Enter name:");
//				p1.setName(sc.nextLine());
//				System.out.println("Enter category:");
//				p1.setCategory(sc.nextLine());
//				System.out.println("Enter price:");
//				p1.setPrice(sc.nextDouble());
//				sc.nextLine();
//				System.out.println("Enter quantity:");
//				p1.setQuantity(sc.nextInt());
//				sc.nextLine();
//				return;
//			}
//		}
//		System.out.println("No such product code.");
//	}
	public void updateProduct() {
		Product pd = new Product();
		pd.acceptData();
		for(int i =0;i<products.size();i++) {
			Product p1 = products.get(i);
			if(p1.code == pd.code) {
				p1.setName(pd.getName());
				p1.setCategory(pd.getCategory());
				p1.setPrice(pd.getPrice());
				p1.setQuantity(pd.getQuantity());
				System.out.println("Product Updated");
				return;
			}
		}
		System.out.println("No such product code.");
	}
	
	public void deleteProduct() {
		Product pd = new Product();
		pd.acceptData();
		for(int i=0;i<products.size();i++) {
			Product p1 = products.get(i);
			if(p1.code == pd.code) {
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
	//doubt
	public void stockPrice() {
		double stockPrice =0;
		for(int i=0;i<products.size();i++) {
			Product pd = products.get(i);
			stockPrice += pd.getPrice()*pd.getQuantity();
		}
		System.out.println("Stock price is " + stockPrice);
	}
}
