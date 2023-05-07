package com.programming.class1;

import java.util.InputMismatchException;
import java.util.Scanner;

// create class InputMismatchException1 to understand how Scanner throws InputMismatchException  
public class InputMismatchException1 {
	// main() method start
	public static void main(String[] args) {
		// create scanner class object
		Scanner sc = new Scanner(System.in);
		// use try-catch block for taking input from the user and handling exception
		try {
			System.out.println("Enter value of a to get its square value:");
			Integer a = sc.nextInt(); // we give any float value as input
			System.out.println((a * a));
		} catch (InputMismatchException ex) {
			System.out.println(ex);
		}
	}
}
