package com.programming.class1;

// constructor overloading
public class EmployeeData {
	
	int age;
	String name;
	String designation;
	double salary;
	
	EmployeeData(){
		
	}
	
	EmployeeData(int age){
		this.age=age;
	}
	
	EmployeeData(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	EmployeeData(int age, String name, String designation){
		this.age=age;
		this.name=name;
		this.designation=designation;
	}
	
	EmployeeData(int age, String name, String designation, double salary){
		this.age=age;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData obj=new EmployeeData();
		System.out.println("Name is "+ obj.getName());
		System.out.println("Age is "+ obj.getAge());
		System.out.println("Designation is " + obj.getDesignation());
		System.out.println("Salary is "+ obj.getSalary());
		System.out.println();
		
		EmployeeData obj1=new EmployeeData(26);
		System.out.println("Name is "+ obj1.getName());
		System.out.println("Age is "+ obj1.getAge());
		System.out.println("Designation is " + obj1.getDesignation());
		System.out.println("Salary is "+ obj1.getSalary());
		System.out.println();
		
		EmployeeData obj2=new EmployeeData(26,"Kapil");
		System.out.println("Name is "+ obj2.getName());
		System.out.println("Age is "+ obj2.getAge());
		System.out.println("Designation is " + obj2.getDesignation());
		System.out.println("Salary is "+ obj2.getSalary());
		System.out.println();
		
		EmployeeData obj3=new EmployeeData(26,"Rahul","Software Engineer");
		System.out.println("Name is "+ obj3.getName());
		System.out.println("Age is "+ obj3.getAge());
		System.out.println("Designation is " + obj3.getDesignation());
		System.out.println("Salary is "+ obj3.getSalary());
		System.out.println();
		
		EmployeeData obj4=new EmployeeData(26,"jay","Analyst",20000);
		System.out.println("Name is "+ obj4.getName());
		System.out.println("Age is "+ obj4.getAge());
		System.out.println("Designation is " + obj4.getDesignation());
		System.out.println("Salary is "+ obj4.getSalary());
		System.out.println();
		
		
	}

}
