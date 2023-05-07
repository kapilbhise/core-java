//package com.programming.class2;
//
//import java.io.IOException;
//// https://www.geeksforgeeks.org/exception-handling-with-method-overriding-in-java/
//
//class Parent2{
//	
//	void show()  {
//		System.out.println("parent class function");
//	}
//	
//}
//
//// this will always throw error as superclass doesn’t declare any exception and subclass declare checked exception
//public class EHRulesInCaseOfInheritance extends Parent2 {
//
//	//child
//	@Override 
//	void show () throws IOException {
//		System.out.println("child class function");
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		EHRulesInCaseOfInheritance obj= new EHRulesInCaseOfInheritance();
//		try {
//			obj.show();
//		}
//		catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
//	}
//
//}
