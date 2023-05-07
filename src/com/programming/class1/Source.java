package com.programming.class1;

import java.util.InputMismatchException;
import java.util.Scanner;

class DivideByZeroException extends Exception{
	DivideByZeroException(String message){
		super(message);
	}
}
public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter numbers\n");
			Integer a = sc.nextInt(); 
			Integer b = sc.nextInt(); 
			try {
				if(b==0) {
					throw new DivideByZeroException("ERROR502");
				}
				else {
					System.out.println((double)a/b);
				}
			}
			catch(DivideByZeroException e) {
				System.out.println(e);

			}
		} catch (InputMismatchException ex) {
			System.out.println("ERROR501");
		}
	}

}
