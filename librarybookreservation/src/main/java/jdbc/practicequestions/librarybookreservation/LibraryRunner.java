/**
 * 
 */
package jdbc.practicequestions.librarybookreservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 
 */
public class LibraryRunner {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost/example7";
	public static final String USER = "root";
	public static final String PASSWORD = "6969";

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LibraryDao lib = new LibraryDao();
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.println("Database connected successfully.");
			while (true) {
				System.out.println("\n1. Add New Book\n" + "2. Display All Books\n" + "3. Display Books by Genre\n"
						+ "4. Update Book Availability\n" + "5. Delete Book by ID\n" + "6. Exit");
				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					lib.addBook(conn);
					break;
				case 2:
					lib.displayAllBooks(conn);
					break;
				case 3:
					lib.displayBooksByGenre(conn);
					break;
				case 4:
					lib.updateBookAvailability(conn);
					break;
				case 5:
					lib.deleteBook(conn);
					break;
				case 6:
					conn.close();
					System.out.println("Connection closed successfully.");
					System.out.println("Exiting.");
					System.exit(0);
					sc.close();
				default:
					System.out.println("Invalid Option");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
