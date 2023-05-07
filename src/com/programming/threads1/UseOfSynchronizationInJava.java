package com.programming.threads1;

class SharedResource{
	//obtain the loss on shared resource
	synchronized void print(int n) {
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
class Thread3 extends Thread{
	SharedResource sR;
	
	Thread3(SharedResource sR){
		this.sR=sR;
	}
	public void run() {
		sR.print(5);
	}
}

class Thread4 extends Thread{
	SharedResource sR;
	
	Thread4(SharedResource sR){
		this.sR=sR;
	}
	public void run() {
		sR.print(7);
	}
}


public class UseOfSynchronizationInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResource sR=new SharedResource();
		UseOfSynchronizationInJava t1 = new UseOfSynchronizationInJava();
		Thread3 t3= new Thread3(sR);
		Thread4 t4= new Thread4(sR);
		t3.start();
		t4.start();
		
	}

}
