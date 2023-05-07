package com.programming.class2;

public class ThisKeyword {
	
	//non static
	int id;
	
	ThisKeyword(){
		this.id=20;
	}
	
	void display() {
		System.out.println("This keyword - object is "+ this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj1= new ThisKeyword();
		System.out.println("First Object is "+ obj1);
		obj1.display();
		System.out.println(obj1.id);
		
		ThisKeyword obj2= new ThisKeyword();
		System.out.println("First Object is "+ obj2);
		obj2.display();
		System.out.println(obj2.id);
	}

}
