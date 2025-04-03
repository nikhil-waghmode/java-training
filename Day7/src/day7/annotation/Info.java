package day7.annotation;

import java.lang.annotation.*;
/*
 * Part 3: Custom Annotation with Multiple Values
3. Define an annotation @Info with attributes version (double) and status (String).
o Apply it to a class and retrieve its values. */
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	double version();
	String status();
}

