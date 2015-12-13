package com.jrout.tutorial.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		File file = new File("Batch20.txt");
		boolean isFileCreated = false;
		System.out.println(file.exists());
		if (!file.exists()) {
			try {
				isFileCreated = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Is file created = " + isFileCreated);
		}

		// Write something to file
		FileWriter fw = null;

		try {
			fw = new FileWriter(file);
			fw.write("Hello Guys this is your Input Ouput example");
			fw.flush();
			System.out.println("Content written successfully");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Connection closed..");
		}
		// Write something to file

		FileReader fr = null;
		char[] data = new char[500];
		try {
			fr = new FileReader("C:\\Users\\Jayram\\Desktop\\Test.txt");
			fr.read(data);
			
			for(char c : data) {
				System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
