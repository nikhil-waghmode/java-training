package day10.streamapi;
/**Section 2: Sorting and Aggregation (8 QuesƟons)
11. Sorting a List of Integers:
 Sort List<Integer> numbers = [9, 3, 6, 1, 8, 4] in ascending order and print them.
12. Sorting a List of Strings:
 Given List<String> words = ["banana", "apple", "cherry", "date"], sort them alphabetically.
13. Sorting Products by Price (Custom Class):
 Given a List<Product>, sort products by price in descending order and print them.
14. Find Maximum Price in Product List:
 Find and print the product with the highest price.
15. Find Minimum Price in Product List:
 Find and print the product with the lowest price.
16. Find Sum of All Prices in a List:
 Given List<Product> products, find the sum of all product prices using reduce().
17. Find Average Price of Products:
 Given a List<Product>, calculate and print the average price of products.
18. Find the Total Number of Products:
 Count the number of products using count() and print the result. 
 * */
/**Section 3: Grouping and Collecting Data (7 Questions)
19. Get Distinct Numbers from a List:
 Given List<Integer> numbers = [2, 4, 2, 6, 8, 4, 10, 8], remove duplicates and print the unique values.
20. Find the Top 3 Most Expensive Products:
 Given a List<Product>, find the three most expensive products using sorted() and limit().
21. Concatenate Product Names with Collectors.joining():

 Given List<Product>, concatenate product names into a single string separated by commas.
22. Convert Product List to Map:
 Convert a List<Product> into a Map<String, Double> where key = product name, value = product price.
23. Group Products Based on Price (Above or Below 500):
 ParƟƟon products into two lists: those above 500 and those 500 or cheaper.
24. Count Occurrences of Words in a List:
 Given List<String> words = ["apple", "banana", "apple", "orange", "banana", "apple"], count occurrences of
each word.
25. Count Even and Odd Numbers in a List:
 Given List<Integer> numbers = [10, 21, 34, 47, 56, 63, 78], count how many numbers are even and how many
are odd. 
 * */
import java.util.*;
import java.util.stream.*;
public class StreamAPIAdvanced {
	public static void main(String[] args) {
		//11
		List<Integer> numbers = List.of(9, 3, 6, 1, 8, 4);
		numbers.stream().sorted().forEach(e->System.out.print(e + " "));
		System.out.println();
		//12
		List<String> words = List.of("banana", "apple", "cherry", "date");
		words.stream().sorted().forEach(e->System.out.print(e + " "));
		System.out.println();
		
		
		List<Product> products = new ArrayList<>();
		Product p1 = new Product("Product 1", 4000);
		Product p2 = new Product("Product 2", 300);
		Product p3 = new Product("Product 3", 45000);
		Product p4 = new Product("Product 4", 7900);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		//13
		products.stream().sorted((a,b)->Double.compare(b.getPrice(), a.getPrice())).forEach(e->System.out.println(e)); 
		
		//14
		System.out.println(products.stream().max(Comparator.comparingDouble(e->e.getPrice())));
		
		//15
		System.out.println(products.stream().min(Comparator.comparingDouble(e->e.getPrice())));
		
		//16
		System.out.println(products.stream().map(e->e.getPrice()).reduce(0.0,(a,b)->a+b));
		
		//17
		System.out.println(products.stream().map(e->e.getPrice()).collect(Collectors.averagingDouble(e->e)));
		
		//18
		System.out.println(products.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())));
				
		//19
		
		
	}
}


