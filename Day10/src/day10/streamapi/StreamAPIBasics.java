package day10.streamapi;

import java.util.*;
import java.util.stream.*;
/**
 * Section 1: Basic Stream OperaƟons (10 QuesƟons)
1. Stream from an Array:
o Convert an array of integers {5, 10, 15, 20, 25} into a stream and print all elements.
2. Stream from a List:
o Convert a List<String> containing names ["Alice", "Bob", "Charlie", "David"] into a stream and print
each name in uppercase.
3. Stream from a Set:
o Convert a Set<Integer> {3, 6, 9, 12, 15} into a stream and print all elements.
4. Stream from a Map (Keys):
o Create a Map<Integer, String> with student IDs and names. Convert the keys to a stream and print
them.
5. Stream from a Map (Values):
o From the same map, extract and print all student names using a stream.
6. Filtering a List:
o Given List<Integer> numbers = [12, 45, 67, 89, 23, 56, 78], filter out numbers greater than 50 and
print them.
7. Filtering a List of Strings:
o Given List<String> names = ["Mike", "Michael", "John", "Jonathan", "Mona"], filter and print names
starƟng with "M".
8. Filtering Products (Custom Class):
o Given a List<Product> (with name and price fields), filter and print products that cost more than 500.
9. Mapping Data:
o Convert a list of lowercase words ["java", "streams", "lambda"] to uppercase using map() and print
them.
10. Mapping Product Names:
 Given a List<Product>, extract only product names and print them. */

public class StreamAPIBasics {
	public static void main(String[] args) {
		/**1. Stream from an Array:
			o Convert an array of integers {5, 10, 15, 20, 25} into a stream and print all elements.
			*/
		 Integer[] numbers= {5, 10, 15, 20, 25};
		 Stream<Integer> stream1 = Arrays.stream(numbers); 	//arrays to stream 1
		 stream1.forEach(System.out::println);      		//Printing method 1
		 Stream<Integer> stream2 = Stream.of(numbers); 		//arrays to stream 2
		 stream2.forEach(n->System.out.print(n+ " "));		//Printing method 2
		 System.out.println();
		 
		 /**2. Stream from a List:
			o Convert a List<String> containing names ["Alice", "Bob", "Charlie", "David"] into a stream and print each name in uppercase.
			*/
		 List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		 
		 List<String> upperCaseNames= names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		 System.out.println(upperCaseNames);
		 System.out.println();
		 
		/**3. Stream from a Set:
			o Convert a Set<Integer> {3, 6, 9, 12, 15} into a stream and print all elements.
			*/
		 Set<Integer> set = new HashSet<>(Set.of(3, 6, 9, 12, 15));
		 set.stream().forEach(System.out::println);
		 
		 /**4. Stream from a Map (Keys):
			o Create a Map<Integer, String> with student IDs and names. Convert the keys to a stream and print them.
			*/
		 System.out.println();
		 Map<Integer, String> student = new HashMap<>();
		 student.put(1, "abc");
		 student.put(2, "xyz");
		 student.put(3, "pqr");
//		 List<Integer> keys = student.keySet().stream().collect(Collectors.toList()) 
		 System.out.println(student.keySet().stream().collect(Collectors.toList()));
		 
		 /**5. Stream from a Map (Values):
			o From the same map, extract and print all student names using a stream.
			*/
		 System.out.println();
		 System.out.println(student.values().stream().collect(Collectors.toList()));
		 /**6. Filtering a List:
			o Given List<Integer> numbers = [12, 45, 67, 89, 23, 56, 78], filter out numbers greater than 50 and
			print them.*/
		 System.out.println();
		 List<Integer> numbers1 = Arrays.asList(12, 45, 67, 89, 23, 56, 78);
		 System.out.println(numbers1.stream().filter(e->e>50).collect(Collectors.toList()));
		 /**7. Filtering a List of Strings:
			o Given List<String> names = ["Mike", "Michael", "John", "Jonathan", "Mona"], filter and print names
			staring with "M".*/
		 List<String> names1 = List.of("Mike", "Michael", "John", "Jonathan", "Mona");
		 System.out.println(names1.stream().filter(e->e.startsWith("M")).collect(Collectors.toList()));
		 /**8. Filtering Products (Custom Class):
			o Given a List<Product> (with name and price fields), filter and print products that cost more than 500.*/
		 Product p1 = new Product("Product 1", 4000);
		 Product p2 = new Product("Product 2", 300);
		 Product p3 = new Product("Product 3", 5000);
		 List<Product> products = new ArrayList<>();
		 products.add(p1);
		 products.add(p2);
		 products.add(p3);
		 System.out.println(products.stream().filter(e->e.getPrice()>500).collect(Collectors.toList()));
		 /**9. Mapping Data:
			o Convert a list of lowercase words ["java", "streams", "lambda"] to uppercase using map() and print them.
		  */
		 List<String> words = List.of("java", "streams", "lambda");
		 List<String> updatedWords = words.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		 System.out.println(updatedWords);
		 /**10. Mapping Product Names:
 			o Given a List<Product>, extract only product names and print them.*/
//		 System.out.println(products.stream().map(e->e.name).collect(Collectors.toList()));
		 products.stream().map(e->e.name).forEach(System.out::println); //alternate method to print.
		 
	}
}
class Product{
	protected String name;
	protected double price;
	Product(String name, double price){
		this.name=name;
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name +" : "+ price+" ";
	}
}
