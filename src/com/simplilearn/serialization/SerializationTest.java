package com.simplilearn.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee(101, "John Smith");
		String filename = "file.ser";
		
		// Serialization Process
		try {
			
			// Saving of Object in a file.
			FileOutputStream file  = new FileOutputStream(filename);
			// Create Object Stream
			ObjectOutputStream out  = new ObjectOutputStream(file);
			
			// Method for Serialization of object
			out.writeObject(emp);
			
			out.close();
			file.close();
			
		} catch (IOException e) {
			System.out.println("IOException is caught");
		}

	}

}
