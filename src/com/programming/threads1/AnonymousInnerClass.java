package com.programming.threads1;

abstract class Person{
	abstract void name();
}

class Name extends Person{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("Name of user is ABC");
	}

}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// both ways are same
		//old way 
		Name obj1 =new Name();
		obj1.name();
		
		// anonymous inner class
		Person p= new Person() {
			@Override
			void name() {
				System.out.println("Name of user is ABC");
				
			}
		};
		p.name();
	}

}
