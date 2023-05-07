package com.programming.class2;

public class WhatExceptionIs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//unchecked exception
			int data=10/0; //arithmetic exception
			System.out.println("The value of data is "+data);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		
		// fatal error
		System.out.println("rest of the code");
	}

}
