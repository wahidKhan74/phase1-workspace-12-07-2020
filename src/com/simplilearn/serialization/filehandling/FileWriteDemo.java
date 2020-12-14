package com.simplilearn.serialization.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fileName = input.nextLine();
		
		System.out.println("Enter Data to insert in File  "+fileName);
		String data = input.nextLine();
		
		createFileAndWrite(fileName,data);
		
	}
	public static void createFileAndWrite(String filename, String data) throws IOException{
		File file = new File(filename);
		FileWriter fileWriter = null;

		try {
			
			file.createNewFile();
			if(file.exists()) {
				// if file exists write data to file
				fileWriter = new FileWriter(file);				
				fileWriter.write(data);
				System.out.println("Data has been written successfully..");
				
			} else {
				throw new FileNotFoundException("File is not available with name "+file.getName());
			}
			
		} catch (IOException e) {
			System.out.println("IOException Occurred");
		} finally {
			fileWriter.close();
		}
	}
}
