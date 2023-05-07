package com.programming.class2;

public class EqualsForCustomNeedImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee();
		e1.setFirstName("ABC");
		Employee e2= new Employee();
		e2.setFirstName("ABC");
		
		if(e1.equals(e2)) {
			System.out.println("equals- not work - Imp");
		}
		else {
			System.out.println("equals does not work");
		
		}
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
