package day7.annotation;

import java.lang.reflect.*; 

public class Marker {
	@ImportantTask
	public static void getMeth() {
		Marker obj1 = new Marker(); 
		Class<?> c = obj1.getClass();
		try{
			Method m1 = c.getMethod("getMeth");
			if(m1.isAnnotationPresent(ImportantTask.class)) {
				System.out.println("Marker annotation is present");
			}
			else {
				System.out.println("Marker annotation is not present");
			}
		}
		catch(NoSuchMethodException exp) {
			System.out.println("No method found");
		}
	}
	public static void main(String[] args) {
		getMeth();
	}
}
