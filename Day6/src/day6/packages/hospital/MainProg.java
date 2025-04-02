package day6.packages.hospital;

import day6.packages.hospital.patients.Abc;
import day6.packages.hospital.staff.Xyz;
import day6.packages.hospital.staff.regular.Efg;
import day6.packages.hospital.staff.visiting.Lmn;
/* Create the following package hierarchy and perform the following operations:
a. Write main function within MainProg that creates object of Abc, Xyz, Efg, and Lmn. Compile and Interpret
it.
b. Write main functions within Xyz that created objects of Lmn and Efg. Compiles and Interpret it. */
public class MainProg {
	public static void main(String args[]) {
		Abc abc = new Abc();
		Xyz xyz = new Xyz();
		Efg efg = new Efg();
		Lmn lmn = new Lmn();
	}
}
