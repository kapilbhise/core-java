package com.programming.threads1;

public class ToAvoidDeadlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String resource1="A";
		final String resource2="B";
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread1: lock on resource 1");
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e){
						e.printStackTrace();
					}
					synchronized(resource2) {
						System.out.println("Thread1: wants to acquire resource 2");
					}
				}
			}
		};
		
		Thread t2=new Thread() {
			@Override
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread2: lock on resource 2");
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e){
						e.printStackTrace();
					}
					synchronized(resource1) {
						System.out.println("Thread2: wants to acquire resource 1");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
