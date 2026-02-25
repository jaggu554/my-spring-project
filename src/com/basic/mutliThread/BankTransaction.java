package com.basic.mutliThread;

public class BankTransaction  implements Runnable{
	
	String name;
	public BankTransaction(String name) {
		this.name=name;
	}
	
	public void run() {
		System.out.println("Process Started :"+this.name);
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Process Completed...");
	}
	public static void main(String[] args) {
		
		BankTransaction b=new BankTransaction("withdraw");
		Thread t=new Thread(b);
		t.start();
		
		BankTransaction b1=new BankTransaction("Deposit");
		
		Thread t1=new Thread(b1);
		t1.start();
		
	}
}
