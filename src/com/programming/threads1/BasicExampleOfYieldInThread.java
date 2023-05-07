package com.programming.threads1;

public class BasicExampleOfYieldInThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1= new Thread1();
		Thread2 t2= new Thread2();
		t1.start();
		t2.start();
		
	}

}


class Thread1 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread1 running- "+i );
			Thread.yield();
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread2 Running- "+i);
		}
	}
}