package com.simplilearn.datastructure.linkedList.circularlinkedlist;

public class EmployeeCircularLinkedList {

	private EmployeeNode head;
	private int size;
	private EmployeeNode tail;
	
	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}
	
	public void addToFront(Employee employee){
		//create a node
		EmployeeNode node = new EmployeeNode(employee);
		if(head ==null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
		}
		tail = node;
		tail.setNext(head);
		size ++;
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public void printList() {
		EmployeeNode current = head;
		if(current ==null) {
			System.out.println("Circular Linked List is empty");
		}else {
			System.out.print("Head -> ");
			do {
				if(current !=null) {
					System.out.print("->" + current.getData());
					current = current.getNext();
				}
				
			}
			while(current !=head);
		}
		
	}
}
