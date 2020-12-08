package com.simplilearn.mystatic;

public class StaticDemo {

	public static void main(String[] args) {
		// Access Static method and static variable by using class name.
		// Note : static members do not require object creation.
		System.out.println("My College : "+ Student.college);
		Student.showCollege();
		
		
		// Access Non static 
		Student s = new Student();
		
		System.out.println("=============");
		System.out.println("Roll No ::"+ s.rollno);
		s.display();
		

	}

}
