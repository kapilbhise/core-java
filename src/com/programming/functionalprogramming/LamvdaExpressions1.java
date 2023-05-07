package com.programming.functionalprogramming;


@FunctionalInterface
interface SimpleInterface{ // has got only method declared as a part of it
	String showMessage(String message);
}

@FunctionalInterface
interface Mycomparator{
	boolean compare(int a, int b);
}

public class LamvdaExpressions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inpline implementation of functional interface
		SimpleInterface obj= (abc) -> {return "Welcome "+abc;};
		System.out.println(obj.showMessage(" to functional progamming"));
		
		Mycomparator obj2=(x,y) -> {return x>y;};
		System.out.println(obj2.compare(2,55));
	}

}
