package day8.list;

import java.util.Objects;
import java.util.Scanner;

/*
 * Write a menu-driven Java program to perform CRUD operations (Create, Read, Update, Delete) on a List of Books.
The Book class should contain the following fields:
 isbn (String): Book's ISBN number
 title (String): Title of the book
 author (String): Author of the book
 price (double): Book's price
 quantity (int): Quantity of the book in stock
Also Override equals(), int hashCode(), and String toString() methods
Menu-Driven Operations:
1. Add a Book to the list.
2. Display all Books in the list.
3. Update a Book's price (by ISBN).
4. Delete a Book (by ISBN).
5. Sort Books by title in ascending order.
6. Sort Books by price in descending order.
7. Calculate the total price of all books in stock (price * quantity).
8. Exit the program.
Additional Notes:
 Ensure that the book data is stored in an ArrayList<Book>.
 Implement methods for adding, updating, deleting, and displaying books.
 Include a calculation operation to calculate the total price of all books in stock.
 Continuously prompt the user until they select the exit option. */
public class Book {
	protected String isbn;
	protected String title;
	protected String author;
	protected double price;
	protected int quantity;
	
	
	public Book() {
		super();
	}
	public Book(String isbn, String title, String author, double price, int quantity) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, isbn, price, quantity, title);
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
		return Objects.equals(author, other.author) && Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ISBN:");
		isbn = sc.nextLine();
		System.out.println("Enter Title:");
		title= sc.nextLine();
		System.out.println("Enter Author:");
		author= sc.nextLine();
		System.out.println("Enter price:");
		price= sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter quantity:");
		quantity=sc.nextInt();
		sc.nextLine();
	}
	
}
