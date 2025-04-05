package day9.set.ecommerceproductinventory;

import java.util.*;

public class ProductSet {
	Set<Product> products;
	
	public ProductSet() {
		products = new LinkedHashSet<>();
	}
	Scanner sc = new Scanner(System.in);
	String productId = new String();
	public void addProduct() {
		Product product = new Product();
		product.acceptData();
		products.add(product);
	}
	
	public void checkProduct() {
		System.out.println("Enter the productID to check");
		productId = sc.nextLine();
		if(products.contains(productId)) {
			System.out.println("The product with ID ["+productId+"] is present in the inventory.");
			return;
		}
		System.out.println(" The product with ID ["+productId+"] is not present in the inventory");
	}
	public void deleteProduct() {
		System.out.println("Enter the productID to check");
		productId = sc.nextLine();
		if(products.contains(productId)) {
			products.remove(productId);
			System.out.println("The product with ID ["+productId+"] is present in the inventory.");
			return;
		}
		System.out.println(" The product with ID ["+productId+"] is not present in the inventory");
	}
	
}
