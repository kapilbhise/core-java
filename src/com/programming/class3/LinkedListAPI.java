package com.programming.class3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// CRUD
public class LinkedListAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("C");
		list.add("B");
		
		
		list.add("c");
		list.add("C");
		list.add("D");
		list.add("Z");
		list.add("D");

		list.removeFirstOccurrence("C");
		list.removeLastOccurrence("D");
		list.addFirst("Z1");
		System.out.println("FIrst element is : " + list.getFirst());
		list.addLast("Z2");
		System.out.println("Last Element is : " + list.getLast());

		System.out.println("Index of of A is : " + list.indexOf("A"));

		System.out.println(list.poll()); // returns and remove first element
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());// returns and remove last element

		Iterator<String> itr= list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		ListIterator<String> listItr = list.listIterator();
		while (listItr.hasNext()) {
			System.out.print(listItr.next() + " ");
		}

		System.out.println();
		while (listItr.hasPrevious()) {
			System.out.print(listItr.previous() + " ");
		}

	}

}
