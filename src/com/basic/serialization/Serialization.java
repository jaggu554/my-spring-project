package com.basic.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) {

		try {
			Person p=new Person(101,"Jagadeeeswar Reddy","Java");
			FileOutputStream fout=new FileOutputStream("f.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			
			out.writeObject(p);
			out.flush();
			out.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Success...");
	}
}

class Student implements Serializable {

	transient int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Person extends Student {

	String course;

	public Person(int id, String name, String course) {
		super(id, name);
		this.course = course;
	}
}