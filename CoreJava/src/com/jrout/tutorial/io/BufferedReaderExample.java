package com.jrout.tutorial.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		try{ 
			// FileReader == FileInputStream
			// FileWriter == FileOutputStream
			// BufferedReader == BufferedInputStream
			// BufferedWriter == BufferedOutputStream
			fr = new FileReader("C:\\Users\\Jayram\\git\\batch20\\CoreJava\\Batch20.txt");
			br = new BufferedReader(fr);
			int c;
			fw = new FileWriter("C:\\Users\\Jayram\\git\\batch20\\CoreJava\\Batch202.txt");
			bw = new BufferedWriter(fw);
			while((c = br.read()) != -1){
				bw.write(c);
			}
			bw.flush();
			System.out.println("Data written successfully...");
		}catch(IOException | NullPointerException exp){
			exp.printStackTrace();
		}finally{
			try{
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			}catch(Exception exp){
				exp.printStackTrace();
			}
		}
	}

}
