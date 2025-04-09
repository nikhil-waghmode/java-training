/**
 * 
 */
package jdbc.practicequestions.librarybookreservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 
 */
public class LibraryDao {
	Book book = new Book();
	Scanner sc = new Scanner(System.in);

	public void addBook(Connection conn) throws SQLException {
		book.acceptData();
		String SQL = "insert into Book(title,genre,isAvailable) values(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, book.getTitle());
		pstmt.setString(2, book.getGenre());
		pstmt.setBoolean(3, book.getIsAvailable());
		int result = pstmt.executeUpdate();
		if (result == 1) {
			System.out.println("Book added successfully.");
			return;
		}
		System.out.println("Unable to add new Book.");

		pstmt.close();
	}

	public void displayAllBooks(Connection conn) throws SQLException {
		String SQL = "select * from Book";
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			Book book = new Book();
			book.setBookId(rs.getInt("bookId"));
			book.setTitle(rs.getString("title"));
			book.setGenre(rs.getString("genre"));
			book.setIsAvailable(rs.getBoolean("isAvailable"));
			System.out.println(book);
		}
		rs.close();
		stmt.close();
	}

	public void displayBooksByGenre(Connection conn) throws SQLException {

		System.out.println("Enter genre to display: ");
		String genre = sc.nextLine();
		String SQL = "SELECT * FROM Book where genre = ?";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, genre);

		ResultSet rs = pstmt.executeQuery();
		boolean found = false;
		while (rs.next()) {
			found = true;
			Book book = new Book();
			book.setBookId(rs.getInt("bookId"));
			book.setTitle(rs.getString("title"));
			book.setGenre(rs.getString("genre"));
			book.setIsAvailable(rs.getBoolean("isAvailable"));
			System.out.println(book);
		}
		if (!found) {
			System.out.println("Genre not found");
		}
		rs.close();
		pstmt.close();
	}

	public void updateBookAvailability(Connection conn) throws SQLException {
		System.out.println("Enter bookId to update availability: ");
		int bookId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter availability: ");
		String availability = sc.nextLine();

		String SQL = "update Book set isAvailable = ? where bookId = ?";

		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, availability);
		pstmt.setInt(2, bookId);

		int result = pstmt.executeUpdate();
		if (result == 1) {
			System.out.println("Book availability updated.");
			return;
		}
		System.out.println("Book availability not updated.");
		pstmt.close();
	}

	public void deleteBook(Connection conn) throws SQLException {
		System.out.println("Enter bookId to delete: ");
		int bookId = sc.nextInt();
		sc.nextLine();
		String SQL = "delete from Book where bookId=?";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setInt(1, bookId);
		int result = pstmt.executeUpdate();
		if (result == 1) {
			System.out.println("Book deleted successfully.");
			return;
		}
		System.out.println("Book not found.");
		pstmt.close();
	}
}
