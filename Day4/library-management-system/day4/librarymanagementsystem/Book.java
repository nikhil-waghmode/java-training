package day4.librarymanagementsystem;

public class Book {
	protected String title;
	protected String author;
	protected String ISBN;
	protected boolean isBorrowed;
	
	public Book() {
		
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

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void borrowBook() {
		this.isBorrowed = true;
	}
	public void returnBook() {
		this.isBorrowed = false;
	}
}
