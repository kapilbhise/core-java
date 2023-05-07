package com.programming.class2;

public class ExplicitConstructorChaining {

	int number=10;
	
	ExplicitConstructorChaining(){
		this("ABC", 30); //constructor chaining
		number=20;
		System.out.println("No Arg Constructor number is "+ number);
		
	}
	
	ExplicitConstructorChaining(String str, int number){
		 this.number=number;
		 System.out.println("Arg Based constructor number is "+number +" String is "+ str);
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExplicitConstructorChaining obj=new ExplicitConstructorChaining();
	}

}
