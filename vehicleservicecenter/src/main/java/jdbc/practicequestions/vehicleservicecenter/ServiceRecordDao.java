/**
 * 
 */
package jdbc.practicequestions.vehicleservicecenter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 
 */
public class ServiceRecordDao {
	public void addNewRecord(Scanner sc, Connection conn) throws SQLException {
		ServiceRecord sr = new ServiceRecord();
		sr.acceptData(sc);
		String SQL = "INSERT INTO ServiceRecord(ownerName,vehicleType,serviceCost) values(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, sr.getOwnerName());
		pstmt.setString(2, sr.getVehicleType());
		pstmt.setDouble(3, sr.getServiceCost());

		int result = pstmt.executeUpdate();
		if (result == 1) {
			System.out.println("Service record added successfully.");
		} else {
			System.out.println("Service record unable to add.");
		}
		pstmt.close();
	}

	public void displayAllRecords(Connection conn) throws SQLException {
		String SQL = "SELECT * FROM ServiceRecord";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		ResultSet rs = pstmt.executeQuery();
		System.out.printf("%10s %30s %10s %6s\n", "serviceId", "ownerName", "vehicleType", "serviceCost");
//		System.out.printf("%56");
		while (rs.next()) {
			ServiceRecord sr = new ServiceRecord();
			sr.setServiceId(rs.getInt("serviceId"));
			sr.setOwnerName(rs.getString("ownerName"));
			sr.setVehicleType(rs.getString("vehicleType"));
			sr.setServiceCost(rs.getDouble("serviceCost"));
			System.out.println(sr);
		}
		rs.close();
		pstmt.close();
	}

	public void displayRecordsByVehicleType(Scanner sc, Connection conn) throws SQLException {
		System.out.println("Enter vehicle type to be displayed: ");
		String vehicleType = sc.nextLine();
		String SQL = "SELECT * FROM ServiceRecord WHERE vehicleType = ? ";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, vehicleType);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			ServiceRecord sr = new ServiceRecord();
			sr.setServiceId(rs.getInt("serviceId"));
			sr.setOwnerName(rs.getString("ownerName"));
			sr.setVehicleType(rs.getString("vehicleType"));
			sr.setServiceCost(rs.getDouble("serviceCost"));
			System.out.println(sr);
		}
		rs.close();
		pstmt.close();
	}

	public void updateServiceCost(Scanner sc, Connection conn) throws SQLException {
		System.out.println("Enter serviceId to be updated: ");
		int serviceId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new Service Cost: ");
		double serviceCost = sc.nextDouble();
		sc.nextLine();
		String SQL = "UPDATE ServiceRecord SET serviceCost=? WHERE serviceId = ? ";
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setDouble(1, serviceCost);
		pstmt.setInt(2, serviceId);

		int result = pstmt.executeUpdate();

		if (result == 1) {
			System.out.println("Service cost updated.");
			return;
		}
		System.out.println("Service cost not updated.");
		pstmt.close();
	}

	public void deleteRecordById(Scanner sc, Connection conn) throws SQLException {
		System.out.println("Enter serviceId to be deleted: ");
		int serviceId = sc.nextInt();
		sc.nextLine();
		String SQL = "DELETE FROM ServiceRecord WHERE serviceId =?";

		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setInt(1, serviceId);
		int result = pstmt.executeUpdate();
		if (result == 1) {
			System.out.println("Service record deleted.");
		}
		System.out.println("Record not found");
		pstmt.close();
	}
}
