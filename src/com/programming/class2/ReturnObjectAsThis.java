package com.programming.class2;

public class ReturnObjectAsThis {

	// only instance
	
	ReturnObjectAsThis getClassObj() {
		return this;
	}
	
	void display() {
		System.out.println("Obj- via this");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReturnObjectAsThis().getClassObj().display();
		//or 
		// ReturnObjectAsThis obj= new ReturnObjectAsThis();
		// obj.display();
		// both works same
	}

}
