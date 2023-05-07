package com.programming.class3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListForCustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> arrList =new ArrayList<>();
		Book b1= new Book(10,"B", "C", "D", 100);
		Book b2= new Book(11,"x", "y", "z", 900);
		Book b3= new Book(12,"l", "m", "n", 400);
		
		// insertion order
		arrList.add(b1);
		arrList.add(b2);
		arrList.add(b3);
		arrList.add(b2);
		arrList.add(b3);
		
		Iterator<Book> itr= arrList.iterator();
		while(itr.hasNext()) {
			Book b= itr.next();
			System.out.println(b.bookId+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
