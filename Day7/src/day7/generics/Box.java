package day7.generics;

/*
1. Create a generic class Box<T> that can store and return an object of any type T. Implement methods:
	->void set(T item): To store an item.
	-> T get(): To retrieve the item.
	Example:
		Box<Integer> intBox = new Box<>();
		intBox.set(10);
		System.out.println(intBox.get()); // Output: 10
		Box<String> strBox = new Box<>();
		strBox.set("Hello");
		System.out.println(strBox.get()); // Output: Hello 
 */
public class Box<T> {
		T item; //parameterized type
		
		public Box() {
		}
		
		public Box(T item) {
			this.item = item;
		}
		
		public T get() {
			return item;
		}
		
		public void set(T item) {
			this.item = item;
		}
		
		public static void main(String[] args) {
			Box<Integer> item1 = new Box<Integer>();
			
			item1.set(60);
			System.out.println(item1.get());
			
			Box<String> item2 = new Box<String>();
			
			item2.set("Hello");
			System.out.println(item2.get());
		}

}
