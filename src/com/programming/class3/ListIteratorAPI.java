package com.programming.class3;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String > listStr= new LinkedList<>();
		
		listStr.add("A");
		listStr.add("B");
		listStr.add("C");
		listStr.add("D");
		listStr.add("Z");
		
		
		
		ListIterator<String> listItr= listStr.listIterator();
		while(listItr.hasNext()) {
			System.out.print(listItr.next()+ " ");
		}
		
		
		System.out.println();
		while(listItr.hasPrevious()) {
			System.out.print(listItr.previous()+" ");
		}
		
		
	}

}
