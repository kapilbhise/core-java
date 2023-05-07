package com.programming.threads1;

public class ThreadsviaRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadsviaRunnable obj=new ThreadsviaRunnable();
		Thread t1= new Thread(obj);
//		System.out.println("Hey");
		t1.start();
//		System.out.println("There2");
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("There");
		
	}
	

}
