package day9.map;
import java.util.*;
/**
 * Map 1: Advertising Campaign Budget Management System
You are developing an Advertising Campaign Budget Management System to track unique advertising campaigns
using their IDs and budgets. The system should use a HashMap to store campaign IDs as keys and their corresponding
budgets as values, ensuring uniqueness. Implement a menu-driven program to allow users to manage advertising
campaigns efficiently.
Menu Options:
1. Add Advertising Campaigns
 The user can enter multiple unique campaign IDs and their corresponding budgets to store in the system.
 If a duplicate campaign ID is entered, it should not be added.
 Expected output:
Campaigns added successfully.
2. Check if a Campaign Exists
 The user enters a campaign ID to check whether it exists in the system.
 Expected output:
o If the campaign is found:
The campaign ID [ID] is present in the system.
o If the campaign is not found:
The campaign ID [ID] is not present in the system.
3. Remove an Advertising Campaign
 The user enters a campaign ID to remove it from the system.
 Expected output:
o If the campaign exists and is removed:
The campaign ID [ID] was removed from the system.
o If the campaign is not found:
The campaign ID [ID] was not found in the system.
4. Display the Updated List of Advertising Campaigns
 The program should display all stored advertising campaigns along with their budgets.
 Expected output:
Updated list of campaigns:
Campaign ID: [ID1], Budget: [BUDGET1]
Campaign ID: [ID2], Budget: [BUDGET2]
... 
 If no campaigns are present, display:
No campaigns available in the system.
5. Calculate Average Campaign Budget
 The program calculates and displays the average budget of all stored campaigns, rounded to two decimal
places.
 Expected output:
Average Budget of All Campaigns: [average]
 If no campaigns are stored, display:
No campaigns available to calculate the average budget.
6. Exit the Program
 The program should terminate when the user selects this option.
 Expected output:
Exiting the Advertising Campaign Budget Management System. Goodbye! */
public class AdvertisingCampaignBudgetManagementSystem {
	public static void main(String[] args) {
		HashMap<Integer,Integer> campaigns = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		int campaignId;
		int budget;
		while(true) {
			System.out.println("1. Add Advertising Campaigns\n"+
							"2. Check if a Campaign Exists\n" +
							"3. Remove an Advertising Campaign\n"+
							"4. Display the Updated List of Advertising Campaigns\n"+
							"5. Calculate Average Campaign Budget\n"+
							"6. Exit the Program");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter campaign id: ");
				campaignId = sc.nextInt();
				if(campaigns.containsKey(campaignId)){
					System.out.println("Duplicate Campaign Id");
					break;
				}
				System.out.println("Enter budget: ");
				budget = sc.nextInt();
				campaigns.put(campaignId, budget);
				System.out.println("Campaigns added successfully.");
				break;
			case 2:
				System.out.println("Enter campaign id to check: ");
				campaignId = sc.nextInt();
				if(campaigns.containsKey(campaignId)){
					System.out.println("The campaign ID ["+campaignId+"] is present in the system. ");
					break;
				}
				System.out.println("The campaign ID ["+campaignId+"] is not present in the system. ");
				break;
			case 3:
				System.out.println("Enter campaign id to be removed: ");
				campaignId = sc.nextInt();
				if(campaigns.containsKey(campaignId)){
					campaigns.remove(campaignId);
					System.out.println("The campaign ID ["+campaignId+"] was removed from the system.");
					break;
				}
				System.out.println("The campaign ID ["+campaignId+"] was not found in the system.");
				break;
			case 4:
				if(campaigns.isEmpty()) {
					System.out.println("No campaigns available in the system.");
					break;
				}
				campaigns.forEach((K,V) -> System.out.println("Campaign ID: ["+K+"], Budget: ["+V+"]"));
				break;
			case 5:
				if(campaigns.isEmpty()) {
					System.out.println("No campaigns available to calculate the average budget.");
					break;
				}
				float total =0;
				for(Map.Entry<Integer,Integer> entry : campaigns.entrySet()) {
					total +=entry.getValue();
				}
				System.out.printf("Average Budget of All Campaigns: [%.2f]\n",(total/campaigns.size()));
				break;
			case 6:
				System.out.println("Advertising Campaign Budget Management System. Goodbye!");
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
