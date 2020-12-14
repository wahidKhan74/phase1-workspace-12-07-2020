package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;


public class DeserializationTest {
	
	public static void main(String[] args) {
		String filename = "file.ser";
		try {
			// Reading of Object from  a file.
			FileInputStream file  = new FileInputStream(filename);
			// Create Object Input Stream
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Method for deserialization of object
			Employee emp = (Employee) in.readObject();
			
			System.out.println("Employee Object has been deserialized ");
			System.out.println("Emp Id :: "+emp.id);
			System.out.println("Emp Name :: "+emp.name);
			
		} catch (Exception e) {
			System.out.println("IOException is caught");
		}
		
	}
}
