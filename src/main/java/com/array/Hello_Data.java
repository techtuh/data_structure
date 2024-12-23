package com.array;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import org.testng.annotations.Test;

public class Hello_Data {
	
	@Test(enabled=false)
	public void hello() {
		//Data structure: a named location that can be used to store and organized data
		//Algorithm: a collection of steps to solve a problem 
		//linear search: search data one by one
		System.out.println("hello array");
	}
	
	@Test(enabled=false)
	public void stack() {
		// LIFO,store vertically, push() to add , pop() to remove, peak() 
		//search top 
		Stack stack = new Stack();
		stack.push("pen");
		stack.push("pencile");
		stack.add(1);
		stack.pop();//remove
		stack.peek();//search top item
		System.out.println(stack.peek());
	for(int i=0; i<stack.size();i++) {
		System.out.println(stack);
	}
	}

	@Test(enabled=false)
	public void Queues() {
	
		//FIFO, enqueue==offer(add), dequeue==poll(remove)
		
		 Queue  qu = new LinkedList<>();
		 qu.offer(1);
		 qu.offer(2);
		 qu.offer(3);
		 qu.poll();
		 qu.offer(1);
		 
		 System.out.println(qu);
		 
	}
	
	@Test
	public void priorityQ() {
		
		//Queue<Double> gpa = new LinkedList();//generalQ FIFO
		//Queue<Double> gpa = new PriorityQueue();// priorityQ
		Queue<Double> gpa = new PriorityQueue<>(Collections.reverseOrder());// priorityQ
		
		
		gpa.offer(4.0);
		gpa.offer(3.7);
		gpa.offer(2.5);
		gpa.offer(3.5);
		gpa.forEach((n)->{System.out.println(n);});
		System.out.println(gpa);
		
		int[] num = { 1,3 ,5, 6,8};
		for(int i=0; i<=num.length;i++) {
			
			
			if(i==2) {
				
				System.out.println("/");
				continue;
			}
			
			System.out.println(num[i]);
		}
		
	}
}
