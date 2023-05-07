package com.programming.class2;

public class CTPoly {
	
	
	static {
		
	}
	
	//functionality
	static int add(int a, int b) {
		return a+b;
	}
	
	static double add(double a, double b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,3));
		System.out.println(add(208,3.8));
		System.out.println(add(234,93,56));
		
	}

}
