package com.programming.threads1;


public class BankingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		Thread t1 =new Thread() {
			public void run() {
				c1.deposit(10000);
				c1.withdraw(15000);
			}
		};
		t1.start();
		
	}

}

class Customer{
	int amt=10000;
	synchronized  void withdraw(int amt) {
		System.out.println("Gong to withdraw... "+amt);
		if(this.amt<amt) {
			System.out.println("Less balance, please wait ofr the deposit to happen");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.amt-=amt;
		}
		System.out.println("Withdrawn completed successfully");
	}
	
	synchronized  void deposit(int amt) {
		System.out.println("Gong to deposit... "+amt);
		
		this.amt+=amt;
		System.out.println("Deposited completed successfully");
		notify();
	}
}