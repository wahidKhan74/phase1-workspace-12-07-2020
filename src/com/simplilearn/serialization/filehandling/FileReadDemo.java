package com.simplilearn.serialization.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fileName = input.nextLine();
		readFileOpr(fileName);
	}
	
	public static void readFileOpr(String filename) {
		
		File file = new File(filename);
		try {
			//create a scanner reader
			Scanner scannerReader = new Scanner(file);
			
			while(scannerReader.hasNextLine()) {
				System.out.println(scannerReader.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			
		
	}
}
