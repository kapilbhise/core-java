package com.programming.functionalprogramming;

public class MethodReference1 {

	
	@FunctionalInterface
	interface Converter<F,T>{
		T convert(F from);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// via lambda
		Converter <String, Integer> intConverter=(from)-> Integer.valueOf(from);
		Integer data=intConverter.convert("123");
		System.out.println("Data is "+data); //123
		System.out.println("Data is "+data.getClass().getCanonicalName()); //integer
		
		Converter <String, Integer> intConverter2=Integer::valueOf; // :: is method reference
		Integer data2=intConverter2.convert("42423");
		System.out.println("Data is "+data2); 
		System.out.println("Data is "+data2.getClass().getCanonicalName());
		
		//via method reference
		Converter <String, String> intConverter3=MethodReference1::startingAlphabet; // static method
		String startingAplhatbetOP= intConverter3.convert("Method Reference");
		System.out.println(startingAplhatbetOP); 
		
		//via lambda
		Converter <String, String>strConverter4=(from)-> String.valueOf(from.charAt(0));
		String data3= strConverter4.convert("Lambda-Method Reference");
		System.out.println("Data is "+data3); 
		System.out.println("Data is "+data3.getClass().getCanonicalName());		
		
		
		
	}

	static String startingAlphabet(String str) {
		return String.valueOf(str.charAt(0));
	}
}
