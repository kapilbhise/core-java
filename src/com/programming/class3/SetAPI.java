package com.programming.class3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Book> hSet= new LinkedHashSet<>();
		Book b1= new Book(10,"B", "C", "D", 100);
		Book b2= new Book(11,"x", "y", "z", 900);
		Book b3= new Book(12,"l", "m", "n", 400);
		
		hSet.add(b1);
		hSet.add(b3);
		hSet.add(b2);
		hSet.add(b2);
		hSet.add(b3);
		
		
		
		
		Iterator<Book> itr= hSet.iterator();
		while(itr.hasNext()) {
			Book b= itr.next();
			System.out.println(b.bookId+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
