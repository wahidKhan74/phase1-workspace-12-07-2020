package com.simplilearn.collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestAllMap {

	public static void main(String[] args) {
		// Map is a key value paired collection
		// Implementation class : HashMap, HashTable, TreeMap
		
		// create a phonebook
		
		Map<String, String> phonebook =  new HashMap<String,String>();
		
		phonebook.put("Mike", "9966996699");
		phonebook.put("John", "9966996699");
		phonebook.put("William", "9966996697");
		phonebook.put("Amit", "9966996696");
		phonebook.put("Vijay", "9966996695");
		phonebook.put(null, "9966996694");
		
		System.out.println(phonebook);
		System.out.println(phonebook.get("John"));
		phonebook.remove("Amit");
		
		// Iterating over map ->  1. fetch all keys  2. use keys to access
		Set<String> allkeys = phonebook.keySet();
		System.out.println(allkeys);
		for(String key : allkeys) {
			System.out.println(key +" :-> "+phonebook.get(key));
		}

		
		Map<String, Double>  listOfItems = new Hashtable<String, Double>();
		listOfItems.put("apple", 44.5);
		listOfItems.put("orange", 54.5);
		listOfItems.put("banana", 14.5);
		listOfItems.put("grapes", 74.5);
		listOfItems.put("kiwi", 44.5);		
		System.out.println(listOfItems);
		
		
		Map<Integer, String> listOfEmployee = new TreeMap<Integer,String>();
		listOfEmployee.put(101,"Mike");
		listOfEmployee.put(102,"John");
		listOfEmployee.put(103,"William");
		listOfEmployee.put(104,"Vijay");
		listOfEmployee.put(105,"Marry");
		
		System.out.println(listOfEmployee);
		for(Map.Entry<Integer, String> emp : listOfEmployee.entrySet()) {
			System.out.println(emp.getKey() +" :=> "+emp.getValue());
		}
		
		
		
		
	}

}
