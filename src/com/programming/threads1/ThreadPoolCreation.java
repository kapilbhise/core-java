package com.programming.threads1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// thread pool of 5 threads
		ExecutorService exService=Executors.newFixedThreadPool(5);
		
		//for loop
		for(int i=1;i<=10;i++) {
			//execute- run function of runnable
			Runnable worker= new WorkerThread(""+i);
			exService.execute(worker);			
		}
		exService.shutdown();
		try {
			exService.awaitTermination(5, TimeUnit.SECONDS);
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			if(!exService.isTerminated()) {
				System.out.println("cancel or finish all non finished tasks");			
			}
			exService.shutdownNow();
			System.out.println("Service Shutdown!");
		}
	}

}

class WorkerThread implements Runnable{
	String message;
	WorkerThread(String  message){
		this.message=message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" and message is "+message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
