package com.programming.threads1;

public class YieldMethodInThreads {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producer prod= new Producer();
		Consumer cons= new Consumer();
		//preemptive scheduling
		prod.setPriority(Thread.MIN_PRIORITY); //1
		cons.setPriority(Thread.MAX_PRIORITY); //10
		prod.start();
		cons.start();
		
	}

}

class Consumer extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("consumer class- "+i );
			Thread.yield();
		}
	}
}
class Producer extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("producer class- "+i);
			Thread.yield();
		}
	}
}