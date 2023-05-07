package com.programming.functionalprogramming;


class Person{
	String firstName, lastName;
	Person(String f, String l){
		firstName=f;
		lastName=l;
	}
	Person(){}
	
}
public class MethodReference2 {
	
	@FunctionalInterface
	interface PersonFactory<P extends Person> {
		P create(String firstName, String lastnNme);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonFactory<Person> person= Person::new;
		Person p= person.create("Kapil","Bhise");
		System.out.println(p.firstName+" "+p.lastName);
	}

}
