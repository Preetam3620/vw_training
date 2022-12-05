package collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		// uses comparable interface compareTo method for priority
		
		q.offer(34);
		q.offer(56);
		q.offer(97);
		q.offer(15);
		q.offer(20);
		q.offer(97);
		
		System.out.println(q.peek()); // 1st element shown
		System.out.println("Size: "+q.size());
		
		System.out.println(q.poll()); // 1st element removed
		System.out.println("Size: "+ q.size());
		
		System.out.println(q.poll()); // 1st element removed
		System.out.println("Size: "+ q.size());
		
//		linkedlist implementation
		System.out.println("\nlinkedlist implementation");
		q = new LinkedList<Integer>();
		
		q.offer(34);
		q.offer(56);
		q.offer(97);
		q.offer(15);
		q.offer(20);
		q.offer(97);
		
		System.out.println(q.peek()); // 1st element shown
		System.out.println("Size: "+q.size());
		
		System.out.println(q.poll()); // 1st element removed
		System.out.println("Size: "+ q.size());
		
		System.out.println(q.poll()); // 1st element removed
		System.out.println("Size: "+ q.size());
	}
}
