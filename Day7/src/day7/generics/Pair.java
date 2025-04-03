package day7.generics;
/*
 Create a generic class Pair<K, V> that stores a key-value pair of any type. Implement methods:
 K getKey(): Returns the key.
 V getValue(): Returns the value.
Example:
Pair<String, Integer> student = new Pair<>("Alice", 90);
System.out.println(student.getKey()); // Output: Alice
System.out.println(student.getValue()); // Output: 90
Pair<Integer, String> idToName = new Pair<>(101, "John");
System.out.println(idToName.getKey()); // Output: 101
System.out.println(idToName.getValue()); // Output: John
*/
public class Pair<K,V> {
	K key;
	V value;
	
	public Pair(){
		
	}
	public Pair(K key,V value){
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
//		Pair<Integer, String> pair1 = new Pair<>(12,"Twelve");
//		System.out.println(pair1.getValue());
		
		Pair<String, Integer> student = new Pair<>("Alice", 90);
		System.out.println(student.getKey()); // Output: Alice
		System.out.println(student.getValue()); // Output: 90
		Pair<Integer, String> idToName = new Pair<>(101, "John");
		System.out.println(idToName.getKey()); // Output: 101
		System.out.println(idToName.getValue()); // Output: John
	}
}
