package com.programming.class2;

public class EmployeeData {
	
	//non static variable
	int empId;
	String empName;
	
	//static variable -shared
	static String orgName="ABC Inc.";
	
	//static method
	static void orgNameChange() {
		orgName="XYZ Inc.";
	}
	
	//static method overloaded
	static void orgNameChange(String x) {
		orgName=x;
	}
	
	// static methods are mostly used for updationg the satic variables
	
	//constructor
	EmployeeData(int empId, String empName){
		this.empId=empId;
		this.empName=empName;
	}
	
	//non static method
	void Display() {
		System.out.println("The Id is "+ empId+ " and the name of employee is "+ empName + "  and the organization is "+ orgName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData.orgNameChange();
		EmployeeData e1= new EmployeeData(1564,"Kapil");
		EmployeeData e2= new EmployeeData(2232,"Kamlesh");
		EmployeeData e3= new EmployeeData(23323,"Ajay");
		e1.Display();
		e2.Display();
		e3.Display();
	}

}
