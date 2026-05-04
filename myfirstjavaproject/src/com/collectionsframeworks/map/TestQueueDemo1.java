package com.collectionsframeworks.map;

import java.util.LinkedList;
import java.util.Queue;

//Queue is following FIFO
public class TestQueueDemo1 {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();

//		q.offer(100);
//		q.offer(200);
//		q.offer(400);
//		q.offer(300);
//		q.offer(500);

		System.out.println(q.peek());//100
		System.out.println(q.poll());//100
		System.out.println(q);

//		// throwing an IllegalStateException if no space is currently available.
//		// if the queue is empty and we try to call remove or element method we will get
//		// NoSuchElementException
//		q.add(10);
//		q.add(5);
//		q.add(15);
//		q.add(50);
//		q.add(25);
//		q.add(18);
//
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.element());
//		System.out.println(q);

	}

}
