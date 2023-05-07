package com.programming.class5;

public final class FinalKeyword {
	//non static final fields
	final String PAN_NUMBER;

	final static int FORMS_BOXES;
	
	FinalKeyword(){
		PAN_NUMBER="AS42442";
	}
	
	static {
		FORMS_BOXES=11;
	}
	
	
	final  void display() {
		System.out.println("Final- can't be overriden");
	}
	
//	void display() {
//		PAN_NUMBER="GF324444";
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalKeyword obj= new FinalKeyword();
		obj.display();
		System.out.println(obj.PAN_NUMBER);
		System.out.println(FORMS_BOXES);
	}

}
