/**
 * 
 */
package jdbc.practicequestions.vehicleservicecenter;

import java.util.Objects;
import java.util.Scanner;

/**
 * CREATE TABLE ServiceRecord ( serviceId INT PRIMARY KEY, ownerName
 * VARCHAR(100), vehicleType VARCHAR(50), serviceCost DOUBLE );
 */
public class ServiceRecord {
	protected int serviceId;
	protected String ownerName;
	protected String vehicleType;
	protected double serviceCost;

	public ServiceRecord() {

	}

	public ServiceRecord(int serviceId, String ownerName, String vehicleType, double serviceCost) {

		this.serviceId = serviceId;
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.serviceCost = serviceCost;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(double serviceCost) {
		this.serviceCost = serviceCost;
	}

	@Override
	public String toString() {

		return String.format("%10d %30s %10s %6.2f", serviceId, ownerName, vehicleType, serviceCost);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serviceId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ServiceRecord)) {
			return false;
		}
		ServiceRecord sr = (ServiceRecord) obj;

		return serviceId == sr.serviceId && ownerName.equals(sr.ownerName) && vehicleType.equals(sr.vehicleType)
				&& serviceCost == sr.serviceCost;
	}

	public void acceptData(Scanner sc) {
		System.out.println("Enter Owner Name:");
		ownerName = sc.nextLine();
		System.out.println("Enter Vehicle Type:");
		vehicleType = sc.nextLine();
		System.out.println("Enter Service Cost:");
		serviceCost = sc.nextDouble();
		sc.nextLine();
	}
}
