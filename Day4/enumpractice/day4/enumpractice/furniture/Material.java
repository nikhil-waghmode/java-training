package day4.enumpractice.furniture;

import java.util.Scanner;

enum Material {
	IRON, STEEL, WOODEN; //Constants
	
	
	Material() { //ENUM CONSTRUCTOR DOESNT NEED PUBLIC KEYWORD. as objects of enums cant be created.
		
	}
	
	public static Material acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Material: ");
		String temp = sc.nextLine();
		if(temp.equalsIgnoreCase("iron")) {
			return IRON;
		}
		else if(temp.equalsIgnoreCase("steel")) {
			return STEEL;
		}
		else if(temp.equalsIgnoreCase("wooden")) {
			return WOODEN;
		}
		else {
			System.out.println("Unavailable Material");
			return null;
		}
		
	}
	
}
