package com.programming.class1;

// overloading- that varies in parameters
public class CompileTimePolymorphism {

	int add(int a, int b) {
		return a+b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	//JVM -[] - arrays
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePolymorphism obj=new CompileTimePolymorphism();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10.1, 20.6));
		System.out.println(obj.add(10, 20,30));
		main("hey");
		main();
		
	}
	
	// normal method
	public static void main(String arg) {
		
		System.out.println("Single arg Main "+arg);
	}
	
	public static void main() {
		System.out.println("No arg Main");
	}

}
