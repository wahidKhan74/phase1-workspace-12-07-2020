package com.simplilearn.serialization.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void createFile(String filename){
		File file = new File(filename);
		try {
			
			boolean status  = file.createNewFile();
			if(status) {
				System.out.println("File is created as : "+file.getName());
				System.out.println("File path: "+file.getAbsolutePath());
				System.out.println("File can be read : "+file.canRead());
				System.out.println("File can be write : "+file.canWrite());
				System.out.println("File lenth in byte : "+file.length());
			} else {
				System.out.println("File Already exist by name : "+file.getName());
			}
			
		} catch (IOException e) {
			System.out.println("IOException Occurred");
		}
	}
	
	public static void main(String[] args) {
		createFile("demo.txt");
	}
}
