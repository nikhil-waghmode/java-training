package day7.generics.assignment;
/*
 1. Generic Class Implementation:
Create a generic class `Container` that can store an item of any type. Implement methods to get and set the item, and
demonstrate usage with different types. 
 */
public class Container<T> {
	T item;
	public Container() {
		
	}
	public Container(T item) {
		this.item = item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
	public static void main(String[] args) {
		Container<Byte> obj1 = new Container<>((byte)127);
		
		obj1.setItem((byte) 122);
		System.out.println(obj1.getItem());
		
		Container<String> obj2 = new Container<>("hELLO");
		
		System.out.println(obj2.getItem());
		
	}

}
