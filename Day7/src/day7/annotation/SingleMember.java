package day7.annotation;
/*
 * Part 2: Single-Member Annotation
2. Create a single-member annotation @Author that takes a String value (author’s name).
o Apply it to a class and display the author name using reflection. */

@Author("John Smith") //overrides default annotation value.
//shortcut for @Author(value ="John Smith").

public class SingleMember {
	
	public static void main(String[] args) {
		SingleMember obj1 = new SingleMember();
		Author author = obj1.getClass().getAnnotation(Author.class);
		System.out.println("Author: " + author.value());
	}
}
