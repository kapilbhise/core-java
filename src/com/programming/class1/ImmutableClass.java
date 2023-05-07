package com.programming.class1;

public final class ImmutableClass {
	private  final int id;
	private  final String name;
	
	public ImmutableClass(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass obj= new ImmutableClass(1,"Science");
		System.out.println("Id : "+ obj.id+" Name : "+obj.name);
//		obj.id=32;
		System.out.println("Id : "+ obj.id+" Name : "+obj.name);	
	}
}
