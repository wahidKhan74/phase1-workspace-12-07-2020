package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListCollectionDemo {

	public static void main(String[] args) {
		// List  -> Order collection of data with duplicates elements
		
		// List -> interface  -> ArrayList, LinkedList , Vector , Stack
		
//		List<String> list1 = new ArrayList<>();
//		List<String> list2 = new LinkedList<>();
//		List<String> list3 = new Vector<>();
//		List<String> list4 = new Stack()<>();
		
		
		List<String> nameList = new ArrayList<>(); // create a arraylist
		nameList.add("Bob");
		nameList.add("Smith");
		nameList.add("John");
		nameList.add("Bob");
		nameList.add("Ajay");
		
		System.err.println(nameList);
		System.err.println(nameList.get(2));
		
		// List Traversing with Iterator		
		Iterator<String> itr= nameList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("----------------------");
		// Enhanced for Loop ( For each)		
		for(String name : nameList) {
			System.out.println(name);
		}

	}

}
