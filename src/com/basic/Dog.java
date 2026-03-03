package com.basic;

public class Dog {

	String name;
	public String bark() {
		return name+"  is barking...";
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="Kittu ";
		System.out.println(dog.bark());
	}
}
