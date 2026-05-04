package com.collectionsframeworks.map;

import java.util.Collections;
import java.util.PriorityQueue;

public class TestQueueDemo2 {

	public static void main(String[] args) {

//		Queue<Integer> q = new PriorityQueue<>();//MinHeap

//		MaxHeap
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.offer(1);
		q.offer(2);
		

		System.out.println(q);

	}

}
