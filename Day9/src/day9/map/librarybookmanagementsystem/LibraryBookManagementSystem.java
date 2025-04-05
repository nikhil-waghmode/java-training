package day9.map.librarybookmanagementsystem;
import java.util.*;
public class LibraryBookManagementSystem {
	public static void main(String[] args) {
		BookMap bookMap = new BookMap();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add New Books\n"+
							"2. Check if a Book Exists\n"+
						"3. Remove a Book from the Library\n"+
							"4. Update Book Price\n"+
						"5. Display All Books\n"+
							"6. Find the Most Expensive Book\n"+
						"7. Exit the Program");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1: 
				bookMap.addBook();
				break;
			case 2:
				bookMap.checkBook();
				break;
			case 3:
				bookMap.removeBook();
				break;
			case 4:
				bookMap.updatePrice();
				break;
			case 5:
				bookMap.displayBooks();
				break;
			case 6:
				bookMap.mostExpensiveBook();
				break;
			case 7:
				System.out.println("Exiting the Library Book Management System. Goodbye!");
				System.exit(0);
				sc.close();
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		
	}
}
