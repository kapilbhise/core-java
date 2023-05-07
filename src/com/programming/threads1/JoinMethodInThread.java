package com.programming.threads1;
// x.join(); other wait, join execute first
// x.yield(); x will wait  and let others complete first
public class JoinMethodInThread  extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JoinMethodInThread t1= new JoinMethodInThread();
		JoinMethodInThread t2= new JoinMethodInThread();
		JoinMethodInThread t3= new JoinMethodInThread();
		
		t1.start();
		try {
			t1.join(); // will execute first- joined hands with main thread
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
		

	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.print(i +" ");
		}
	}

}
