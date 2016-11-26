package serie8.implementation234;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task implements Priority, Comparable<Task> {
	public static int taskCount = 0;
	private int priority;
	
	public Task(int priority){
		this.priority = priority;
		taskCount++;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public static int getTaskCount(){
		return taskCount;
	}

	public int getPriority() {
		return this.priority;
	}
	
	public int compareTo(Task t) {
		return this.priority - t.priority;
	}
	
	public static void main(String[] args) {
		Task t1 = new Task(3);
		Task t2 = new Task(4);
		Task t3 = new Task(9);
		
		/* Implementation 2 */
		System.out.println(t1.getPriority()); // 3
		t1.setPriority(12);
		System.out.println(t1.getPriority()); // 12
		System.out.println(Task.getTaskCount()); // 3
		
		/* Implementation 3 */
		System.out.println(t1.compareTo(t3)); // 12-9 = 3 // Ausgabe: 3
		t3.setPriority(12);
		System.out.println(t1.compareTo(t3)); // 12-12 = 0 // Ausgabe: 0
		
		/* Implementation 4 */
		ArrayList<Task> tasklist = new ArrayList<Task>();
		tasklist.addAll(Arrays.asList(t1, t2, t3, new Task(8), new Task(7), new Task(6)));
		
		for(int i=0;i<tasklist.size();i++)
		System.out.println("Task"+(i+1)+" Prio: "+tasklist.get(i).priority);
		
		Collections.sort(tasklist); System.out.println("---");
		
		for(int i=0;i<tasklist.size();i++)
		System.out.println("Task"+(i+1)+" Prio: "+tasklist.get(i).priority);
		
		/* 	Ausgabe
		  	Task1 Prio: 12
			Task2 Prio: 4
			Task3 Prio: 12
			Task4 Prio: 8
			Task5 Prio: 7
			Task6 Prio: 6
			---
			Task1 Prio: 4
			Task2 Prio: 6
			Task3 Prio: 7
			Task4 Prio: 8
			Task5 Prio: 12
			Task6 Prio: 12
		 */
	}
}
