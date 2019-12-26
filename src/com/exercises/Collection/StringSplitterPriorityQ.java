package com.exercises.Collection;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class QueueDemo{
	
	public static void PrintQueue(Queue queue){
		while (queue.peek() != null){
			System.out.println(queue.poll());
		}
	}
}


public class StringSplitterPriorityQ {
	
	public static void main(String[] args){
		String stream = "keerthana, sanjana, kishan, nirmala";
		PriorityQueue<String> pq = new PriorityQueue<String>(Arrays.asList(stream.split(" ")));
		
		QueueDemo.PrintQueue(pq);
		
		PriorityQueue<Integer> pqint = new PriorityQueue<>();
		pqint.offer(100);
		pqint.offer(30);
		pqint.offer(1001);
		pqint.offer(20);
		pqint.offer(300);
		pqint.offer(400);
		
		QueueDemo.PrintQueue(pqint);
		}
		
	}
