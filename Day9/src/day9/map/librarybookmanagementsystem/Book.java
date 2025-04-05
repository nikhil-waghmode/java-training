package day9.map.librarybookmanagementsystem;

import java.util.*;

public class Book {
	 protected String title;
	 protected String author;
	 protected double price;
	 
	 Book(){ //good practice to initialize reference types.
		 title = new String();
		 author = new String();
	 }
	 Book(String title, String author, double price){
		 title = this.title;
		 author = this.author;
		 price = this.price;
		 
	 }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}
	 
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book title: ");
		title = sc.nextLine();
		System.out.println("Enter book author: ");
		author = sc.nextLine();
		System.out.println("Enter book price: ");
		price = sc.nextDouble();
		sc.nextLine();
	}
}