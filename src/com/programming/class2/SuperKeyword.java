package com.programming.class2;


// super -refers to immediate parent

class Parent{
	int data=10;
	
	void show() {
		System.out.println("Parent class Metho");
	}
	
}
public class SuperKeyword extends Parent {

	int data =20;
	
	@Override
	void show() {
		System.out.println("Child class Method");
	}
	
	void display() {
		System.out.println("Class variable "+this.data); //20
		System.out.println("Parent Class variable "+super.data); //10
		this.show(); //child class(this)
		super.show(); // Parent class (immediate parent class)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword obj= new SuperKeyword();
		obj.display();
	}

}
