package day6.packages.hospital.staff;

import day6.packages.hospital.staff.regular.Efg;
import day6.packages.hospital.staff.visiting.Lmn;

public class Xyz {
	public Xyz(){
		System.out.println("Xyz constructor called.");
		
	}
	public static void main(String args[]) {
		Lmn lmn = new Lmn();
		Efg efg = new Efg();
	}
	
}
