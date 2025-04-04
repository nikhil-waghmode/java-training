package day9.map;
import java.util.*;
/**
 * Map 2: Digital Marketing Ad Performance Tracker
You are developing a Digital Marketing Ad Performance Tracker to monitor the performance of different ads based
on their unique Ad IDs and the number of clicks they receive. The system should use a TreeMap to store Ad IDs as keys
and their corresponding click counts as values, ensuring sorted order based on Ad IDs. Implement a menu-driven
program that allows users to efficiently manage and analyze ad performance.
Menu Options:
1. Register New Ads
 The user can enter multiple unique Ad IDs and their corresponding initial click counts.
 If a duplicate Ad ID is entered, it should not be added.
 Expected output:
Ads registered successfully.
2. Check Ad Performance
 The user enters an Ad ID to check whether it exists and retrieve its click count.
 Expected output:
o If the Ad is found:
The Ad ID [ID] has [click_count] clicks.
o If the Ad is not found:
The Ad ID [ID] is not present in the system.
3. Remove an Ad Record
 The user enters an Ad ID to remove its record from the system. 
 Expected output:
o If the Ad exists and is removed:
The Ad ID [ID] was removed from the system.
o If the Ad is not found:
The Ad ID [ID] was not found in the system.
4. Update Click Count for an Ad
 The user enters an Ad ID and provides a new click count to update its performance.
 Expected output:
o If the Ad exists:
The Ad ID [ID] click count updated to [new_click_count].
o If the Ad is not found:
The Ad ID [ID] was not found in the system.
5. Display Ads Sorted by ID
 The program should display all stored Ad IDs in sorted order, along with their click counts.
 Expected output:
Ad Performance Summary:
Ad ID: [ID1], Clicks: [CLICK1]
Ad ID: [ID2], Clicks: [CLICK2]
...
 If no ads are present, display:
No ad records available in the system.
6. Find the Most Popular Ad
 The program finds and displays the Ad ID with the highest click count.
 Expected output:
The most popular Ad is [ID] with [click_count] clicks.
 If no ads are present, display:
No ads available to determine the most popular one.
7. Exit the Program
 The program should terminate when the user selects this option.
 Expected output:
Exiting the Digital Marketing Ad Performance Tracker. Goodbye! */
public class DigitalMarketingAdPerformanceTracker {
	public static void main(String[] args) {
		TreeMap<String,Integer> tracker = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		String adId = new String();
		int clickCount =0;
		while(true) {
			System.out.println("1. Register New Ads\n"+
								"2. Check Ad Performance\n"+
								"3. Remove an Ad Record\n"+
								"4. Update Click Count for an Ad\n"+
								"5. Display Ads Sorted by ID\n"+
								"6. Find the Most Popular Ad\n"+
								"7. Exit the Program");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter an Ad ID: ");
				adId = sc.nextLine();
				if(tracker.containsKey(adId)) {
					System.out.println("Duplicate Ad ID");
					break;
				}
				System.out.println("Enter an Click Count: ");
				clickCount= sc.nextInt();
				sc.nextLine();
				tracker.put(adId, clickCount);
				System.out.println("Ads registered successfully.");
				break;
			case 2:
				System.out.println("Enter an Ad ID to check performance: ");
				adId = sc.nextLine();
				if(tracker.containsKey(adId)) {
					System.out.println("The Ad ID ["+adId+"] has ["+tracker.get(adId)+"] clicks.");
					break;
				}
				System.out.println("The Ad ID ["+adId+"] is not present in the system.");
				break;
			case 3:
				System.out.println("Enter an Ad ID to remove: ");
				adId = sc.nextLine();
				if(tracker.containsKey(adId)) {
					tracker.remove(adId);
					System.out.println("The Ad ID ["+adId+"] was removed from the system.");
					break;
				}
				System.out.println("The Ad ID ["+adId+"] was not found in the system.");
				break;
			case 4:
				System.out.println("Enter an Ad ID to update value: ");
				adId = sc.nextLine();
				if(tracker.containsKey(adId)) {
					System.out.println("Enter new value: ");
					clickCount = sc.nextInt();
					sc.nextLine();
					tracker.put(adId,clickCount);
					System.out.println("The Ad ID ["+adId+"] click count updated to ["+clickCount+"].");
					break;
				}
				System.out.println("The Ad ID ["+adId+"] was not found in the system.");
				break;
			case 5:
				tracker.forEach((K,V) ->System.out.println("Ad ID: ["+K+"], Clicks: ["+V+"]"));
				break;
			case 6:
				int max = Integer.MIN_VALUE;
				for(Map.Entry<String, Integer> entry: tracker.entrySet()) {
					if(entry.getValue() >max) {
						max =entry.getValue();
						adId = entry.getKey();
					}
				}
				System.out.println("The most popular Ad is ["+adId+"] with ["+ max+"] clicks. ");
				break;
			case 7:
				System.out.println("Digital Marketing Ad Performance Tracker. Goodbye!");
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
