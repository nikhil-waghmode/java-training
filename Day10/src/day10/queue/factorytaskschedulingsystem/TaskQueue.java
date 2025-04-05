package day10.queue.factorytaskschedulingsystem;
import java.util.*;
public class TaskQueue {
	PriorityQueue<Task> tasks;
	
	public TaskQueue() {
		tasks = new PriorityQueue<Task>(Comparator.comparingInt(Task::getPriorityLevel).reversed());
	}
	Scanner sc = new Scanner(System.in);
	int taskId = 0;
	
	public void addTask() {
		Task task = new Task();
		task.acceptData();
		tasks.offer(task);
	}
	public void processTask() {
		Task task = new Task();
		if(tasks.isEmpty()) {
			System.out.println("No tasks to process.");
			return;
		}
		task = tasks.poll();
		System.out.println("Processing task: ["+task.getTaskName()+"] (ID: "
				+ "["+task.getTaskId()+"], Priority: ["+task.getPriorityLevel()+"])");
	}
	public void checkNextTask() {
		Task task = new Task();
		if(tasks.isEmpty()) {
			System.out.println("No tasks in the queue.");
			return;
		}
		task = tasks.peek();
		System.out.println("Next task: ["+task.getTaskName()+"] (ID: ["+task.getTaskId()+"], Priority: ["+task.getPriorityLevel()+"])");
	}
	public void displayPendingTasks() {
		
		if(tasks.isEmpty()) {
			System.out.println("No pending tasks.");
			return;
		}
		System.out.println("Pending Tasks:");
		for(Task t: tasks) {
			System.out.println("ID: "+t.getTaskId()+", Name: "+t.getTaskName()+", Priority: "+t.getPriorityLevel());
		}
	}
//	public void displayTasksbyPriority() {
//		
//		if(tasks.isEmpty()) {
//			System.out.println("No pending tasks.");
//			return;
//		}
//		System.out.println("Pending Tasks:");
//		for(Task t: tasks) {
//			System.out.println("ID: "+t.getTaskId()+", Name: "+t.getTaskName()+", Priority: "+t.getPriorityLevel());
//		}
//	}
	public void countPendingTasks() {
		
		if(tasks.isEmpty()) {
			System.out.println("No pending tasks.");
			return;
		}
		System.out.println("Total pending tasks: ["+tasks.size()+"]");
		
	}
}
