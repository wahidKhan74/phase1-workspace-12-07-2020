package com.simplilearn.datastructure.linkedList;

import java.util.LinkedList;
import java.util.List;

public class IntegerLinkedListTest {

	public static void main(String[] args) {
		
		List<Integer> numberlist = new LinkedList<>();
		
		numberlist.add(10);
		numberlist.add(50);
		numberlist.add(40);		
		numberlist.add(60);
		numberlist.add(10);
		numberlist.add(2, 22);
		
//		numberlist.set(1, 33);
		
		for(Integer num : numberlist) {
			System.out.println(" Num "+ num);
		}
		

	}

}
