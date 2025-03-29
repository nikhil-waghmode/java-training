package day4.enumpractice.furniture;

import java.util.Scanner;

public class Furniture {
	protected String modelNo;
	protected String modelName;
	protected String modelDescription;
	Material material;
	FurnitureType type;
	
	public Furniture() {
		
	}
	
	public Furniture(String modelNo, String modelName, String modelDescription,Material material, FurnitureType type ) {
		this.modelNo = modelNo;
		this.modelName = modelName;
		this.modelDescription = modelDescription;
		this.material = material;
		this.type = type;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelDescription() {
		return modelDescription;
	}

	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterials(Material material) {
		this.material = material;
	}

	public FurnitureType getType() {
		return type;
	}

	public void setType(FurnitureType type) {
		this.type = type;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Model No: ");
		this.modelNo = sc.nextLine();
		System.out.println("Enter Model Name: ");
		this.modelName = sc.nextLine();
		System.out.println("Enter Model Description");
		this.modelDescription = sc.nextLine();
//		sc.close();
		material=Material.acceptData();
		type=FurnitureType.acceptData();
	}
	
	public void showData() {
		System.out.println("Model No: "+ modelNo);
		System.out.println("Model Name: "+ modelName);
		System.out.println("Model Description: " +modelDescription);
		System.out.println("Material: "+ material);
		System.out.println("Type: " + type);
		
	}
	public static void main(String args[]) {
//		Furniture f1 = new Furniture("number","name","descirption",Material.material,FurnitureType.type);
		Furniture f1 = new Furniture();
		f1.acceptData();
		f1.showData(); 
	}
	
	
}
