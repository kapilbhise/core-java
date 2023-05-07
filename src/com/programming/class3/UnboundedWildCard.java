package com.programming.class3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UnboundedWildCard {

	//use of ? here - unbounded wild card
	void printCollection(Collection<?> objs) {
		for(Object obj : objs) {
			System.out.print(obj.getClass().getCanonicalName()+" : "+obj);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnboundedWildCard obj= new UnboundedWildCard();
		
		// collections =Objects
		
		//<> -Generics
		List<String> listStr =new ArrayList<>();
		listStr.add("ABC");
		listStr.add("XYZ");
		obj.printCollection(listStr);	
		
		List<Integer> listInt =new ArrayList<>();
		listInt.add(123);
		listInt.add(124);
		obj.printCollection(listInt);
		
		
		
		
	}

}
