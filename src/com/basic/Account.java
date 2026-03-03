package com.basic;

public class Account {

	int accNo;
	String owner;
	float amount;
	
	public void createAccount(int accNo,String owner,float amount){
		this.accNo=accNo;
		this.owner=owner;
		this.amount=amount;
	
	}
	
	public void deposit(int amount) {
		this.amount+=amount;
		System.out.println("Amount deposited into the bank account :"+amount);
		System.out.println("Total amount into the bank account :"+this.amount);
		
		System.out.println("Please visit Again . Thank You.");
	}
	
	public void withdraw(int amount) {
		if(this.amount<amount) {
			System.out.println("Insuffient Balance. Please check your balance and try again...");
		}else {
			this.amount-=amount;
			System.out.println("Amount withdrawn from the bank account :"+amount);
			System.out.println("Total Remaing balance in the bank account :"+this.amount);
		}
		System.out.println("Please visit Again. Thank You");
	}
	
	public String checkBalance() {
		return "Total Balacence : "+this.amount;
	}
	
	public String display() {
		return this.owner+" "+System.currentTimeMillis()+this.accNo+System.currentTimeMillis()+"  " +this.amount;
	}
	
	public static void main(String[] args) {
		
		Account acc=new Account();
		acc.createAccount(1234, "Jagadeeswar Reddy", 54000.0f);
		
		acc.withdraw(1000);
		acc.withdraw(60000);
		
		System.out.println(acc.checkBalance());
		
		System.out.println(acc.display());
		
	}
}
