package day4.enumpractice.furniture;

import java.util.Scanner;

enum FurnitureType {
	CHAIR, TABLE, BED; //Constants are always declared on first line
	
	public static FurnitureType acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Type: ");
		String temp = sc.nextLine();
		if(temp.equalsIgnoreCase("chair")) {
			return CHAIR;
		}
		else if(temp.equalsIgnoreCase("table")) {
			return TABLE;
		}
		else if(temp.equalsIgnoreCase("bed")) {
			return BED;
		}
		else {
			System.out.println("Unavailable type");
			return null;
		}
		
	}
}
