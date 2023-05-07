package com.programming.class2;

public class ThisReplaceObjects {

	int number; //0
	void display() {
		number=100; // constructor
		show(this);
		
	}
	void show(ThisReplaceObjects obj) {
		System.out.println("Number is "+ obj.number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisReplaceObjects obj= new ThisReplaceObjects();
		System.out.println(obj.number);
		obj.display();
		System.out.println(obj.number);
	}

}
