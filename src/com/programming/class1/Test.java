package com.programming.class1;

public class Test {

	// using both functions gives compilationn error
//	public void display( int x, double y) {
//		System.out.println(x+y);
//	}
	
	public double display(int x, double y) {
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj= new Test();
		obj.display(2,7.0);
		System.out.println(obj.display(2,7.0));
		
	}

}
