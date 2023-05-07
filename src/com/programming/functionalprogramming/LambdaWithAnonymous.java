package com.programming.functionalprogramming;

import java.util.Random;

@FunctionalInterface
interface Calculator{ // has got only method declared as a part of it
	int calculate(int a, int b);
}

@FunctionalInterface
interface Greeting{
	void sayHi();
}
class HelloGreeting implements Greeting{

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("Hi Everyone");
		
	}
	
}

public class LambdaWithAnonymous {

	
	
	public static void main(String[] args) {
		
		//old way
		HelloGreeting obj= new HelloGreeting();
		obj.sayHi();
		
		//anonymous class way
		Greeting obj2= new Greeting() {

			@Override
			public void sayHi() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class way of implementayion of functional interface");
			}
			
		};
		obj2.sayHi();
		
		// lambda expression - inline implementation of functional interface
		Greeting obj3= ()->{System.out.println( "Say Hi using lambda expression");};
		obj3.sayHi();
		
		//lambda expression - inline implementation of functional interface
		Calculator obj4= (x,y)->{
			Random r= new Random();
			int randomNumber= r.nextInt(50);
			return x + y + randomNumber;
		};
		
		System.out.println(obj4.calculate(2,4));
		
	}
}
