package com.programming.class4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.programming.class3.Book;

public class MapWithCustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Book> hMap= new HashMap<>();
		Book b1= new Book(10,"B", "C", "D", 100);
		Book b2= new Book(11,"x", "y", "z", 900);
		Book b3= new Book(12,"l", "m", "n", 400);
		
		hMap.put(1, b3);
		hMap.put(2, b1);
		hMap.put(3, b2);
		
		for(Map.Entry<Integer, Book>  m: hMap.entrySet()) {
			int key=m.getKey();
			Book b=m.getValue();
			System.out.println("Data for a key  "+key);
			System.out.println(b.bookId+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
		
		Map<Integer, String > tMap= new TreeMap<>();
		tMap.put(11,"A");
		tMap.put(10,"Z");
		tMap.put(12,"X");
		tMap.put(8,"B");
		tMap.put(7,null);
		tMap.put(6,null);
		tMap.put(7,"D"); // override the null value 
		
//		tMap.put(null,"y");// null key is not allowed
		
		for (Map.Entry<Integer, String> m: tMap.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		
		
		
		
	}

}
