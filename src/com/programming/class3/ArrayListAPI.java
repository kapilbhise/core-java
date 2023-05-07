package com.programming.class3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listStr= new ArrayList<>();
		listStr.add("A");
		listStr.add("A");
		listStr.add("A");
		listStr.add("A");
		listStr.add(null);
		listStr.add(null);
		listStr.add(null);
		listStr.add(null);
		listStr.add("B");
		listStr.add("C");
		listStr.add("X");
		listStr.add("Z");
		
		listStr.remove("A");
		listStr.remove(2);
		listStr.set(4, "New elment");
		
		System.out.println("listrStr Size  is : "+ listStr.size());
		
		List<String> listStr2= new ArrayList<>();
		listStr2.add("P");
		listStr2.add("P");
		listStr2.add("Q");
		listStr2.add("R");
		
		System.out.println("listrStr2 Size  is : "+ listStr2.size());
		
		listStr.addAll(listStr2);
//		listStr.retainAll(listStr2);
		
		System.out.println("listrStr Size  is : "+ listStr.size());
		System.out.println("listrStr2 Size  is : "+ listStr2.size());
		
		//listStr.clear();
		
		Iterator<String> itr= listStr.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}

		
		
		
	}

}
