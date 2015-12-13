package com.jrout.tutorial.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Jayram\\Desktop\\Test.txt");
		Scanner scan = null;
		try {
			scan= new Scanner(file);
			while(scan.hasNext()){
				System.out.println(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			scan.close();
		}
	}

}
