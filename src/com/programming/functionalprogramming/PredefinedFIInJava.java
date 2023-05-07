package com.programming.functionalprogramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFIInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String>  predicate=(s)-> s.length()>0;
		System.out.println(predicate.test("abc"));
		System.out.println(predicate.negate().test("xyz"));
		
		Function<String , Integer> toInteger=Integer::valueOf;
		Function<String , String> backToString=toInteger.andThen(String::valueOf);
		System.out.println(backToString.apply("1123"));
		
		
		Supplier<Person> personObject= Person::new;
		personObject.get();	
		
		//single arg-no result
		Consumer<Person> cons= (p)-> System.out.println("Via Consumer "+ p.firstName);
		//accept
		cons.accept(new Person("MNO","PQR"));
		
		BiConsumer<String, Integer> keyValue=(key, value)->
		System.out.println(key+" "+value);
		keyValue.accept("A", 1);
		keyValue.accept("B", 3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
