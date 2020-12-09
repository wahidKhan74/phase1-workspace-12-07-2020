package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestAllList {

	public static void main(String[] args) {
		// List for Companies names
		//Internally array list store data as dynamic array.
		List<String> listOfCompanies = new ArrayList<String>();
		listOfCompanies.add("DELL");
		listOfCompanies.add("Wipro");
		listOfCompanies.add("BOS");
		listOfCompanies.add("Wipro");
		
		System.out.println(listOfCompanies);
		System.out.println(listOfCompanies.get(1));
		listOfCompanies.set(1, "Simplilearn");
		System.out.println(listOfCompanies.get(1));
		System.out.println(listOfCompanies);
		
		//Vector -> Similar to Array -> internally store data as dynamic array.
		
		List<String> listOfCity = new Vector<String>();
		listOfCity.add("Mumbai");
		listOfCity.add("Pune");
		listOfCity.add("Hyderabad");
		listOfCity.add("Mumbai");
		System.out.println(listOfCity);
		System.out.println(listOfCity.get(1));
		
		
		//Linked List : linked list is backed by doubly linked list 
		
		List<String> listOfFruits = new LinkedList<String>();
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Banana");
		listOfFruits.add("Apple");
		System.out.println(listOfFruits);
		System.out.println(listOfFruits.get(1));
		
		listOfFruits.set(0, "Kiwi");
		System.out.println(listOfFruits);
		

	}

}
