package day9.set.smarthomedeviceautomation;

import java.util.*;

public class DeviceSet {
	Collection<Device> deviceSet;
	
	public DeviceSet() {
		deviceSet = new HashSet<>(); 
	}
	
	public void addDevice() {
		Device d = new Device();
		d.acceptData();
		deviceSet.add(d);
	}
	public void checkDevice(int deviceID) {
		for(Device device:deviceSet) {
			if(device.getDeviceID() == deviceID) {
				System.out.println("The device with ID ["+deviceID+"] is present in the HashSet.");
				return;
			}
		}
		System.out.println("The device with ID ["+deviceID+"] is not present in the HashSet.");
	}
	public void deleteDevice(int deviceID) {
		boolean isRemoved = deviceSet.removeIf((E)->E.getDeviceID() == deviceID);
		if(isRemoved) {
			System.out.println("The device with ID "+deviceID+" was removed from the HashSet.");
			return;
		}
		System.out.println("The device with ID "+deviceID+" was not found in the HashSet.");	
	}
	public void displayDevices() {
		if(deviceSet.isEmpty()) {
			System.out.println("No devices available.");
			return;
		}
		System.out.println(deviceSet);
	}
	public void countDevicesByType(String deviceType) {
		int count =0;
		for(Device device: deviceSet) {
			if(device.getDeviceType() == deviceType) {
				count++;
			}
		}
		System.out.println("Number of ["+deviceType+"] devices: ["+count+"].");
	}
}