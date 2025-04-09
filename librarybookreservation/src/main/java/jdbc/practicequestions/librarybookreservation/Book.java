/**
 * 
 */
package jdbc.practicequestions.librarybookreservation;

import java.util.Objects;
import java.util.Scanner;

/**
 * CREATE TABLE Book ( bookId INT PRIMARY KEY, title VARCHAR(150), genre
 * VARCHAR(50), isAvailable BOOLEAN );
 */
public class Book {
	protected int bookId;
	protected String title;
	protected String genre;
	protected boolean isAvailable;

	public Book() {

	}

	public Book(int bookId, String title, String genre, boolean isAvailable) {
		this.bookId = bookId;
		this.title = title;
		this.genre = genre;
		this.isAvailable = isAvailable;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Title: ");
		title = sc.nextLine();
		System.out.println("Enter Genre: ");
		genre = sc.nextLine();
		System.out.println("Enter Availablility (True/False): ");
		isAvailable = sc.nextBoolean();
	}

	@Override
	public String toString() {
		return "Book [ bookId=" + bookId + ", title=" + title + ", genre=" + genre + ", isAvailable=" + isAvailable
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book book = (Book) obj;

		return bookId == book.bookId && Objects.equals(title, book.title) && Objects.equals(genre, book.genre)
				&& (isAvailable == book.isAvailable);
	}

}
