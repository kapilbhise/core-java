package com.programming.class1;

// Basic Java setters and getters
public class Employee {
	//properties or attributes
	String name;
	int age;
	String designation;
	double salary;
	
	// getters
	public String getName() {
		return name;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
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
		Employee emp=new Employee();
		emp.setName("Kapil");
		emp.setAge(22);
		emp.setDesignation("SOftware Engineer");
		emp.setSalary(100.2);
		
		System.out.println("Name of employee is "+ emp.getName());
		System.out.println("age of employee is "+emp.getAge());
		System.out.println("Designation of employee is "+emp.getDesignation());
		System.out.println("Salary of employee is "+emp.getSalary());
		
	}
	
}
