package com.programming.class2;

import java.io.IOException;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		System.out.println("Rest of the code");
		message();
		System.out.println("After Mesage");
	}
	
	static void show() {
		try {
			// intentionally throwing the exception
			// unchecked exception
			throw new NullPointerException("Null Object");
		}
		catch(NullPointerException e) {
			System.out.println("Exception handled "+e.getMessage());
			
		}
	}
	
	static void message() {
		try {
			// wrong data - UI/DB -print the exception
			// help
			throw  new IOException("Device Error");
		}
		catch(IOException e) {
			System.out.println("Exception message-> "+e.getMessage());
		}
	}

}
