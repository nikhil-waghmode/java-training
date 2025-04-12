/**
 * 
 */
package java.projects.librarymanagement;

import java.util.Arrays;
import java.util.Objects;

/**
 * - Create the `Member` class: - Fields: - `name` (String) - `memberID`
 * (String) - `borrowedBook1`, `borrowedBook2`, `borrowedBook3` (Book): Fields
 * to store up to three borrowed books (you can add more if needed) - Methods: -
 * `getName()`: Return the member's name. - `getMemberID()`: Return the member's
 * ID. - `borrowBook(Book book)`: Check if any of the `borrowedBook` fields are
 * `null`, then assign the book to that field and mark it as borrowed. -
 * `returnBook(Book book)`: Compare the book with each `borrowedBook` field, if
 * found, set the field to `null` and mark the book as returned. -
 * `getBorrowedBooks()`: Display the titles of all books borrowed by the member.
 */
public class Member {
	protected String name;
	protected String memberID;
	protected Book[] borrowedBooks;

	public Member(String name, String memberID, Book[] borrowedBooks) {
		super();
		this.name = name;
		this.memberID = memberID;
		this.borrowedBooks = borrowedBooks;
	}

	public Member(int maxBorrowLimit) {
		super();
		borrowedBooks = new Book[maxBorrowLimit];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getmemberID() {
		return memberID;
	}

	public void setmemberID(String memberID) {
		this.memberID = memberID;
	}

	public Book[] getborrowedBooks() {
		return borrowedBooks;
	}

	public void setborrowedBooks(Book[] borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	/**
	 * `borrowBook(Book book)`: Check if any of the `borrowedBook` fields are
	 * `null`, then assign the book to that field and mark it as borrowed.
	 * 
	 * @param book
	 */
	public void borrowBook(Book book) {
		for (int i = 0; i < borrowedBooks.length; i++) {
			if (borrowedBooks[i] == null) {
				borrowedBooks[i] = book;
				book.borrowBook();
				System.out.println("Book borrowed: " + book.getTitle());
				return;
			}
		}
	}

	public void returnBook(Book book) {
		for (int i = 0; i < borrowedBooks.length; i++) {
			if (borrowedBooks[i].equals(book)) {
				borrowedBooks[i] = null;
				book.returnBook();
				System.out.println("Book returned: " + book.getTitle());
				return;
			}
		}
	}

	public void getBorrowedBooks() {
		for (int i = 0; i < borrowedBooks.length; i++) {
			if (borrowedBooks[i] != null) {
				System.out.println(borrowedBooks[i]);
			}
		}
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", memberID=" + memberID + ", borrowedBooks=" + Arrays.toString(borrowedBooks)
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(borrowedBooks);
		result = prime * result + Objects.hash(memberID, name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Arrays.equals(borrowedBooks, other.borrowedBooks) && Objects.equals(memberID, other.memberID)
				&& Objects.equals(name, other.name);
	}

}
