package com.basic.mutliThread;

public class ClientRequest extends Thread {

	private String clinetName;
	
	public ClientRequest(String clinetName) {
		this.clinetName=clinetName;
	}
	
	public void run() {
		System.out.println(clinetName+" Request got started processing...");
		
		try {
			Thread.sleep(20000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Request got completed processing..."+ clinetName);
	}
	
	
	public static void main(String[] args) throws InterruptedException{
		
		ClientRequest c1=new ClientRequest("Jaggu");
		ClientRequest c2=new ClientRequest("Reddy");
		
		c1.start();
		System.out.println(c1.getName());
		c2.join();
		c2.start();
		System.out.println(c2.getName());
	}
}
