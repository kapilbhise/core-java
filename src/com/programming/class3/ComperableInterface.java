package com.programming.class3;

import java.util.Arrays;

class Employee implements Comparable<Employee>{
	String name;
	int id;
	String designation;
	double salary;
	Employee(int id, String name, String designation, double salary){
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (this.id-o.id);
	}
	
	@Override
	public String toString() {
		return "id="+ this.id+", name="+this.name+", designation="+this.designation+", salary="+this.salary;
	}
	

	
	
}
public class ComperableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp =new Employee[3];
		emp[0]= new Employee(10,"B", "C",  100);
		emp[1]= new Employee(12,"x", "y",  900);
		emp[2]= new Employee(11,"l", "m",  400);
		
		Arrays.sort(emp);
		System.out.println(Arrays.toString(emp));
//		for(Employee e: emp) {
//			System.out.println(e);
//		}
		
		
	}

}
