package com.simplilearn.serialization.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * File handling by inputOut stream.
 * @author wahidkhan74gmai
 *
 */
public class FileHandlingDemo {

	public static void writeOperation(File file, String data) {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(file);
			fout.write(data.getBytes());
			System.out.println("Write operation is completed !");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void readOperation(File file) {
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream(file);
			int i = 0;
			while((i=fin.read()) !=-1) {
				System.out.print((char)i);
			}
			System.out.println();
			System.out.println("Read Operation is Completed !");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fileName = input.nextLine();
		
		System.out.println("Choose 1. Write 2.Read :");
		int option = input.nextInt();
		
		File file = new File(fileName);
		switch (option) {
		case 1:
			writeOperation(file,"Welcome to file Hanling with File IO stream");
			break;
		case 2:
			readOperation(file);
			break;			
		default:
			break;
		}
		

	}
	
	//WAP for appending data to file
	//WAP for delete data from file

}
