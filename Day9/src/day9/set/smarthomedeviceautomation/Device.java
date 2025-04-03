package day9.set.smarthomedeviceautomation;

import java.util.Objects;
import java.util.Scanner;

public class Device {
	protected int deviceID;
	protected String deviceName;
	protected String deviceType;
	public Device(int deviceID, String deviceName, String deviceType) {
		super();
		this.deviceID = deviceID;
		this.deviceName = deviceName;
		this.deviceType = deviceType;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public Device() {
		super();
	}
	public int getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(int deviceID) {
		this.deviceID = deviceID;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	@Override
	public String toString() {
		return "Device [deviceID=" + deviceID + ", deviceName=" + deviceName + ", deviceType=" + deviceType + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(deviceID, deviceName, deviceType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		return deviceID == other.deviceID && Objects.equals(deviceName, other.deviceName)
				&& Objects.equals(deviceType, other.deviceType);
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Device ID: ");
		deviceID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Device Name: ");
		deviceName = sc.nextLine();
		System.out.println("Enter Device Type: ");
		deviceType = sc.nextLine();
	}
}
