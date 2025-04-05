package day9.map.librarybookmanagementsystem;
import java.util.*;
public class BookMap {
	HashMap<String, Book> bookMap;
	public BookMap() {
		bookMap = new HashMap<>();
	}
	Scanner sc = new Scanner(System.in);
	String isbn = new String();
	
	public void addBook() {
		Book book = new Book();
		System.out.println("Enter ISBN:");
		isbn = sc.nextLine();
		if(bookMap.containsKey(isbn)) {
			System.out.println("ISBN already exists");
			return;
		}
		book.acceptData();
		bookMap.put(isbn, book);
		System.out.println("Books added successfully.");
	}
	public void checkBook() {
		System.out.println("Enter ISBN:");
		isbn = sc.nextLine();
		if(bookMap.containsKey(isbn)) {
			System.out.println("The book with ISBN ["+isbn+"] exists in the library. ");
			return;
		}
		System.out.println("The book with ISBN ["+isbn+"] is not available in the library. ");
	}
	public void removeBook() {
		System.out.println("Enter ISBN:");
		isbn = sc.nextLine();
		if(bookMap.containsKey(isbn)) {
			bookMap.remove(isbn);
			System.out.println("The book with ISBN ["+isbn+"] was removed from the library. ");
			return;
		}
		System.out.println("The book with ISBN ["+isbn+"] was not found in the library. ");
	}
	public void updatePrice() {
		System.out.println("Enter ISBN:");
		isbn = sc.nextLine();
		if(bookMap.containsKey(isbn)) {
			System.out.println("Enter updated price:");
			double price = sc.nextDouble();
			sc.nextLine();
			bookMap.get(isbn).setPrice(price);
			System.out.println("The price for book ["+bookMap.get(isbn).getTitle()+"] has been updated to $["+ bookMap.get(isbn).getPrice()+"].  ");
			return;
		}
		System.out.println("The book with ISBN [ISBN] was not found in the library. ");
	}
	public void displayBooks() {
		if(bookMap.isEmpty()) {
			System.out.println("No books are available in the library.");
		}
		bookMap.forEach((K,V) -> System.out.println("ISBN: ["+K+"], Title: ["+V.getTitle()+"], "
				+ "Author: ["+V.getAuthor()+"], Price: $["+V.getPrice()+"] "));
	}
	public void mostExpensiveBook() {
		if(bookMap.isEmpty()) {
			System.out.println("No books available to determine the most expensive book.");
			return;
		}
		double highestPrice = Double.MIN_VALUE;
		Book book= null;
		for(Map.Entry<String, Book> entry: bookMap.entrySet()) {
			if(entry.getValue().getPrice()>highestPrice) {
				highestPrice = entry.getValue().getPrice();
				book = entry.getValue();
			}
		}
		System.out.println("The most expensive book is ["+book.getTitle()+"] by ["+book.getAuthor()+
				"] with a price of $["+book.getPrice()+"]. ");
	}
	
}	

