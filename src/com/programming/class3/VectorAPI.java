package com.programming.class3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initial capacity and load factor
		Vector<String> vec=new Vector<>(3,5);
		vec.addElement("A");
		vec.addElement("B");
		vec.addElement("C");
	
		System.out.println("Vector  size is : "+vec.size());
		System.out.println("Vector  capacity is : "+vec.capacity());
		
		vec.addElement("z");
		System.out.println("Vector  size is : "+vec.size());
		System.out.println("Vector  capacity is : "+vec.capacity());
		
		
		vec.addElement("x");
		vec.addElement("p");
		vec.addElement("q");
		vec.remove(1); // remove element at index
		
	
		System.out.println(vec.firstElement());

		
		
		Enumeration<String > en= vec.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+" ");
		}
		System.out.println();
		
		
		Iterator<String> itr=vec.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
		
	}

}
;



