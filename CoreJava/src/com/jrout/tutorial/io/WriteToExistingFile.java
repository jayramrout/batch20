package com.jrout.tutorial.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToExistingFile {

	public static void main(String[] args) {
		writeToExistingFileWithoutFinally();
	}
	
	public static void writeToExistingFile(){
		PrintWriter out = null;
		try{
			/*FileWriter fw = new FileWriter(new File("C:\\Users\\Jayram\\git\\batch20\\CoreJava\\Batch20.txt"), true);
			BufferedWriter bf = new BufferedWriter(fw);
			out = new PrintWriter(bf);*/
			out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Jayram\\git\\batch20\\CoreJava\\Batch20.txt", true)));
			out.println("\n Good Morning.....");
			System.out.println("Content written succesfully");
		}catch(Exception exp){
			exp.printStackTrace();
		}finally{
			if(out != null){
				out.close();
			}
		}
	}
	/*
	 * try-with-resource
	 */
	public static void writeToExistingFileWithoutFinally(){
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File("C:\\Users\\Jayram\\git\\batch20\\CoreJava\\Batch20.txt"), true)))){
			out.println("Writting some to thee file...");
		}catch(IOException exp){
			exp.printStackTrace();
		}
	}
}
