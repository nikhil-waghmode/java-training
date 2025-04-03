package day7.annotation;

import java.lang.annotation.*;

/*
 * Part 1: Marker Annotation
1. Create a marker annotation @ImportantTask and apply it to a method in a class.
 	Write a program to check if the method has this annotation using reflection. */
@Retention(RetentionPolicy.RUNTIME)
@interface ImportantTask {
}
