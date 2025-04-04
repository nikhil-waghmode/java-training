package day9.set.wildlifeconservationtrackingsystem;

import java.util.*;

public class WildlifeAnimal {
	protected String animalID;
	protected String speciesName;
	protected String habitatType;
	
	public WildlifeAnimal() {
		
	}
	public WildlifeAnimal(String animalID, String speciesName, String habitatType) {
		this.animalID= animalID;
		this.speciesName=speciesName;
		this.habitatType=habitatType;
	}
	public String getAnimalID() {
		return animalID;
	}
	public void setAnimalID(String animalID) {
		this.animalID= animalID;
	}
	public String getSpeciesName() {
		return speciesName;
	}
	public void setSpeciesName(String speciesName) {
		 this.speciesName=speciesName;
	}
	public String getHabitatType() {
		return habitatType;
	}
	public void setHabitatType(String habitatType) {
		this.habitatType= habitatType;
	}
	
	@Override
	public String toString() {
		return "WildlifeAnimal [animalID: "+animalID+", speciesName: "+speciesName+", habitatType: "+habitatType+"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(animalID,speciesName,habitatType);
	}
	@Override
	public boolean equals(Object ob) {
		if(ob instanceof WildlifeAnimal && ob!=null) {
			WildlifeAnimal wa = (WildlifeAnimal) ob;
			if(animalID.equals(wa.animalID) || speciesName.equals(wa.speciesName) || habitatType.equals(wa.habitatType)) {
				return true;
			}
		}
		return false;
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter animalID: ");
		animalID = sc.nextLine();
		System.out.println("Enter speciesName: ");
		speciesName = sc.nextLine();
		System.out.println("Enter habitatType: ");
		habitatType = sc.nextLine();
	}
}
