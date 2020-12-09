package com.simplilearn.array;

import java.util.Arrays;
import java.util.Scanner;

public class UserArrayDemo {

	public static void main(String[] args) {
		String[] users = new String[] { "John","Mike","Bob","David","Sam"};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Old User name :");
		String oldName  = input.nextLine();
		System.out.println("Enter a New User name :");
		String  newName = input.nextLine();
		
		int count = 0;
		for (int i = 0; i < users.length; i++) {
			if(users[i].equals(oldName)) {
					users[i] = newName;
					count++;
			} 
		}
		if(count == 0) {
			System.out.println("User Name is not available");
		} else {
			System.out.println("User name is changed");
			System.out.println(Arrays.toString(users));
		}

	}

}
