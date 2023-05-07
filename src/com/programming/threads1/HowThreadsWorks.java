package com.programming.threads1;

public class HowThreadsWorks extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HowThreadsWorks t1= new HowThreadsWorks();
		HowThreadsWorks t2= new HowThreadsWorks();

//		System.out.println("Hey");
		t1.start();
		t2.start();
//		System.out.println("There2");
			
		
	}
	
	public void run() {
		System.out.println("Run got called automatically");
	}

}
