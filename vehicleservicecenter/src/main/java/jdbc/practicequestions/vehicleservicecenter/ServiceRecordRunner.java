/**
 * 
 */
package jdbc.practicequestions.vehicleservicecenter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 
 */
public class ServiceRecordRunner {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost/example8";
	public static final String USER = "root";
	public static final String PASSWORD = "6969";

	public static void main(String[] args) {
		ServiceRecordDao srd = new ServiceRecordDao();
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.println("Database connected successfully.");

			while (true) {
				System.out.println("1. Add New Service Record\n" + "2. Display All Service Records\n"
						+ "3. Display Records by Vehicle Type\n" + "4. Update Service Cost\n"
						+ "5. Delete Record by ID\n" + "6. Exit");
				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					srd.addNewRecord(sc, conn);
					break;
				case 2:
					srd.displayAllRecords(conn);
					break;
				case 3:
					srd.displayRecordsByVehicleType(sc, conn);
					break;
				case 4:
					srd.updateServiceCost(sc, conn);
					break;
				case 5:
					srd.deleteRecordById(sc, conn);
					break;
				case 6:
					conn.close();
					System.out.println("Connection closed successfully.");
					System.out.println("Program Terminated");
					System.exit(0);

					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
