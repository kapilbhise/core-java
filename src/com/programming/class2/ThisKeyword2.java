package com.programming.class2;

public class ThisKeyword2 {
	int id=10;
	
	ThisKeyword2(){
		// local variable
		int id=15;
		System.out.println("Local variable id "+id);
		System.out.println("Method level variable "+this.id);
		
	}
	
	ThisKeyword2(int id){
		// local variable
		id=20;
		System.out.println("Local variable id "+id);
		System.out.println("Method level variable "+this.id);
		
	}
	void display() {
		int id=25;
		System.out.println("Local variable id "+id);
		System.out.println("Method level variable "+this.id);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword2 obj1= new ThisKeyword2();
		ThisKeyword2 obj2= new ThisKeyword2(30);
		obj1.display();
		
	}

}
