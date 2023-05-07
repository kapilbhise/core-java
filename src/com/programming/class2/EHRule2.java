package com.programming.class2;

import java.io.IOException;

class P{
	void show() throws IOException{
		System.out.println("parent class function");
	}
	
}

//rule 2 - if a parent class throws an exception child class can not throw parent of that exception but can throw same exception


public class EHRule2 extends P {

	//
	@Override 
	void show () throws IOException {
		System.out.println("child class function");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EHRule2 obj= new EHRule2();
		try {
			obj.show();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
