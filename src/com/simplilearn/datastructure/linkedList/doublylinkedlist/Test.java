package com.simplilearn.datastructure.linkedList.doublylinkedlist;


public class Test {

	public static void main(String[] args) {
		
		Employee johnSmith = new Employee(100, "John Smith", 100023.23);
		Employee marrySmith = new Employee(102, "Marry Smith", 1000456.23);
		Employee willClark = new Employee(101, "Will Clakk", 1000.23);
		Employee tonyStark = new Employee(102, "Tony Stark", 1000.23);
		Employee ironMan = new Employee(102, "Iron Man", 1000.23);
		
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		
		System.out.println("List Size : "+list.getSize());
		System.out.println("List Size : "+list.isEmpty());
		
		list.addToFront(willClark);
		list.addToFront(johnSmith);
		list.addToFront(marrySmith); // -> HEAD
		list.addToEnd(ironMan);	 // TAIL
		list.removeFromFront();
		list.removeFromEnd();
		
		System.out.println("List Size : "+list.getSize());
		System.out.println("List Size : "+list.isEmpty());
		
		list.printList();
		
		
		
	}

}
