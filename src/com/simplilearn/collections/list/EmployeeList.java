package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> listOfEmployees = new ArrayList<Employee>();

		Employee emp1 = new Employee(101, "John Smith", 12923);
		Employee emp2 = new Employee(102, "Marry Smith", 52923);
		Employee emp3 = new Employee(103, "David Smith", 7023);
		Employee emp4 = new Employee(104, "Bob Smith", 4423);

		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		listOfEmployees.add(emp4);

		System.out.println(listOfEmployees);

		System.out.println("Id :" + listOfEmployees.get(0).id);
		System.out.println("Name :" + listOfEmployees.get(0).name);
		System.out.println("Salary :" + listOfEmployees.get(0).salary);
		System.out.println("By Iterator ----------------");
		
		// List Traversing with Iterator
		Iterator<Employee> itr = listOfEmployees.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println("Id :" + emp.id);
			System.out.println("Name :" + emp.name);
			System.out.println("Salary :" + emp.salary);
		}
		
		System.out.println("By For Loop----------------");
		for(Employee emp : listOfEmployees) {
			System.out.println("Id :" + emp.id);
			System.out.println("Name :" + emp.name);
			System.out.println("Salary :" + emp.salary);
		}

	}

}
