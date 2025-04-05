package day10.queue.factorytaskschedulingsystem;

import java.util.Objects;
import java.util.Scanner;

public class Task {
	protected int taskId;
	protected String taskName;
	protected int priorityLevel;
	
	public Task() {
		
	}

	public Task(int taskId, String taskName, int priorityLevel) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.priorityLevel = priorityLevel;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(int priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(priorityLevel, taskId, taskName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return priorityLevel == other.priorityLevel && taskId == other.taskId
				&& Objects.equals(taskName, other.taskName);
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", priorityLevel=" + priorityLevel + "]";
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter taskID:");
		taskId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter taskName:");
		taskName =sc.nextLine();
		System.out.println("Enter priorityLevel:");
		priorityLevel = sc.nextInt();
		sc.nextLine();
	}
}
