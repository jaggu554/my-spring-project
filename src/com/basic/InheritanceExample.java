package com.basic;

public class InheritanceExample {

	public static void main(String[] args) {
		
		Vehicle v=new Car();
		System.out.println(v.name);
		
		Car c=new Car();
		c.stop();
		System.out.println(c.name);
		
	}
}

class Vehicle{
	
	String name="jaggu";
	public void start() {
		System.out.println("Vehicle started...");
	}
	
	public void stop() {
		System.out.println("Vehicle stoped...");
	}
}

class Car extends Vehicle{
	
	String name="King";
	
	public void honk() {
		System.out.println("Car is honking...");
	}
}
