package com.programming.class2;

public class SingleCatchBlockToHandleMultipleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
	}
	
	static void show() {	
		try {
			throw new NullPointerException("Null Object has come!");
		}
		catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
