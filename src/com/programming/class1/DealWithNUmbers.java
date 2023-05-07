package com.programming.class1;

// constructor
public class DealWithNUmbers {
	
	int number;
	// No argument constructor
	DealWithNUmbers(){
		number=10;
	}
	
	DealWithNUmbers(int n){
		if(n<0) {
			throw new IllegalArgumentException("Number can not be negative");
			
		}
		this.number=n;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DealWithNUmbers obj=new DealWithNUmbers();
			System.out.println(obj.number); //10
			
			DealWithNUmbers obj2=new DealWithNUmbers(100);
			System.out.println(obj2.number); //100
			
			DealWithNUmbers obj3=new DealWithNUmbers(-5);
			System.out.println(obj3.number);  //exception
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
