package com.simplilearn.collections.map;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTestMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
		employeeMap.put(101, new Employee(101,"John Smith",329244));
		employeeMap.put(102, new Employee(102,"May Smith",322));
		employeeMap.put(103, new Employee(103,"Ab Joe",3435));
		employeeMap.put(104, new Employee(104,"BOb Smith",879789));
		employeeMap.put(105, new Employee(105,"David Smith",8789));
		
		System.out.println(employeeMap);
		
		for(Map.Entry<Integer, Employee> emp : employeeMap.entrySet()) {
			System.out.println(emp.getKey()+ ": -> "+emp.getValue().name +": -> "+emp.getValue().salary);
			
		}

	}

}
