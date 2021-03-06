package com.simplilearn.datastructure.linkedList.doublylinkedlist;

public class EmployeeDoublyLinkedList {

	private EmployeeNode tail;
	private EmployeeNode head;
	private int size;

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}
	/**
	 *  Add element in the beginning.
	 * @param employee
	 */
	public void addToFront(Employee employee) {

		EmployeeNode node = new EmployeeNode(employee);
		// verify list is empty.
		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}
		head = node;
		size++;
	}
	
	/**
	 * Add element in the last.
	 * @param employee
	 */
	public void addToEnd(Employee employee) {

		EmployeeNode node = new EmployeeNode(employee);
		// verify list is empty.
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}

	/**
	 * Remove element from front
	 * @return
	 */
	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		
		if(head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	/**
	 * Remove element from last.
	 * @return
	 */
	public EmployeeNode removeFromEnd() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = tail;
		
		if(tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("Head -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print("<->");
			current = current.getNext();
		}
		System.out.println("null");
	}
}
