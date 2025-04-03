package day8.list;

import java.util.Objects;
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
public class Product {
	protected int code;
	protected String name;
	protected String category;
	protected double price;
	protected int quantity;
	
	public Product() {}
	
	public Product(int code, String name, String category,double price, int quantity) {
		this.code = code;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	
	@Override //gets called everytime object is printed using println or print
	public String toString() {
		return "Product [code:"+code+", name:"+name+", category:"+ category+", price:"+price+", quantity:"+quantity+"]";
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob != null && ob instanceof Product) {
			Product p1 = (Product) ob;
			if(this.name.equals(p1.name) && p1.code == this.code && this.category.equals(p1.category) 
					&& this.price == p1.price && this.quantity == p1.quantity) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,code,category,price,quantity);
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		name = sc.nextLine();
		System.out.println("Enter code:");
		code = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter category:");
		category= sc.nextLine();
		System.out.println("Enter price:");
		price= sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter quantity:");
		quantity=sc.nextInt();
		sc.nextLine();
	}
	

}
