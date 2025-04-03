package day7.annotation;
/*
 * Part 3: Custom Annotation with Multiple Values
3. Define an annotation @Info with attributes version (double) and status (String).
o Apply it to a class and retrieve its values. */
@Info(version=70, status = "in development")
public class CustomAnnotation {
	public static void main(String[] args) {
		CustomAnnotation obj1 = new CustomAnnotation(); //Object
		Class<?> c = obj1.getClass(); //Class
		Info myInfo = c.getAnnotation(Info.class); //annotation
		System.out.println(myInfo.version() + " " + myInfo.status()); //Supplements
	}
}
