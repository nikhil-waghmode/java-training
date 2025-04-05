package day9.map.vehicleregistrationmanagementsystem;

import java.util.Objects;
import java.util.Scanner;

public class Vehicle {
	protected String make;
	protected String model;
	protected String owner;
	public Vehicle() {
		super();
	}
	public Vehicle(String make, String model, String owner) {
		super();
		this.make = make;
		this.model = model;
		this.owner = owner;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public int hashCode() {
		return Objects.hash(make, model, owner);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& Objects.equals(owner, other.owner);
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", owner=" + owner + "]";
	} 
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle make: ");
		make = sc.nextLine();
		System.out.println("Enter Vehicle model: ");
		model = sc.nextLine();
		System.out.println("Enter Vehicle owner: ");
		owner = sc.nextLine();
	}
}
