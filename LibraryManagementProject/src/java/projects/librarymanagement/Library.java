/**
 * 
 */
package java.projects.librarymanagement;

import java.util.Arrays;
import java.util.Objects;

/**
 * - Create the `Library` class: - Fields: - `name` (String) - `book1`, `book2`,
 * `book3` (Book): Fields to store up to three books in the library (you can add
 * more if needed) - `member1`, `member2`, `member3` (Member): Fields to store
 * up to three members in the library (you can add more if needed) - Methods: -
 * `addBook(Book book)`: Add a book to the first available `book` field. -
 * `addMember(Member member)`: Add a member to the first available `member`
 * field. - `borrowBook(String memberID, String ISBN)`: Allow a member to borrow
 * a book by checking if the book is available and the member exists. -
 * `returnBook(String memberID, String ISBN)`: Allow a member to return a book.
 * - `listAvailableBooks()`: Display all books that are currently available. -
 * `listBorrowedBooks(String memberID)`: Display all books borrowed by a
 * specific member.
 */
public class Library {
	protected String name;
	protected Book[] books;
	protected Member[] members;

	public Library(int maxMembers) {
		members = new Member[maxMembers];
	}

	public Library(String name, Book[] books, Member[] members) {
		super();
		this.name = name;
		this.books = books;
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public Member[] getMembers() {
		return members;
	}

	public void setMembers(Member[] members) {
		this.members = members;
	}

	public void addBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				System.out.println("Book " + book.getTitle() + " added to " + getName() + " library: ");
				return;
			}
		}
	}

	public void addMember(Member member) {
		for (int i = 0; i < books.length; i++) {
			if (members[i] == null) {
				members[i] = member;
				System.out.println("Member " + member.getName() + " added to " + getName() + " library: ");
				return;
			}
		}
	}

	public void borrowBook(String memberID, String ISBN) {
		if (ISBN.is)
			for (int i = 0; i < borrowedBooks.length; i++) {
				if (borrowedBooks[i] == null) {
					borrowedBooks[i] = book;
					book.borrowBook();
					System.out.println("Book borrowed: " + book.getTitle());
					return;
				}
			}
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", books=" + Arrays.toString(books) + ", members=" + Arrays.toString(members)
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(books);
		result = prime * result + Arrays.hashCode(members);
		result = prime * result + Objects.hash(name);
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
		Library other = (Library) obj;
		return Arrays.equals(books, other.books) && Arrays.equals(members, other.members)
				&& Objects.equals(name, other.name);
	}

}
