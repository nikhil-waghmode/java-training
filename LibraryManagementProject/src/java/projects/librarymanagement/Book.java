/**
 * 
 */
package java.projects.librarymanagement;

import java.util.Objects;
import java.util.Scanner;

/**
 * - Create the `Book` class: - Fields: - `title` (String) - `author` (String) -
 * `ISBN` (String) - `isBorrowed` (boolean, initially `false`) - Methods: -
 * `getTitle()`: Return the title of the book. - `getAuthor()`: Return the
 * author of the book. - `getISBN()`: Return the ISBN of the book. -
 * `borrowBook()`: Set `isBorrowed` to `true`. - `returnBook()`: Set
 * `isBorrowed` to `false`. - `isAvailable()`: Return `true` if the book is not
 * borrowed.
 */
public class Book {
	protected String title;
	protected String author;
	protected String ISBN;
	protected boolean isBorrowed;

	public Book() {
		isBorrowed = false; // initially false.
	}

	public Book(String title, String author, String ISBN, boolean isBorrowed) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isBorrowed = isBorrowed;
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

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public boolean getIsBorrowed() {
		return isBorrowed;
	}

	/**
	 * Set `isBorrowed` to `true`
	 */
	public void borrowBook() {
		this.isBorrowed = true;
	}

	/**
	 * Set `isBorrowed` to `false`.
	 */
	public void returnBook() {
		this.isBorrowed = false;
	}

	/**
	 * Return `true` if the book is not borrowed.
	 * 
	 * @return
	 */
	public boolean isAvailable() {
		return !isBorrowed;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", isBorrowed=" + isBorrowed + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, author, ISBN, isBorrowed);
	}

	@Override
	public boolean equals(Object ob) {
		if (this == ob) {
			return true;
		}
		if (ob == null || !(ob instanceof Book)) {
			return false;
		}
		Book book = (Book) ob;
		return title.equals(book.title) && author.equals(book.author) && ISBN.equals(book.ISBN)
				&& isBorrowed == book.isBorrowed;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book title: ");
		title = sc.nextLine();
		System.out.println("Enter book author: ");
		author = sc.nextLine();
		System.out.println("Enter ISBN: ");
		ISBN = sc.nextLine();
		System.out.println("Enter isBorrowed: ");
		isBorrowed = sc.nextBoolean();
		sc.close();
	}

}
