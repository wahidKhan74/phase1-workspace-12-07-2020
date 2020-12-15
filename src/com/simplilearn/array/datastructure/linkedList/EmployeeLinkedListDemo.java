package com.simplilearn.array.datastructure.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeLinkedListDemo {
	
	public static void main(String[] args) {
		Employee johnSmith = new Employee(100, "John Smith", 100023.23);
		Employee marrySmith = new Employee(102, "Marry Smith", 1000456.23);
		Employee willClark = new Employee(101, "Will Clakk", 1000.23);
		Employee tonyStark = new Employee(102, "Tony Stark", 1000.23);
		Employee ironMan = new Employee(102, "Iron Man", 1000.23);
		
		LinkedList<Employee> empList = new LinkedList<Employee>();
		empList.add(johnSmith);
		empList.add(marrySmith);
		
		empList.addFirst(willClark);
		empList.addLast(tonyStark);
		empList.add(2, ironMan);
		
//		empList.removeLast();
//		empList.removeFirst();
		
		System.out.println("Head => ");
		for(Employee emp : empList) {
			System.out.println("Employee id : "+emp.id + " with name : "
					+emp.name +" with salary : "+emp.salary );
			System.out.println("<=>");
		}
		System.out.println("<= Tail");
	}
}
