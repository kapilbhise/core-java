package com.programming.class2;

public class CloneMethod implements Cloneable {
	int id;
	String name;
	
	CloneMethod(int id, String name){
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloneMethod obj1=new CloneMethod(123,"A");
		
		//correct way to clone
		CloneMethod obj2= (CloneMethod) obj1.clone();
		System.out.println(obj1.id+ " "+ obj1.name);
		System.out.println(obj2.id+ " "+ obj2.name);
		
		CloneMethod obj3=obj1;
		System.out.println(obj3.id+ " "+ obj3.name);
		
		obj3.id=125;
		System.out.println(obj1.id+ " "+ obj1.name);
		System.out.println(obj2.id+ " "+ obj2.name);
		System.out.println(obj3.id+ " "+ obj3.name);
		
		
	}

}
