package com.programming.class1.PackageA;

public class ClassA {
	
	int data=10;
	public void show() {
		System.out.println("Value of data is " + data);
	}
	// Access modifiers->public, private, default(package-private), protected

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj= new ClassA();
		System.out.println(obj.data);
		obj.show();
	}

}
