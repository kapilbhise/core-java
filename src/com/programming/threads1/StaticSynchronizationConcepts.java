package com.programming.threads1;

class SharedResource2{
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
class Thread5 extends Thread{
	public void run() {
		SharedResource2.print(5);
	}
}
class Thread6 extends Thread{
	public void run() {
		SharedResource2.print(10);
	}
}
class Thread7 extends Thread{
	public void run() {
		SharedResource2.print(15);
	}
}
class Thread8 extends Thread{
	public void run() {
		SharedResource2.print(20);
	}
}
public class StaticSynchronizationConcepts {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread5 t1= new Thread5();
		Thread6 t2= new Thread6();
		Thread7 t3= new Thread7();
		Thread8 t4= new Thread8();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
		
	}
	
	

}
