package com.programming.class2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddedFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(add(10,20));
	}
	
	//handled
	static int add(int a, int b) {
		try {
			giveMeParameters(a,b);
			
		}
		catch(InputMismatchException e) {
			System.out.println("Numbers were not integers");
		}
		return a+b;
	}

	//throws
	static void giveMeParameters(int a, int b) throws InputMismatchException{
		System.out.println("Please write numbers");
		Scanner sc =new Scanner(System.in);
		// exception was coming here
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a+" "+b);
	}
	
}
