package com.programming.class2;


class ParentClass{
	
	ParentClass(String message){
		System.out.println("Parent class constructor");
		System.out.println(message);
	}
}




public class SuperKeyword2  extends ParentClass{

	SuperKeyword2(String message){
		super(message);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword2 obj=new SuperKeyword2("Super keyword-parent class");
	}

}
