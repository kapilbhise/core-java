package com.programming.class1;

class Vehicle{
	int defaultNoOfGears=5;
	
	void engineType() {
		System.out.println("CVT");
		
	}
	
	void totalElectric() {
		System.out.println("Total electric-parent");
		
	}
	
}

class Toyota extends Vehicle{ // inheritance
	
	int defaultNoOfGears=6;
	
	void engineType() {
		System.out.println("Hybrid");
		
	}
}


public class MethodOverriding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v= new Vehicle();
		System.out.println(v.defaultNoOfGears);
		v.engineType();
		System.out.println();
		
		Toyota t= new Toyota();
		System.out.println(t.defaultNoOfGears);
		t.engineType();
		System.out.println();
		
		Vehicle vt= new Toyota();
		System.out.println(vt.defaultNoOfGears);
		vt.engineType();
		vt.totalElectric();
		System.out.println();
		
		
		
	}

}
