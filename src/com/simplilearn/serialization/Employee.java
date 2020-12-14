package com.simplilearn.serialization;

import java.io.Serializable;

public class Employee  implements Serializable{
	
	public int id;
	public String name;
	
	public Employee(){}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
