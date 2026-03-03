package com.basic;

public class AbstractionExample {

	public static void main(String[] args) {
		
		BabyDog baby=new BabyDog();
		baby.makeSound();
		baby.breathe();
	}
}

abstract class Animal{
	abstract void makeSound();
	
	public void breathe() {
		
		System.out.println("Animal is Breathing...");
	}
}

class BabyDog extends Animal{
	
	public void makeSound() {
		System.out.println("bag barking....");
	}
}
