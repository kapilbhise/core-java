package com.programming.class2;

public class StaticInitializerBlock {
	
	//non static
	int empId;
	
	static String orgName;
	
	//initialize static variables
	//mainly used for hashmap or jdbc -load the driver
	static {
		orgName="Telstra Inc.";
	}
	
	StaticInitializerBlock(){
		empId=123;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInitializerBlock obj= new StaticInitializerBlock();
		System.out.println(obj.empId);
		System.out.println(orgName);
	}

}
