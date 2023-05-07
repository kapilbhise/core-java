package com.programming.threads1;

import java.util.concurrent.TimeUnit;

public class SleepMethodWorks  extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepMethodWorks t1= new SleepMethodWorks();
		SleepMethodWorks t2= new SleepMethodWorks();
		t1.start();
		t2.start();
	}

	 public void run() {
		for(int i=1;i<=5;i++) {
			try {
//				Thread.sleep(1000); //milliseconds
				TimeUnit.SECONDS.sleep(1); //seconds
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(i+" ");
			
		}
	}
}
