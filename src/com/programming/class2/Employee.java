package com.programming.class2;

import java.util.Objects;

//user defined -custom class
public class Employee {
	String firstName;
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
