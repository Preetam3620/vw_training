package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueAccount {

	public static void main(String[] args) {
		Account ac1 = new Account("Prateek Kuhad", 1001, 2000);
		Account ac2 = new Account("Tony Stark", 1005, 8000);
		Account ac3 = new Account("Steve Rogers", 1002, 4000);
		Account ac4 = new Account("Bruce Banner", 1009, 1000);

		System.out.println("\nPriority Queue Implementation");
		Queue<Account> queAcc = new PriorityQueue<Account>();
		
		// uses overriden compareTo() in Employee class
		queAcc.offer(ac3);
		queAcc.offer(ac2);
		queAcc.offer(ac1);
		queAcc.offer(ac4);
		
		System.out.println(queAcc);
		System.out.println("Size: "+queAcc.size());
		System.out.println(queAcc.poll()); // 1st element shown sorted by empId
		System.out.println("Size: "+ queAcc.size());
		System.out.println(queAcc.peek()); // 1st element removed sorted by empId
		
		System.out.println("\nLinkedlist implementation");
		queAcc = new LinkedList<Account>();
		
		// unsorted storage in linkedlist
		queAcc.offer(ac1);
		queAcc.offer(ac2);
		queAcc.offer(ac3);
		queAcc.offer(ac4);
		
		System.out.println(queAcc);
		System.out.println("Size: "+queAcc.size());
		System.out.println(queAcc.poll()); // 1st element shown
		System.out.println("Size: "+ queAcc.size());
		System.out.println(queAcc.peek()); // 1st element removed 
		
	}

}
