package com.simplilearn.datastructure.queue;

public class ArrayQueue {

	private int front;
	private int rear;
	
	private Employee[] queue;
	
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	// add
	public void add(Employee employee) {
		// queue is full
		if(rear == queue.length) {
			Employee[] newArr = new Employee[2*queue.length];
			System.arraycopy(queue, 0, newArr, 0, queue.length);
			queue = newArr;
		}
		// add values in array queue
		queue[rear++] = employee;
	}
	
	// remove
	public Employee remove() {
		if(size()==0) {
			System.out.println("Queue is empty ..");
			rear = 0;
			front = 0;
			return null;
		}
		Employee employee = queue[front];
		queue[front] = null;
		front ++;
		return employee;
	}
	
	//size
	public int size() {
		return rear-front;
	}
	
	// peek
	public Employee peek() {
		if(size()==0) {
			System.out.println("Queue is empty ..");
			rear = 0;
			front = 0;
			return null;
		}
		return queue[front];
	}
	
	//print Queue
	public void printQueue() {
		System.out.println("front ->");
		for (int i = front; i < rear; i++) {
			System.out.println(queue[i]);
		}
		System.out.println(" <- rear ");
	}
}
