package com.programming.class2;

//create custom exception
class InvalideAgeException extends Exception{
	InvalideAgeException(String message){
		super(message);
	}
}
public class LetsCreateOurOwnException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(18);	
		}
		catch(InvalideAgeException e) {
			System.out.println(e.getMessage());
		}
	}

	static void validate(int age ) throws InvalideAgeException{
		if(age>18) {
			System.out.println("he can vote");
		}
		else {
			throw new InvalideAgeException("he can not vote");
		}
	}
}
