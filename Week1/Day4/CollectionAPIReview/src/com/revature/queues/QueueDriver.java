package com.revature.queues;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDriver {
	
	/*
	 * Queues: 
	 * 	Are highly focused around the order. 
	 * 	Ordered list of objects related to insertion order 
	 * 	FIFO (First in First Out) and LILO (Last in Last out) principle. 
	 * 	Methods: 
	 * 		poll, remove, peek and element 
	 * 
	 *  Classes: 
	 *  	LinkedList: 
	 *  		(Also something to review)
	 *  	PriorityQueue:
	 *  		(modifies the default insertion order)
	 *  (or value order depending on child implementation)
	 */
	
	public static void main(String[] args) {
		
		Queue<String> stringQueue = new LinkedList<>();
		List<String> stringList = new LinkedList<>();
		
		stringQueue.add("Mercury");
		stringQueue.add("Mercury");
		stringQueue.add("Earth");
		stringQueue.add("Venus");
		
		System.out.println(stringQueue);
		
		stringList.addAll(stringQueue);
		System.out.println(stringList);
		
		System.out.println(stringList.get(0));
//		System.out.println(stringList.poll()); //Both are linked list , but it does not see itself as a queue!
		
//		System.out.println(stringQueue.get()); //we're not in a list! no positional access. 
		System.out.println(stringQueue.poll());
		
		System.out.println(stringQueue.poll());
		System.out.println(stringQueue.poll());
		System.out.println(stringQueue.poll());
		System.out.println(stringQueue);
		
		
	}

}
