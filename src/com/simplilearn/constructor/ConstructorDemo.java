package com.simplilearn.constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		
//		Employee emp = new Employee();
//		emp.id = 101;
//		emp.name =" John Smith";
//		Employee emp = new Employee(101);
//		Employee emp = new Employee("John Smith");
		Employee emp = new Employee(101,"John Smith");
		emp.showEmployee();

	}

}


class Employee{
	
	int id;
	String name;
	
	void showEmployee() {
		System.out.println("Employee with id :"+ id +" and name : "+ name);
	}
	
	public Employee() {}
	
//	constructor overloading
	public Employee(int id) {
		this.id = id;
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(int id , String name) {
		this.id = id;
		this.name = name;
	}
}