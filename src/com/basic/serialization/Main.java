package com.basic.serialization;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	static void readFile(String fileName) throws IOException,FileNotFoundException {
		FileReader file=new FileReader(fileName);
		BufferedReader fileInput=new BufferedReader(file);
		System.out.println(fileInput.readLine());
		fileInput.close();
	}
	
	public static void main(String[] args) {
		try {
			readFile("p.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
	
}
