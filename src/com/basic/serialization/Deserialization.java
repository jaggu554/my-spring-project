package com.basic.serialization;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
			
			Person p=(Person)in.readObject();
			
			System.out.println(p.course+" "+p.id+" "+p.name);
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Sucess...");
		
	}
}
