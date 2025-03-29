package day4.enumpractice.house;

import java.util.Scanner;

public enum House {
	PALASH("orange"), GULMOHAR("red"), KACHNAR("purple"), AMALTAS("yellow");
	
	House(String color){
		this.color = color;
	}
	String color;
	public String getColor() {
		return color;
	}
	public static House acceptHouse() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if (str.equalsIgnoreCase("PALASH")) {
			return PALASH;
		}
		else if (str.equalsIgnoreCase("PALASH")) {
			return GULMOHAR;
		}
		else if (str.equalsIgnoreCase("PALASH")) {
			return KACHNAR;
		}
		else{
			return AMALTAS;
		}
	}
}