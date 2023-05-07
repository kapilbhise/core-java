package com.programming.class2;

public class ObjectClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="A";
		String str2="A";
		
		if(str1==str2) {
			System.out.println("== works for literals");
		}
		else {
			System.out.println("== does not works for literals");
		}
		
		String str3=new String("B");
		String str4=new String("B");
		
		if(str3==str4) {
			System.out.println("== works for objects");
		}
		else {
			System.out.println("==  does not works for objects");
		}
		
		if(str3.equals(str4)) {
			System.out.println("equals works for objects");
		}
		else {
			System.out.println("equals does not works for objects");
		}
	}

}
