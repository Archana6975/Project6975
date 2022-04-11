//Java program to implement queue interface in classes

package queuepack;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {

		// Using Priority Queue

		//PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		LinkedList <Integer> queue = new LinkedList<Integer>();
		
		
		  for (int i = 1; i <= 10; i++) {
		  
		  queue.add(i);
		  
		  }
		  
		  System.out.println("The Queue is :" + queue);
		  
		  // use offer method
		  
		  System.out.println("The Queue is :" + queue.offer(11));
		  System.out.println("The Queue is :" + queue);
		 

		// Head of Queue

	System.out.println("The Queue is :" + queue.element());// throw exception if queue empty

	System.out.println("The Queue method head using peek is :" + queue.peek()); // return null if queue empty

		System.out.println("The Queue Size before element remove is :" + queue.size());

		// Remove element from queue

		System.out.println("The Queue is :" + queue.remove()); // throw exception if queue empty

		System.out.println("The Queue is :" + queue.poll()); // return null if queue empty

		System.out.println("The Queue Size after element remove is :" + queue.size());

		System.out.println("The Final Queue is :" + queue);

	}

}
