package day9.set.wildlifeconservationtrackingsystem;
import java.util.*;
public class WildlifeAnimalSet {
	HashSet<WildlifeAnimal> animals;
	public WildlifeAnimalSet() {
		animals = new LinkedHashSet<>();
	}
	Scanner sc = new Scanner(System.in);
	String str = new String();
	public void addAnimal() {
		WildlifeAnimal wa = new WildlifeAnimal();
		wa.acceptData();
		if(animals.add(wa)) {
			System.out.println("Animals added successfully");
			return;
		}
		System.out.println("Duplicate animalID are not added.");
	}
	public void checkAnimal() {
		System.out.println("Enter Animal id to check: ");
		str = sc.nextLine();
		for(WildlifeAnimal animal:animals) {
			if(animal.getAnimalID().equalsIgnoreCase(str)) {
				System.out.println("The animal with ID ["+str+"] is present in the HashSet.");
				return;
			}
		}
		System.out.println("The animal with ID ["+str+"] is not present in the HashSet.");
	}
	public void deleteAnimal() {
		System.out.println("Enter Animal id to check: ");
		str = sc.nextLine();
		boolean isRemoved = animals.removeIf((E)->E.getAnimalID().equalsIgnoreCase(str));
		if(isRemoved) {
			System.out.println("The animal with ID ["+str+"] was removed from the HashSet.");
			return;
		}
		System.out.println("The animal with ID ["+str+"] was not found in the HashSet.");
	}
	public void displayAnimals() {
		if(animals.isEmpty()) {
			System.out.println("No animals available.");
			return;
		}
		System.out.println(animals);
	}
	public void countAnimalsinHabitat() {
		int count =0;
		System.out.println("Enter Habitat to count: ");
		str = sc.nextLine();
		for(WildlifeAnimal animal:animals) {
			if(animal.getHabitatType().equalsIgnoreCase(str)) {
				count++;
			}
		}
		System.out.println("Number of animals in ["+str+"]: ["+count+"].");
	}
	
}
