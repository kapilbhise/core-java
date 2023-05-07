package com.programming.class2;

public class FinallyWorksWithreturnKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Number is "+12);
		}
		finally {
			System.out.println("Finally from main");
		}
		
		System.out.println("Number is "+display());
	}
	
	static int display() {
		try {
			return 20;
		}
		finally {
			System.out.println("finally from function -FInally works with even if  there is return in try block aslo");
		}
		
	}
}
