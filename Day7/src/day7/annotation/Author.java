package day7.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * Part 2: Single-Member Annotation
2. Create a single-member annotation @Author that takes a String value (author’s name).
o Apply it to a class and display the author name using reflection. */
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
	String value() default "John Doe";
}
