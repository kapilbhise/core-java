package com.programming.threads1;

class SharedResource3{
	synchronized static void print(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(i*n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(Thread.currentThread().getName()+" Finsishes Execution");
		
	}
}

public class StaticSynchronizationSUingAnaonymuousClassWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// anonymous inner class
		Thread t1=new Thread() {
			public void run() {
				SharedResource3.print(5);
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				SharedResource3.print(5);
			}
		};
		Thread t3=new Thread() {
			public void run() {
				SharedResource3.print(5);
			}
		};
		Thread t4=new Thread() {
			public void run() {
				SharedResource3.print(5);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
