package com.programming.class1;

// selection statement if else
public class SelectionStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=15;
		if(n%2==0) {
			System.out.println("It is an even number");
		}
		else {
			System.out.println("It is an odd number");
		}
		
		int marks=95;
		if(marks>=80 && marks<=90) {
			System.out.println("A Grade");
		}
		else if(marks>=90 && marks<=100) {
			System.out.println("A+ Grade");
		}
		else {
			System.out.println("Good performance but can be done better.");
		}
	}

}
