package day8.list;

import java.util.*;

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
public class BookList {
	List<Book> books;
	BookList(){
		books= new ArrayList<>();
	}
	public void addBook() {
		Book b = new Book();
		b.acceptData();
		books.add(b);
	}
	public void displayBooks() {
		System.out.println(books);
	}
	public void updateBook() {
		Book b = new Book();
		for(int i =0;i<books.size();i++) {
			Book b1 = books.get(i);
			if(b1.getIsbn().equalsIgnoreCase())
		}
	}
	
}
