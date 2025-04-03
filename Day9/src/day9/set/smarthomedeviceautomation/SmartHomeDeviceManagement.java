package day9.set.smarthomedeviceautomation;

import java.util.*;


public class SmartHomeDeviceManagement {
	public static void main(String[] args) {
		DeviceSet ds = new DeviceSet();
		Scanner sc = new Scanner(System.in);
		int id = 0;
		while (true) {
			System.out.println("1.Add Devices\n" +
					"2.Check for a Device \n" + 
					"3.Delete a Device \n" +
					"4.Display All Devices\n"+
					"5.Count Devices by type\n" + 
					"6.Exit");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				ds.addDevice();
				break;
			case 2:
				System.out.println("Enter ID to check:");
				id = sc.nextInt();
				sc.nextLine();
				ds.checkDevice(id);
				break;
			case 3:
				System.out.println("Enter ID to delete:");
				id = sc.nextInt();
				sc.nextLine();
				ds.deleteDevice(id);
				break;
			case 4:
				ds.displayDevices();
				break;
			case 5:
				System.out.println("Enter Device Type to count:");
				String str = sc.nextLine();
				ds.countDevicesByType(str);
				break;
			case 6:
				System.out.println("Smart Home Device Management System. Goodbye!");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}

	}
}
