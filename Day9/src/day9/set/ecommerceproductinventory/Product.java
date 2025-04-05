package day9.set.ecommerceproductinventory;

import java.util.*;

public class Product {
	protected String productID;
	protected String productName;
	protected String category;
	public Product() {
		super();
	}
	public Product(String productID, String productName, String category) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.category = category;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, productID, productName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(productID, other.productID)
				&& Objects.equals(productName, other.productName);
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", category=" + category + "]";
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID:");
		productID = sc.nextLine();
		System.out.println("Enter Product Name:");
		productName = sc.nextLine();
		System.out.println("Enter Product Category:");
		category = sc.nextLine();
		
	}
}
