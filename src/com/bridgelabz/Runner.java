package com.bridgelabz;

public class Runner {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(56);
		queue.enqueue(70);
		queue.enqueue(30);
		System.out.println("Array before dequeue");
		queue.show();
		queue.dequeue();
		System.out.println("Array after dequeue");
		queue.show();
	}
}
