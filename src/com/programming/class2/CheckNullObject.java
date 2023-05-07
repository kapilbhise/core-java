package com.programming.class2;

public class CheckNullObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=null;
//		str="Exception";
		
		//tertiary operator to check the null
		String message=(null==str) ? "" :str.substring(0,4);
		System.out.println(message);
		
		// avoids the exception -you should use like this
		if("abc".equals(str)) {
			System.out.println("Yes They are same");
		}
		else {
			System.out.println("No they are different");
		}
		
		//null pointer exception
		//this way of writing triggers the exception 
		if(str.equals("abc")) {
			System.out.println("Yes They are same");
		}
		else {
			System.out.println("No they are different");
		}
		
	}

}
