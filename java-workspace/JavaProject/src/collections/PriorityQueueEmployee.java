package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import classImplementation.Employee;

public class PriorityQueueEmployee {
	public static void main(String[] args) {
		System.out.println("\nPriority Queue Implementation");
		Queue<Employee> queEmp = new PriorityQueue<Employee>();
		
		Employee e1 = new Employee(5, "Preetam", 25000, 20);
		Employee e2 = new Employee(8, "Alan", 15000, 80);
		Employee e3 = new Employee(2, "Tony", 55000, 30);

		// uses overriden compareTo() in Employee class
		queEmp.offer(e1);
		queEmp.offer(e2);
		queEmp.offer(e3);

		System.out.println(queEmp);
		System.out.println("Size: "+queEmp.size());
		System.out.println(queEmp.poll()); // 1st element shown sorted by empId
		System.out.println("Size: "+ queEmp.size());
		System.out.println(queEmp.peek()); // 1st element removed sorted by empId
		
		
		System.out.println("\nLinkedlist implementation");
		queEmp = new LinkedList<Employee>();
		
		// unsorted storage in linkedlist
		queEmp.offer(e1);
		queEmp.offer(e2);
		queEmp.offer(e3);
		
		System.out.println(queEmp);
		System.out.println("Size: "+queEmp.size());
		System.out.println(queEmp.poll()); // 1st element shown
		System.out.println("Size: "+ queEmp.size());
		System.out.println(queEmp.peek()); // 1st element removed 
		
		
	}
}
