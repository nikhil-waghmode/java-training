package day7.generics;
/*Define a generic interface MinMax<T> with methods:
 T min(T[] array): Returns the smallest element.
 T max(T[] array): Returns the largest element.
Implement this interface in a class and test it for an array of Integer. */
interface MinMax<T> {
	
	T min(T[] array);
	T max(T[] array);

}
