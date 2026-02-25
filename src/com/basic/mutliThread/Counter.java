package com.basic.mutliThread;

public class Counter {
		
	public synchronized void increment(int n) {
		for(int i=0;i<5;i++) {
			
			System.out.println(n*(i+1));
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
		 
	public static void main(String[] args) {
		
		Counter c=new Counter();
		
		MyThread1 t1=new MyThread1(c);
		t1.start();
	
		
		
		MyThread2 t2=new MyThread2(c);
		t2.start();
		
	}
}

class MyThread1 extends Thread{
	
	Counter c;
	
	public MyThread1(Counter c) {
		this.c=c;
	}
	
	public void run() {
		c.increment(10);
	}
}

class MyThread2 extends Thread {
	Counter c;
	
	public MyThread2(Counter c) {
		this.c=c;
	}
	
	public void run() {
		c.increment(100);
	}
}
