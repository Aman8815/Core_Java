package com.rays.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue queue = new PriorityQueue();

		queue.add(400);
		queue.add(500);
		queue.add(100);
		queue.add(200);
		queue.add(300);
		queue.add(500);
		queue.add(400);
		queue.add(500);

		System.out.println(queue);

		for (int i = 0; i < 8; i++) {
			//System.out.println(queue.poll());
			System.out.println(queue.peek());
		}

		System.out.println(queue);
	}
}
