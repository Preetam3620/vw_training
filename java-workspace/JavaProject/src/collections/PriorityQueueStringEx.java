package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueStringEx {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<String>();
		// uses comparable interface compareTo method for priority
		
		q.offer("Preetam");
		q.offer("Rohan");
		q.offer("Umesh");
		q.offer("Atharva");
		q.offer("Aniket");
		q.offer("Preetam");
		
		System.out.println(q);
		System.out.println(q.peek()); // 1st element shown
		System.out.println("Size: "+q.size());
		
		System.out.println(q.poll()); // 1st element removed
		System.out.println("Size: "+ q.size());
		
		System.out.println(q.poll()); // 1st element removed
		System.out.println("Size: "+ q.size());
		
//		linkedlist implementation
		System.out.println("\nlinkedlist implementation");
		q = new LinkedList<String>();
		
		q.offer("Preetam");
		q.offer("Rohan");
		q.offer("Umesh");
		q.offer("Atharva");
		q.offer("Aniket");
		q.offer("Preetam");
		
		System.out.println(q);
		System.out.println(q.peek()); // 1st element shown
		System.out.println("Size: "+q.size());
		
		System.out.println(q.poll()); // 1st element removed
		System.out.println("Size: "+ q.size());
		
		System.out.println(q.poll()); // 1st element removed
		System.out.println("Size: "+ q.size());
	}
}
