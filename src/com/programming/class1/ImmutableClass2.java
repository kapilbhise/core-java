package com.programming.class1;


class Student {
	String name;
	Student(String name){
		this.name=name;
	}
}


public final class ImmutableClass2 {
	private  final int id;
	private final String name;
	private final Student s;
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public ImmutableClass2(int id, String name, Student s) {
		this.id=id;
		this.name=name;
		Student newStudent=new Student(s.name);
		this.s=newStudent;
		
//		this.s=s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Kapil");
		ImmutableClass2 obj= new ImmutableClass2(1,"Pyhton",s);
		System.out.println(obj.s.name);
		s.name="Rahul";
		System.out.println(obj.s.name);

	}

}
