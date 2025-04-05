package day10.queue.factorytaskschedulingsystem;
import java.util.*;
public class FactoryTaskSchedulingSystem {
	public static void main(String[] args) {
		TaskQueue tq = new TaskQueue();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add a Task\n"+
							"2. Process a Task (Dequeue)\n"+
							"3. Peek at the Next Task\n"+
							"4. Display All Pending Tasks\n"+
							"5. Count Total Pending Tasks\n" +
							"6. Exit the Program");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				tq.addTask();
				break;
			case 2:
				tq.processTask();
				break;
			case 3:
				tq.checkNextTask();
				break;
			case 4:
				tq.displayPendingTasks();
				break;
			case 5:
				tq.countPendingTasks();
				break;
			case 6:
				System.out.println("Exitng the Factory Task Scheduling System. Goodbye!");
				System.exit(0);
				sc.close();
			default:
				System.out.println("Invalid option.");
			}
		}
	}
}
