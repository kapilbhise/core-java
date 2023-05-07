package com.programming.class3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// No order using HashSet , with LinkedHashSet -insertion order
//		HashSet<String> hSet= new HashSet<>();
		Set<String> hSet= new LinkedHashSet<>();
		hSet.add("12");
		hSet.add("12");
		hSet.add("B");
		hSet.add("A");
		hSet.add(null);
		hSet.add(null);
		hSet.add(null);
		hSet.add(null);
		hSet.add("Z");
		hSet.add("X");
		hSet.add("Y");
		
		Iterator<String> itr=hSet.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
