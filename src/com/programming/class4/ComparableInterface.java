package com.programming.class4;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee> {

	int id;
	String name;
	String designation;
	double salary;
	int age;

	Employee(int id, String name, String designation, double salary, int age) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.age = age;
	}

	// create getter setters here
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "id = " + this.id + ", name = " + this.name + 
				", designation = " + this.designation + " and salary "
				+ this.salary + " and age is " + this.age;
	}

	static Comparator<Employee> salaryComparator = new Comparator<>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.getSalary() - o2.getSalary());
		}
	};

	static Comparator<Employee> nameComparator = new Comparator<>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};

	static Comparator<Employee> designationComparator = new Comparator<>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getDesignation().compareTo(o2.getDesignation());
		}
	};

	static Comparator<Employee> ageComparator = new Comparator<>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getAge() - o2.getAge();
		}
	};

	
}

public class ComparableInterface {

	public static void main(String[] args) {

		Employee[] emp = new Employee[4];
		emp[0] = new Employee(10, "A", "SE", 5000, 28);
		emp[1] = new Employee(9, "P", "SSE", 5500, 27);
		emp[2] = new Employee(8, "B", "Ar", 6000, 26);
		emp[3] = new Employee(12, "Z", "BA", 4800, 29);

		Arrays.sort(emp);
		System.out.println(Arrays.toString(emp));

		Arrays.sort(emp, Employee.salaryComparator);
		System.out.println(Arrays.toString(emp));

		Arrays.sort(emp, Employee.nameComparator);
		System.out.println(Arrays.toString(emp));

		Arrays.sort(emp, Employee.designationComparator);
		System.out.println(Arrays.toString(emp));

		Arrays.sort(emp, Employee.ageComparator);
		System.out.println(Arrays.toString(emp));

	}

}