package Collections;

import java.util.Queue;
import java.util.PriorityQueue;

public class TestQueue{
	public static void main(String[] args) {
		Queue<String> priorityQueue = new PriorityQueue<String>(3);
		
		priorityQueue.add("India");
		priorityQueue.add("Germany");
		priorityQueue.add("England");
		
		//priority queue sorts in ascending order of the alphabets but
		//println or print can't do the sorting so it displays in random order due to .toString conversion internally happening
		// priority queue working could be verified using other methods like remove,peek
		System.out.println(priorityQueue);
		
		// removes the head element but does not return anything
		priorityQueue.remove();
		System.out.println(priorityQueue);
		
		//shows the head element
		System.out.println(priorityQueue.peek());
		
		//removes as well as returns the head element from the queue
		System.out.println(priorityQueue.poll());
		
		System.out.println(priorityQueue);
	}
}