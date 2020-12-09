package com.simplilearn.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestAllSets {

	public static void main(String[] args) {
		// Set is child interface in Collection
		// Set do not store duplicate values
		// Implementation class : HashSet , LinkendHashSet, TreeSet
				
		// 1. HashSet : uses hashcode of the object to store values
		// HashSet is backed by HashTable
		Set<String> listOfUniqueCompanies = new HashSet<>();
		
		boolean res1 = listOfUniqueCompanies.add("Dell");
		System.out.println(res1);
		listOfUniqueCompanies.add("ABC");
		listOfUniqueCompanies.add(null);
		listOfUniqueCompanies.add("Wipro");
		boolean res2 = listOfUniqueCompanies.add("Dell");
		System.out.println(res2);
		System.out.println(listOfUniqueCompanies);
		
		// LinkendSet : It stores unique elements 
		// and preserve insertion order.
		Set<String> listOfUniqueCities= new LinkedHashSet<>();		
		listOfUniqueCities.add("Hyderbad");
		listOfUniqueCities.add("Mumbai");		
		listOfUniqueCities.add("Hyderbad");
		listOfUniqueCities.add("Pune");
		
		System.out.println(listOfUniqueCities);
		
		// TreeSet child class for Set
		// Stores unique element
		// Order collection as asending ( sorted set)
		TreeSet<String> listOfUqniqueNames = new TreeSet<>();
		listOfUqniqueNames.add("John");
		listOfUqniqueNames.add("Mike");
		listOfUqniqueNames.add("Will");
		listOfUqniqueNames.add("Bryan");
		System.out.println(listOfUqniqueNames);
		
		System.out.println(listOfUqniqueNames.descendingSet());
		
	}

}
