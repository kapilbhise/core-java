package com.programming.class2;

import java.util.Scanner;

//in vm -ea
public class UnderStandAssertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=sc.nextInt();
		assert age>18 :"Assertion Error : Code failed with age less than 18";
		System.out.println("Age is "+age);
		
		int countArgs= args.length;
		assert countArgs==5 :"Assertion Error : no of arguments should have been 5";
		System.out.println("Total number of arguments is "+ countArgs);
		
		
	}

}
